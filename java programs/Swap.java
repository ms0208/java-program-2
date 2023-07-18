import java.util.Scanner;
class Swap{
    public static void main(String[] args){
        Scanner sp1 = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter number 1");
        a = sp1.nextInt();
        System.out.println("Enter number 2");
        b = sp1.nextInt();
        System.out.println("value of a "  +a+  "  value of b " +b);
         c=a;
         a=b;
         b=c;
         System.out.println("value of a "  +a+  "  value of b " +b);   
        
    }

}