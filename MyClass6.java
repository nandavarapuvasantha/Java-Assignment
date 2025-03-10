interface MyInterface1 {
    default void defaultMethod() {
        System.out.println("Default Method Called");
    }
}

class MyClass6 implements MyInterface1 {
    @Override
    public void defaultMethod() {
        MyInterface1.super.defaultMethod();
    }

    public static void main(String[] args) {
        MyClass6 obj = new MyClass6();
        obj.defaultMethod();
    }
}

