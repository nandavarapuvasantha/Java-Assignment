abstract class Abs1 {
    abstract void sound();  // Abstract method
    
    void sleep() {  // Non-abstract method
        System.out.println("Sleeping...");
    }

    public static void main(String[] args) {
        Abs1 obj = new Abs1() {
            void sound() {
                System.out.println("Woof");
            }
        };
        
        obj.sound();
        obj.sleep();
    }
}