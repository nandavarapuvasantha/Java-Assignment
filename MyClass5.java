interface InterfaceA {
    void commonMethod();
}

interface InterfaceB {
    void commonMethod();
}

class MyClass5 implements InterfaceA, InterfaceB {
    @Override
    public void commonMethod() {
        System.out.println("Common Method Implemented");
    }
    
    public static void main(String[] args) {
        MyClass5 obj = new MyClass5();
        obj.commonMethod();
    }
}
