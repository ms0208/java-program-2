import java.util.Scanner;
class SnakesandLadder {
    public static void main(String[] args){
        int i,a,b=0,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Snakes and Ladder");
        for(i=1;i<100 && b<100 && c<100;i++){
            System.out.println("Enter the dice number between 1 to 6 ");
             a = sc.nextInt();
             if(i % 2 !=0){
                b = b+a;
                if(b==4){
                    b=36;
                }
                if(b==21){
                    b=45;
                }
                if(b==61){
                    b=87;
                }
                if(b==38){
                    b=97;
                }
                if(b==18){
                    b=5;
                }
                if(b==42){
                    b=19;
                }
                if(b==85){
                    b=65;
                }
                if(b==98){
                    b=10;
                }
                System.out.println("Player 1 turn " +b);
                System.out.println("Player 2 turn " +c);
             }
             if(i % 2 ==0){
                
                c = c+a;
                if(c==4){
                    c=36;
                }
                if(c==21){
                    c=45;
                }
                if(c==61){
                    c=87;
                }
                if(c==38){
                    c=97;
                }
                if(c==18){
                    c=5;
                }
                if(c==42){
                    c=19;
                }
                if(c==85){
                    c=65;
                }
                if(c==98){
                    c=10;
                }
                System.out.println("Player 2 turn"+c);
                System.out.println("Player 1 turn"+b);

             }
        }
        if(b>c){
            System.out.println("Player 1 wins");
        }
       else  if(c==b){
        System.out.println("Player 1 and Player 2 wins");

       }
       else{
        System.out.println("Player 2 wins");
       }

    }
}