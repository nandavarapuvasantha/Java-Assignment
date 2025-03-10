class CurrentClass1 {
    int a = 10;
    String name = "Java";

    // Method to print fields using 'this'
    void printFields() {
        System.out.println("a = " + this.a);
        System.out.println("name = " + this.name);
    }

    // Method to print fields without using 'this'
    void printFieldsWithoutThis() {
        System.out.println("a = " + a);
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        CurrentClass1 obj = new CurrentClass1();
        obj.printFields();             // Using 'this'
        obj.printFieldsWithoutThis();  // Without using 'this'
    }
}