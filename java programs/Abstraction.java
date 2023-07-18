// Abstraction 
abstract class Vehicle {
   abstract void start();
}
class car extends Vehicle {
    void start(){
        System.out.println("Start by Key");
    }

}
class Bike extends Vehicle {
    void start(){
        System.out.println("Start by Selfstarting or kick ");
    }
}
public class Abstraction {
    public static void main(String[] args){
        car c1 = new car();
        c1.start();
        Bike b1 = new Bike();
        b1.start();
    }
}