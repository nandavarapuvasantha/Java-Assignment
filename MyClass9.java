class OuterClass {
    protected interface MyInterface {
        int VALUE1 = 10;
        int VALUE2 = 20;
        
        void displayValues();
    }
}

class MyClass9 implements OuterClass.MyInterface {
    @Override
    public void displayValues() {
        System.out.println("Value 1: " + VALUE1);
        System.out.println("Value 2: " + VALUE2);
    }
    
    public static void main(String[] args) {
        MyClass9 obj = new MyClass9();
        obj.displayValues();
    }
}
