 /*   // using linked list,
  public class StackClass  {
    static class Node {
        int data;
        Node next;
       public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }
        public static void push(int data) {
            Node newnode = new Node(data);
            if(isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode; 
        } 
        public static int pop() {
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

            
        }
        public static void main(String args[]) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            while(!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }

            
        }

         
    }   */
 /*    // using array list 
import java.util.ArrayList;

    
    public  class StackClass {
      static   class Stack  { 
            
           static ArrayList<Integer>mylist=new ArrayList<>(); 
           public static boolean isEmpty(){
            return mylist.size() == 0; 
           }
        }
        // push 
        public static void push(int data){ 
            Stack.mylist.add(data);

        }
        // pop 
        public static int pop(){
            if(Stack.isEmpty()){
                return -1;
            }
            int top = Stack.mylist.get(Stack.mylist.size()-1); 
            Stack.mylist.remove(Stack.mylist.size()-1);
            return top;
        }
        // peek 
        public static int peek() {
            if(Stack.isEmpty()) {
                return -1;
            }
            return Stack.mylist.get(Stack.mylist.size()-1);
        }
        public static void main(String args[]){
         Stack  s =  new Stack();
       
            Stack s1;push(1);
            
            Stack s2;push(2);
            
           Stack  s3;push(3); 

            Stack s4;push(4);

            Stack s5;push(5);

          while(!s.isEmpty()) {
                System.out.println(peek());
               Stack  s6;pop();
            } 
        }
    }  */

//  push element in bottom in stack 
  import java.util.*; 
public class StackClass { 
    static ArrayList<Integer> s = new ArrayList<>();
    public static boolean isEmpty(){
        return s.size() == 0; 
       }
    public static void pushAtBottom(int data , Stack<Integer> s) {
        if(s.isEmpty()){
            s.push(data);
            return;
        } 
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);   
    }
    // revese  in stack 
    public static void reverse( Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top,s);

    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3); 
    

        reverse(s);

         pushAtBottom(4, s); 

         reverse(s);
         
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        } 



    

        
    
    }
    }

  

    

    
      
