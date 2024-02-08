import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class hashmap {

    public static void main(String[] args) {
        HashMap<String,Integer> hash =new HashMap<>();
        hash.put("kunal", 99);
        hash.put("arjita", 77);
        System.out.println((hash.get("kunal")));
        System.out.println((hash.containsKey("kunal")));


        HashSet<Integer> set = new HashSet<>();
        TreeMap<String,Integer> tree = new TreeMap<>();        
    }
}
