public interface MyInterface {
    int VALUE1 = 10;
    int VALUE2 = 20;
    
    void displayValues();
}

class MyClass8 implements MyInterface {
    @Override
    public void displayValues() {
        System.out.println("Value 1: " + VALUE1);
        System.out.println("Value 2: " + VALUE2);
    }
    
    public static void main(String[] args) {
        MyClass8 obj = new MyClass8();
        obj.displayValues();
    }
}
