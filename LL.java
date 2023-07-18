 // Linked list by scratch 
class LL{ 
    private int size; 
    LL() {
        this.size = 0;
    }
    Node  head;
    class Node {  // node class
        String data;
        Node next; 
        

        Node(String data){  // node constructor 
            this.data = data;
            this.next = null;
            size++ ;
        }
    }
       // fist add in LL 
       public void addFirst(String data) { 
        Node newNode = new Node(data); 
        if(head == null) {
           head = newNode;
           return; 
        }
        newNode.next = head;
        head = newNode;

       }
       // last add in LL
        public void addLast(String data) { 
        Node newNode = new Node(data); 
        if(head == null) {
           head = newNode;
           return; 
        }
        Node currNode = head; 
        while(currNode.next != null ) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

       } 
       public void printlist() { 
        if(head == null) {
            System.out.println("List is empty");
            return ; 
        }
        Node newNode = head; 
        while(newNode != null ) {
            System.out.print(newNode.data + "->");
            newNode = newNode.next;
        }
        System.out.print("Null");


       } 
        public void deletefirst() { 
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;

       } 
       public void deletelast() {
        if(head == null) {
            System.out.println("List is empty");  
            return;
        
        }
        size--;
        if(head.next == null ) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next; 
        while(lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast= secondlast.next;
        }
        secondlast.next = null;
       }

       public int getsize() {
        return size;
       }
       public void reverseIterate() {
        if(head == null || head.next == null){
            return ;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode; 
            
            // update
            prevNode = currNode; 
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
       } 


    public static void main(String args[]) {
      LL list = new LL();
      list.addFirst("Great");
      list.addFirst("a");
      list.addFirst("is"); // linked list creat. 
      list.addFirst("Manav"); 
      list.printlist(); 
      System.out.println();

      list.addLast("boy");
      list.addFirst("A");
      list.printlist();
      System.out.println();

      list.deletefirst(); // delete first list.
      list.printlist();


     System.out.println();
      list.deletelast();
      list.printlist(); 
     list.addFirst("Pranav");
      System.out.println(); 
     list.printlist();
      System.out.println(); 
     System.out.println("Size of a linked list ");
     System.out.println(list.getsize());

     list.reverseIterate();
     list.printlist();
    }
}