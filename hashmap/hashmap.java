package hashmap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class hashmap {

    public static void main(String[] args) {
        HashMap<String,Integer> hash =new HashMap<>();

        //put
        hash.put("kunal", 99);
        hash.put("arjita", 77);
        System.out.println((hash.get("kunal")));

        //get
        hash.get("arjita");
        hash.get("ishan"); //return null value

        //containsKey check in key exist or not
        System.out.println((hash.containsKey("kunal")));

        //remove key and value pair
        //hash.remove("arjita");


        //size of map
        hash.size();

        //empty hashmap
        hash.isEmpty();

        //clearthe whole  hashmap

        //hash.clear();

        //iteration on hashmap
        Set<String> keys = hash.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("keys="+k+ ",value="+hash.get(k));
        }
        //doubly linked list is used in linked hashmap 
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("india", 32);
        lhm.put("china", 88);

        HashSet<Integer> set = new HashSet<>();

        //sorted keys in treeemap tc=logn
        //using red black tree
        TreeMap<String,Integer> tree = new TreeMap<>();       
        tree.put("India", 65);
        tree.put("china", 76);

    }
}
