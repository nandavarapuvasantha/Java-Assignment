
class ChildCallNonAbstract extends AbstractExample {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in ChildCallNonAbstract.");
    }

    public static void main(String[] args) {
        ChildCallNonAbstract obj = new ChildCallNonAbstract();
        obj.nonAbstractMethod();
    }
}

