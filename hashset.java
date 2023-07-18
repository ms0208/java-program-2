import java.util.HashSet;
import java.util.Iterator;
public class hashset {  

    public static void main(String arg[]){  
        HashSet<Integer> set = new HashSet<>();
        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);  
        // Search - contins 
        if(set.contains(1)) {
            System.out.println("1 is exist ");
        }
        if(!set.contains(6)){
            System.out.println("Does not exist");
             
        }
        // Delete 
        set.remove(1); 
        if(set.contains(1)){
            System.out.println("1 is exist");
        }else {
            System.out.println("1 is not exist");
        }
        System.out.println("Size of set is " + set.size());
        System.out.println(set); 

        // iterator 
        Iterator it = set.iterator();
        // hastnext 
       while(it.hasNext())  {
           System.out.println(it.next()); 
       } 
 // in hash set it is not guranted that elemenet are store in same 
 // that we add it may rondom also  checking by iteration.



    }

}