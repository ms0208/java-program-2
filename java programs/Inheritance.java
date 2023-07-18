 // Inheritance concept.
 class Shape {
    String color;
    public void area() {
      System.out.println("display area of triangle");
    }
 }
 class triangle extends Shape {  // inheritance .  // single level inheritance.
   public void area (int l, int b){
      System.out.println((0.5)*l*b);
   }

 }
 class  Equilateraltriangle extends triangle {  // multilevel inheritance
 public void area (int l, int b){
      System.out.println((0.5)*l*b);
 }

 }
 class circle extends Shape {  //  heirarchial inheritance.
   public void area(int r){
      System.out.println((3.14)*r*r);
   }
 }
 public class Inheritance{
    public static void main(String args[]){
        triangle t1 = new triangle();
        t1.color = "red"; // show color inherit in triangle class.
        Shape s1 = new Shape();
        s1.area();
        t1.area(20,30);
        Equilateraltriangle Eq1 = new Equilateraltriangle();
        Eq1.area(40,50);
        circle c1 = new circle();
        c1.area(5);
        

    }
 }
