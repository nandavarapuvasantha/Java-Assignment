class CurrentClass4 {
    int a;
    String name;

    // Constructor with arguments
    CurrentClass4(int a, String name) {
        this.a = a;
        this.name = name;
        System.out.println("Constructor with arguments called: a = " + a + ", name = " + name);
    }

    // Constructor with default arguments using 'this()'
    CurrentClass4() {
        this(10, "Default Name");  // Calling constructor with arguments
        System.out.println("Default constructor called");
    }

    public static void main(String[] args) {
        CurrentClass4 obj = new CurrentClass4();  // Calls default constructor
    }
}