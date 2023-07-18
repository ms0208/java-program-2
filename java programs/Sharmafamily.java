import java.util.Scanner;
class Sharmafamily {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String Member[] = new String[4]; 
        System.out.println("Enter family member");
        for(int i=0 ; i<4 ; i++) { 
            Member[i] = sc.nextLine();

        }
        System.out.println("Family member is");
        for(int i=0; i<4 ; i++) {
            System.out.println(Member[i]);
        }
    }
}