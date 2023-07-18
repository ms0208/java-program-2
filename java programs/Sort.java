import java.util.Arrays;
class Sort{
    public static void main(String args[]){
        int[] marks = new int[3];
        marks[0] = 78;
        marks[1] = 89;
        marks[2] = 77;
       System.out.println(marks[0]);
       Arrays.sort(marks);
        System.out.println(marks[0]); 
        for(int i=0 ; i<3; i++) {
                System.out.println(marks[i]);
               
        }
        
      
    }
}