import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations1 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");
        list.add("Kiwi");

        // Iterate through the ArrayList using Iterator
        System.out.println("Iterating through ArrayList using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Perform ArrayList operations
        list.add(2, "Cantaloupe");
        list.remove("Date");
        list.remove(4);
        list.set(0, "Apricot");

        // Check element at index
        System.out.println("Element at index 3: " + list.get(3));

        // Get ArrayList size
        System.out.println("Size of ArrayList: " + list.size());

        // Check if element is present
        boolean containsGrape = list.contains("Grape");
        System.out.println("Is 'Grape' present in ArrayList? " + containsGrape);

        // Clear ArrayList
        list.clear();
        System.out.println("ArrayList after removing all elements: " + list);
    }
}