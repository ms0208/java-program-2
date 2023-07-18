/* 
public class QueueY {
    static class Queue {
        static int arr[];
        static int size;
        static int rear= -1;
        Queue(int size){
            arr = new int [size];
            this.size = size;
        }
        public static boolean isEmpty() {
            return rear == -1;
        }
        // enqueue (add) 
        public static void add(int data) { 
            if(rear == size-1){
                System.out.println("Queue is Full");
                return;
            }
             rear++;
             arr[rear] = data;
            
        }
        // dequeue  (remove) 
        public static int remove(){ 
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
     }
     // peek 
     public static int peek(){ 
        if(isEmpty()){
            System.out.println("Queue is empty");
            return-1;
        }
        return arr[0];


     }

    }

    public static void main(String args[]){ 
        Queue q =  new  Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
    
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
       

    } 
} */ 
// Circular Queue in Array 
/* 
public class QueueY {
    static class  Queue {
        static int arr[];
        static int size;
        static  int rear = -1;
        static int front = -1;

        Queue(int size ) {
            arr = new int  [size];
            this.size = size;
        }
        public static boolean isEmpty() {
            return rear == -1 && front == -1;   
        }
        public static boolean isfull() {
            return (rear+1) % size == front;
        }
        // enqueue (add) 
        public static void add(int data) {
            if(isfull()) {
                System.out.println("Queue is full");
                return ;
            }
    

            
            // add first element change front index value  
            if(front == -1) {
                front = 0;
            }
            rear = (rear+1) % size; 
            arr[rear] = data;
        }
        // dequeue (remove) 
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            } 
            // single element statement 
            
             int result = arr[front];
            if(rear == front) {
                 rear = front =-1;
            } else {
                front = (front + 1) % size;
            }
              return result;
        

        }
    
        // peak 
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return  arr[front];
        }
    }
        public static void main(String args[]) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);  
        
             
            System.out.println(q.remove());
            q.add(6); 
            System.out.println(q.remove());
        
            q.add(7); 
            System.out.println(q.remove()); 
            q.add(8);
            System.out.println(q.remove());
            q.add(9);

            System.out.println(q.remove());
            q.add(10);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }

    }  */ 

// Queue used by linked list 
/* 
public  class QueueY { 
   static class Node {
        int data;
        Node next; 
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class Queue {  
        static Node head = null;
        static Node tail = null; 

        public static boolean isEmpty() {
            return head == null  &  tail == null; 
        }
        public static void add(int data) {
            Node newnode = new Node(data);
            if(tail == null) {
                tail = head = newnode;
                return ;
            }
        
            tail.next = newnode;
            tail = newnode;
        }
        public static int remove(){
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data; 
            if(head == tail) {
                tail =null;
            }
            head = head.next;
            return front;
        }
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return  head.data;
        }
    } 
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
      System.out.println(q.remove());
       q.add(7);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

    } */ 
// Queue used by two stack 
import java .util.*;
public class QueueY {
    static class Queue{
       static  Stack<Integer> s1 = new Stack<>(); 
       static  Stack<Integer> s2 = new Stack<>(); 

       public static boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
       }
       public static void add(int data) { 
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data); 
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }

       }
       public static int remove() {
          if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
          }
          return s1.pop();
       }
       public static int peek() { 
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
          }
          return s1.peek();

       }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}




































