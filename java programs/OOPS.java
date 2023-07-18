class Pen {
    String color; // class
    String type;
    public void write(){
        System.out.println("Pen details");
    }
    public void details(){
        System.out.println("Pen color is");
        System.out.println(this.color); 
        System.out.println("Pen type is");
      System.out.println(this.type);
    }

   


   
   Pen(String color , String type) {   // constructor 
    this.color = color;
    this.type = type;
}
Pen() {

}


   }
    

public class OOPS{
    public static void main(String args[]){

        Pen pen1 = new Pen("blue","ball"); // constructor // objects. s
        pen1.write();
        pen1.details();
        Pen pen2 = new Pen("red","gel"); // objects. 
        pen2.write();
        pen2.details();
        Pen pen3 =  new Pen("black","ball");
        pen3.write();
        pen3.details(); 
        Pen pen4 = new Pen("green","Ink"); 
        pen4.write();
        pen4.details();
      

    
} 

}