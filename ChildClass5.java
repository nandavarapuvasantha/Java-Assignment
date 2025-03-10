class ParentClass5 {
    int parentField;

    // Constructor of parent class
    ParentClass5(int value) {
        this.parentField = value;
        System.out.println("Parent constructor called, parentField = " + parentField);
    }
}

class ChildClass5 extends ParentClass5 {

    // Constructor of child class
    ChildClass5(int value) {
        super(value);  // Calling the parent class constructor
        System.out.println("Child constructor called");
    }

    public static void main(String[] args) {
        ChildClass5 obj = new ChildClass5(30);  // Calls both parent and child constructors
    }
}