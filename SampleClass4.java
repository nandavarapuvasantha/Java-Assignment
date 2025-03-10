//4. Call instance methods in static methods 
public class SampleClass4 {
    static void staticMethod() {
        System.out.println("Static method called");
        SampleClass4 obj = new SampleClass4();
        obj.instanceMethod();
    }
    
    void instanceMethod() {
        System.out.println("Instance method called");
    }
    
    public static void main(String[] args) {
        staticMethod();
    }
}

