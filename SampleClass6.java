//6. Print all the static, instance variables in main method
public class SampleClass6 {
    static int staticVar1 = 10;
    static int staticVar2 = 20;
    int instanceVar1 = 30;
    int instanceVar2 = 40;
    
    public static void main(String[] args) {
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
        
        SampleClass6 obj = new SampleClass6();
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }
}