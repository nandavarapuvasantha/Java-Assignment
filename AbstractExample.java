
abstract class AbstractExample {

    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method from AbstractExample.");
    }

    public static void main(String[] args) {
        System.out.println("An abstract class cannot be instantiated directly.");
    
    }
}

