class ChildAccessNonAbstract extends AbstractExample {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in ChildAccessNonAbstract.");
    }

    public static void main(String[] args) {
        ChildAccessNonAbstract obj = new ChildAccessNonAbstract();
        obj.nonAbstractMethod();
    }
}
