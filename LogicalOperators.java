public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        
        // Logical AND
        if (a < b && b < c) {
            System.out.println("Both conditions are true (AND)");
        }
        
        // Logical OR
        if (a > b || b < c) {
            System.out.println("At least one condition is true (OR)");
        }
        
        // Logical NOT
        boolean isTrue = false;
        System.out.println("Logical NOT: " + (!isTrue));
    }
}
