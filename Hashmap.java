import java.util.*;
public class Hashmap {

 public static void main(String args[]){
 // country -> key & popultion -> value
 HashMap<String, Integer> map = new HashMap<>();
 // Insertion 
 map.put("India",120);
 map.put("USA",30);
 map.put("China",150);

 System.out.println(map);
// IT is unordermap.
map.put("China",180);

System.out.println(map);
// Search 
if(map.containsKey("China")) {
    System.out.println("Key is exist");
}else {
    System.out.println("Key is not exist");

}
// Value of key print.
System.out.println(map.get("China"));
System.out.println(map.get("Indonasia"));
// iteraton 
int arr[] = {12,15,18};
for(int i=0;i<3;i++){
    System.out.println(arr[i]);

}
System.out.println();
for(int val : arr){
    System.out.println(val);
}
for(Map.Entry<String,Integer> e: map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue()); 
}
Set<String> keys = map.keySet();
for(String key : keys){

System.out.println(key+ " " + map.get(key));
}
map.remove("China");
System.out.println(map);
Set<String> keys2 = map.keySet();
for(String key : keys2){

System.out.println(key+ " " + map.get(key));
}
 
   }
}   