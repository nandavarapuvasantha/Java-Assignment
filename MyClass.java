
interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Method Implemented");
    }
    
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}