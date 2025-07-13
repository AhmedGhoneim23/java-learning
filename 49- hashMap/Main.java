import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 1.4);
        map.put("banana", 1.8);
        map.put("orange", 1.2);
        map.put("pineapple", 1.7);

        map.remove("pineapple");
        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("pineapple"));
        System.out.println(map.containsValue(1.2));
        System.out.println(map.size());

        for (String key : map.keySet()){
            System.out.println(key + ": $" + map.get(key));
        }

        System.out.println(map);

    }

}
