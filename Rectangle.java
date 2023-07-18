import java.util.Scanner;
class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // object for input.
        Rectangle obj1 = new Rectangle(); // object for return value.
        Rectangle obj2 = new Rectangle();
       System.out.println("Enter a length"); 
        int a = sc.  nextInt();
        System.out.println("Enter a breath"); 
        int b = sc.  nextInt();
        System.out.println("Perimeter of rectangle is:");
       int get_result1 = obj1.perimeter(a,b);
        System.out.println(get_result1);
        System.out.println("Area of rectangle is:");
        int get_result2 = obj1.area(a,b);
        System.out.println(get_result2);
        
        


    }
    public static int perimeter(int a,int b){
        int result = 2*(a+b);
        return result;
    }
    public static int area(int a,int b){
        int result = a*b;
        return result;
    }
}