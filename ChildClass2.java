class ParentClass2 {
    int parentField = 20;
    String parentName = "Parent";

    void printParentFields() {
        System.out.println("Parent field = " + parentField);
        System.out.println("Parent name = " + parentName);
    }
}

class ChildClass2 extends ParentClass2 {

    void printFieldsUsingSuper() {
        System.out.println("Parent field using super = " + super.parentField);
        System.out.println("Parent name using super = " + super.parentName);
    }

    public static void main(String[] args) {
        ChildClass2 obj = new ChildClass2();
        obj.printFieldsUsingSuper();
    }
}