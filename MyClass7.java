interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class MyClass7 implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Parent Method Implemented");
    }
    
    @Override
    public void childMethod() {
        System.out.println("Child Method Implemented");
    }
    
    public static void main(String[] args) {
        MyClass7 obj = new MyClass7();
        obj.parentMethod();
        obj.childMethod();
    }
}
