public interface MyInterface1 {
    static final int VALUE1 = 10;
    static final int VALUE2 = 20;
    
    void displayValues();
}

class MyClass11 implements MyInterface1 {
    @Override
    public void displayValues() {
        System.out.println("Value 1: " + VALUE1);
        System.out.println("Value 2: " + VALUE2);
    }
    
    public static void main(String[] args) {
        MyClass11 obj = new MyClass11();
        obj.displayValues();
    }
}
