class ParentClass6 {
    void printMessage() {
        System.out.println("Message from Parent Class");
    }
}

class CurrentClass6 extends ParentClass6 {
    void printMessage() {
        super.printMessage();  // Call the parent class method
        this.printCurrentClassMessage();  // Call the current class method
    }

    void printCurrentClassMessage() {
        System.out.println("Message from Current Class");
    }

    public static void main(String[] args) {
        CurrentClass6 obj = new CurrentClass6();
        obj.printMessage();  // Calls method in current class which uses both super and this
    }
}