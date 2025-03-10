interface MyInterface {
    void myMethod1();
    void myMethod2();
}

abstract class MyClass2 implements MyInterface {
    @Override
    public void myMethod1() {
        System.out.println("Method 1 Implemented");
    }
}

class SubClass extends MyClass2 {
    @Override
    public void myMethod2() {
        System.out.println("Method 2 Implemented");
    }
    
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.myMethod1();
        obj.myMethod2();
    }
}
