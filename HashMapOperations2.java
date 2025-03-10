import java.util.HashMap;
import java.util.Map;

class HashMapOperations2 {
    public static void main(String[] args) {
        // Create a HashMap with Student ID as key and Student Name as value
        Map<Integer, String> studentMap = new HashMap<Integer, String>();
        
        // Insert key-value pairs into the map
        studentMap.put(101, "John");
        studentMap.put(102, "Jane");
        studentMap.put(103, "Alice");
        studentMap.put(104, "Bob");
        studentMap.put(105, "Charlie");
        studentMap.put(106, "David");
        studentMap.put(107, "Eve");
        studentMap.put(108, "Frank");
        studentMap.put(109, "Grace");
        studentMap.put(110, "Hank");

        // Fetch the value of a key
        System.out.println("Value for key 103: " + studentMap.get(103));

        // Create a clone/copy of HashMap
        Map<Integer, String> clonedMap = new HashMap<>(studentMap);
        System.out.println("Cloned Map: " + clonedMap);

        // Check if the given key is in the map
        boolean containsKey = studentMap.containsKey(105);
        System.out.println("Does the map contain key 105? " + containsKey);

        // Check if the value is in the map
        boolean containsValue = studentMap.containsValue("Alice");
        System.out.println("Does the map contain value 'Alice'? " + containsValue);

        // Check if the map is empty
        System.out.println("Is the map empty? " + studentMap.isEmpty());

        // Print the size of the map
        System.out.println("Size of the map: " + studentMap.size());

        // Print all the keys of the map
        System.out.println("Keys in the map:");
        for (Integer key : studentMap.keySet()) {
            System.out.println(key);
        }

        // Print all the values of the map
        System.out.println("Values in the map:");
        for (String value : studentMap.values()) {
            System.out.println(value);
        }

        // Remove a specific key-value pair
        studentMap.remove(107);
        System.out.println("Map after removing key 107: " + studentMap);

        // Copy all elements of the map to another map
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("Another map after copying: " + anotherMap);
    }
}