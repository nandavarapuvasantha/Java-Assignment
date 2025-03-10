

class MethodOverloadingDifferentType {
    void display(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    void display(double b) {
        System.out.println("Method with double parameter: " + b);
    }

    public static void main(String[] args) {
        MethodOverloadingDifferentType obj = new MethodOverloadingDifferentType();
        obj.display(10);
        obj.display(15.5);
    }
}
 
