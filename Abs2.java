abstract class Abs2 {
    abstract void draw();  // Abstract method

    void description() {  // Non-abstract method
        System.out.println("This is a shape.");
    }

    // Main method inside the abstract class
    public static void main(String[] args) {
        // Create an object of Circle (which is a subclass of Abs2)
        Abs2 shape = new Circle();  // Polymorphism

        // Call the abstract method (implemented in Circle)
        shape.draw();
        
        // Call the non-abstract method (inherited from Abs2)
        shape.description();
    }
}

class Circle extends Abs2 {
    // Implementing the abstract method draw() in the subclass
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
