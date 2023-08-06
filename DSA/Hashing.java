import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 159);

        System.out.println(map);


        //Search or Lookup
      /* if(map.containsKey("China")) {
            System.out.println("Key is present in the map");
        } else{
            System.out.println("Key is not present in the map");
        }*/

        
        //Get 
        /*System.out.println(map.get("China"));  //key exists
        System.out.println(map.get("Japan"));  //key doesn't exists*/
        

        int arr[] = {12,15,18};
        for(int i=0;i<3;i++) {
                System.out.println(arr[i]+" ");
        }
        System.out.println();
         for(int val : arr) {
            System.out.println(val +" ");
         }
         System.out.println();

        //Syntax:- Map.Entry<Integer,Integer> e:Map.entrySet()
         for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
