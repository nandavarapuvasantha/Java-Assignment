//2. Print instance variables in static methods
public class SampleClass2 {
    int instanceVar1 = 30;
    int instanceVar2 = 40;
    
    static void staticMethod() {
        SampleClass2 obj = new SampleClass2();
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }
    
    public static void main(String[] args) {
        staticMethod();
    }
}
