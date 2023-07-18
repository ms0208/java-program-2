import java .util.Scanner;
class Mensuration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Mensuration obj = new Mensuration();

         System.out.println("Enter number a");
         int a = sc.nextInt();
         System.out.println("Enter number b");
         int b = sc.nextInt();
        
       int  get_result = obj.area(a,b);
        System.out.println(get_result);


    }
    public static int area(int a,int b){
        int result = a*b;
        return result;
    }

}