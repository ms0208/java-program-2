 import java.util.Scanner;
class Vicecity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the vice city mission");
        n = sc.nextInt();
        if(n==1 && n<=6){
            System.out.println("Ken Rosenberg mission");
        }
        else if( n>6 && n<=8 || n==16){

            System.out.println("Avery carrington mission");

        }
    
        else if(n>8 && n<=11 || n==17 || n==20){
            System.out.println("Cornell Cortez mision");
        }
    
        else if(n>12 && n<=15){
            System.out.println("Recardo diaz mission");
        }
        else if(n==18){
            System.out.println("Kent paul mission");
        }
        else if(n==19){
            System.out.println("Lance mission");
        }
        else if(n>20 && n<=23){
            System.out.println("Vercetti estate mission");
        }
        else if(n>23 && n<=26 || n==30){
            System.out.println("Umberto robina mission");
        }
        else if(n>26 && n<=29){
            System.out.println("Aunty poulet mission");
        }
        else if(n>30 && n<=32 || n==36){
            System.out.println("Love fist mission");
        }
        else if(n>32 && n<=35){
            System.out.println("Mitch baker mission");
        }
        else if(n>35 && n<=39){
            System.out.println("Maliba Club mission");
        }
        else if(n>39 && n<=41){
            System.out.println("Phil cassedy mission");
        }
        else if(n>41 && n<=45){
            System.out.println("Film studio mission");
        }
        else if(n==46){
            System.out.println("Pole position club mission");
        }
        else if(n>46 & n<=49){
            System.out.println("Caufman Cab mission");
        }
        else if(n==50){
            System.out.println("Sunshine autuos mission");
        }
        else if(n==51){
            System.out.println("Boatyard mission");
        }
        else if(n==52){
            System.out.println("Cherry ice cream mission");
        }
        else if(n>52 && n<=55){
            System.out.println("Print work mission");
        }
        else if(n==56){
            System.out.println("Keep your friend close END MISSION");
        }
        else{
            System.out.println("No mission");
        }



    

}
}