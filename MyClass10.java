abstract class MyAbstractClass {
    private final int privateValue = 10;
    protected int protectedValue = 20;
    public int publicValue = 30;

    public void displayValues() {
        System.out.println("Private Value: " + privateValue);
        System.out.println("Protected Value: " + protectedValue);
        System.out.println("Public Value: " + publicValue);
    }
}

class MyClass10 extends MyAbstractClass {
    public static void main(String[] args) {
        MyClass10 obj = new MyClass10();
        obj.displayValues();
    }
}
