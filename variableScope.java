//5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables
public class variableScope{

    // Global variable (instance variable)
    int number = 10; // This is a global variable

    public void displayNumbers() {
        // Local variable with the same name as the global variable
        int number1 = 20; // This is a local variable

        // Print both variables
        System.out.println("Local variable number: " + number1); // Refers to the local variable
        System.out.println("Global variable number: " + this.number); // Refers to the global variable
    }

    public static void main(String[] args) {
        variableScope example = new variableScope();
        example.displayNumbers(); // Call the method to display the numbers
    }
}
