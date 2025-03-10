

class MethodSameNameSameParams {
    void display(int a) {
        System.out.println("First display method: " + a);
    }

    public static void main(String[] args) {
        MethodSameNameSameParams obj = new MethodSameNameSameParams();
        obj.display(10);
    }
}

