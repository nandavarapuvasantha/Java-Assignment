//7. Call static methods and instance methods in main method 
public class SampleClass7 {
    static void staticMethod() {
        System.out.println("Static Method Called");
    }
    
    void instanceMethod() {
        System.out.println("Instance Method Called");
    }
    
    public static void main(String[] args) {
        staticMethod();
        
        SampleClass7 obj = new SampleClass7();
        obj.instanceMethod();
    }
}
