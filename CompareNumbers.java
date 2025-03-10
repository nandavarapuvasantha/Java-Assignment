public class CompareNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        int smaller = (a < b) ? a : b;
        int larger = (a > b) ? a : b;
        
        System.out.println("Smaller number: " + smaller);
        System.out.println("Larger number: " + larger);
    }
}
