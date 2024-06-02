import java.util.*;
public class Itinerary{
    public static String getStart(HashMap<String,String>ticket){
        
        HashMap<String,String>revTicket = new HashMap<>();
         
        for(String key: ticket.keySet()){
         revTicket.put(revTicket.get(key),key);
        }
            //find start city 
        for(String key : ticket.keySet()){
            if(!revTicket.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
    HashMap<String,String> ticket = new HashMap<>();
    ticket.put("chennai","banglore");
    ticket.put("mumbai","delhi");
    ticket.put("goa","chennai");
    ticket.put("delhi","goa");

    String start = getStart(ticket);
    // print start 
    System.out.print(start);
   //now move to destination from start
   for(String key : ticket.keySet()){
    System.out.print("->"+ticket.get(start));
    start = ticket.get(start);
   }    
    }
}