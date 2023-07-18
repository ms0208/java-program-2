import java .util.Scanner;  // scanner headings
class Addition {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in); // scanner class and object 
        System.out.println("Enter a number 1");
        int a = sc.nextInt(); // input scannar
        System.out.println("Enter a number 2");
        int b = sc.nextInt();
        System.out.println("Sum is");
        System.out.println(a+b);
        

    }
};