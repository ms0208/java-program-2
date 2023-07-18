import java .util .Scanner;
class Election {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = Sc.nextInt();
        if(a>= 18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not Eligible for vote");
        }
    }
};