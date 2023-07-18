import java.util.Scanner;
class BSES{
    public static void main(String args[]){
        int V,S,P;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phase ");
        P = sc.nextInt();
        System.out.println("Enter the Volt ");
        V = sc.nextInt();
        System.out.println("Enter the Switch ");
        S = sc.nextInt();
        if(P==1){
            if(V==220){
                switch(S){
                   case 1: System.out.println("Fan switch ");
                    break;
                  case 2:  System.out.println("tubelight switch ");
                    break;
                    case 3:  System.out.println("Bulb switch ");
                    break;
                    default: System.out.println("No switch");
                    break;
                    
                }
            }
        }
        if(P==3){
            if(V==440){
                switch(S){
                   case 1: System.out.println("AC Switch");
                    break;
                  case 2:  System.out.println("Refrigerator switch ");
                    break;
                    case 3:  System.out.println("TV switch ");
                    break;
                    default: System.out.println("No switch");
                    break;
                }
            }
        }


    }
}