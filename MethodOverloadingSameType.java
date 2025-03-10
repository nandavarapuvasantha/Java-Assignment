

class MethodOverloadingSameType {
    void display(int a) {
        System.out.println("Method with 1 parameter: " + a);
    }

    void display(int a, int b) {
        System.out.println("Method with 2 parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        MethodOverloadingSameType obj = new MethodOverloadingSameType();
        obj.display(10);
        obj.display(20, 30);
    }
}

