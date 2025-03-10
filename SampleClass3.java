//3. Print static variables in Instance methods 
public class SampleClass3 {
    static int staticVar1 = 10;
    static int staticVar2 = 20;
    
    void instanceMethod() {
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }
    
    public static void main(String[] args) {
        SampleClass3 obj = new SampleClass3();
        obj.instanceMethod();
    }
}

