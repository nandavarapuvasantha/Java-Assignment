interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyClass4 implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Method A Implemented");
    }
    
    @Override
    public void methodB() {
        System.out.println("Method B Implemented");
    }
    
    public static void main(String[] args) {
        MyClass4 obj = new MyClass4();
        obj.methodA();
        obj.methodB();
    }
}
