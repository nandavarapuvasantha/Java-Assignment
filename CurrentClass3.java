class CurrentClass3 {
    int a;

    // Constructor with a parameter
    CurrentClass3(int a) {
        this.a = a;
        System.out.println("Constructor with parameter called: a = " + a);
    }

    // Default constructor using 'this()' to call the parameterized constructor
    CurrentClass3() {
        this(10);  // Calling parameterized constructor with a default value
        System.out.println("Default constructor called");
    }

    public static void main(String[] args) {
        CurrentClass3 obj = new CurrentClass3();  // This will call the default constructor
    }
}