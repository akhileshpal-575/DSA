public class CircularQueue {
    static class Queue{
      static int arr[];
      static int size;
      static int rear;
      static int front;
      Queue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
          }
          public static boolean isEmpty(){
            return rear==-1&&front==-1;
          }
          public static boolean isFull(){
            return (rear+1)%size == front;
          }
        public static void add(int data){  //O(1)
          if(isFull()){
            System.out.println("full");
            return ;
          }
          if(front == -1){
            front = 0; 
          }
          rear = (rear+1)%size;
          arr[rear] = data;
        }
        public static int remove(){ //O(1)
          if(isEmpty()){
            System.out.println("empty");
            return -1;
          }
          int result = arr[front];

          //last ele delete
          if(rear == front ){
            rear = front = -1;
          }else{
            front = (front+1)%size;
            }
          return result;
        }
        public static int peek(){
         if(isEmpty()){
          System.out.println("empty");
          return -1;
         }
          return arr[front];
        }
        }
    public static void main(String[] args) {
      Queue q = new Queue(5);
      q.add(4);
      q.add(54);
      q.add(64);
      while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
      }
  
    }
}
