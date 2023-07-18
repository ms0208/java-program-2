import java .util .Scanner;
class Marks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int x = sc.nextInt();
        if(x<=100 &&x>=90){
            System.out.println("PCM");
        }
        else if(x<=89 && x>=80){
            System.out.println("PCB");
        }
        else if(x<=79 && x>=70){
        System.out.println("Commerce with maths");
    }
    else if(x<=69 && x>=60){
        System.out.println("Commerce without maths");
    }
    else if(x<=59 && x>=40){
        System.out.println("Humanities");
    }
    else if(x<=39 && x>=0){
        System.out.println("Fail");
    }
    else {
        System.out.println("Invalide Marks");
    }


}

}