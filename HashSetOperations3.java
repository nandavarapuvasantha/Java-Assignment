import java.util.HashSet;

public class HashSetOperations3 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruitSet = new HashSet<>();

        // Add elements to the HashSet
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Cherry");
        fruitSet.add("Date");
        fruitSet.add("Elderberry");
        fruitSet.add("Fig");
        fruitSet.add("Grape");
        fruitSet.add("Honeydew");
        fruitSet.add("Indian Fig");
        fruitSet.add("Jackfruit");

        // Print HashSet details
        System.out.println("Size of HashSet: " + fruitSet.size());
        System.out.println("Elements in the HashSet:");
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }

        // Check if an element is present
        boolean containsApple = fruitSet.contains("Apple");
        System.out.println("Does the HashSet contain 'Apple'? " + containsApple);

        // Remove an element
        fruitSet.remove("Date");
        System.out.println("HashSet after removing 'Date': " + fruitSet);

        // Check if the HashSet is empty
        boolean isEmpty = fruitSet.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);

        // Clear all elements
        fruitSet.clear();
        System.out.println("HashSet after clearing all elements: " + fruitSet);
    }
}