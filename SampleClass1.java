//1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method. 
public class SampleClass1 {
    static int staticVar1 = 10;
    static int staticVar2 = 20;
    int instanceVar1 = 30;
    int instanceVar2 = 40;
    
    static void staticMethod1() {
        System.out.println("Static Method 1");
    }
    
    static void staticMethod2() {
        System.out.println("Static Method 2");
    }
    
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }
    
    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }
    
    public static void main(String[] args) {
        staticMethod1();
        staticMethod2();
        
        SampleClass1 obj = new SampleClass1();
        obj.instanceMethod1();
        obj.instanceMethod2();
        
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }
}
