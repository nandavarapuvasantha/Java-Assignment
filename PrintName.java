//6. Write a function to print your name and call the function from main method
public class PrintName {

    // Function to print the name
    public void printName() {
        System.out.println("My name : Liharika"); // My Name
    }

    public static void main(String[] args) {
        // Create an instance of the PrintName class
        PrintName name = new PrintName();
        
        // Call the printName function
        name.printName(); // This will print the name
    }
}