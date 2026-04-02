import java.util.*;

public class CollectionCRUD {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        list.add("Dave");
        System.out.println("Read: " + list.get(1));
        list.set(1, "Bobby");
        list.remove("Charlie");
        System.out.println("ArrayList: " + list);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Maths");
        map.put(2, "Science");
        map.put(3, "English");
        System.out.println("Get 2: " + map.get(2));
        map.put(2, "Physics");
        map.remove(3);
        System.out.println("HashMap: " + map);

        TreeMap<String, Integer> tree = new TreeMap<>();
        tree.put("Banana", 2);
        tree.put("Apple", 5);
        tree.put("Cherry", 3);
        System.out.println("TreeMap (sorted): " + tree);
    }
}
