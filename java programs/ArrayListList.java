import java.util.ArrayList; 
import java.util.Collections;
class ArrayListList {
    public static void main(String args[]) {
        ArrayList<Integer>List = new ArrayList<Integer>(); 
        // Add elemnets
        List.add(2); 
        List.add(6); 
        System.out.println(List); 
         
        // get elements 
        int element1 = List.get(0);
        int element2 = List.get(1);
        System.out.println(element1);
        System.out.println(element2); 

        // Add element in between 
        List.add(1,16);
        System.out.println(List);  
        List.add(0,25);
        System.out.println(List); 

        //  set elements 
        List.set(3,22);
        System.out.println(List); 
        // remove elements 
        List.remove(2);
        System.out.println(List); 

        // Size 
       int size =  List.size(); 
       System.out.println(size); 

       // loops 
       for(int i = 0; i<List.size();i++) {
        System.out.println(List.get(i));
       }
       System.out.println(); 
       // collection 
       Collections.sort(List); 
       System.out.println(List);
        
       for(int i = 0; i<List.size();i++) {
        System.out.println(List.get(i));
       }
       System.out.println(); 


    }
}