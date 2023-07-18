import java.util.Scanner;
class swapping{
    public static void main(String args[]){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a: ");
        a = sc.nextInt();
        System.out.println("Enter the value b: ");
        b = sc.nextInt();
        System.out.println("Before swapping "+a+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping "+a+" "+b);
    }
}