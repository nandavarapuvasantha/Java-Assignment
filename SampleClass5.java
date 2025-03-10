//5. Call static methods in instance methods 
public class SampleClass5 {
    static void staticMethod() {
        System.out.println("Static method called");
    }
    
    void instanceMethod() {
        System.out.println("Instance method called");
        staticMethod();
    }
    
    public static void main(String[] args) {
        SampleClass5 obj = new SampleClass5();
        obj.instanceMethod();
    }
}

