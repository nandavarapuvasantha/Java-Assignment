public class StringMatches {
    public static void main(String[] args) {
        String str = "Hello123";
        
        // Matching the string against a regular expression
        boolean isMatch = str.matches("[A-Za-z0-9]+");
        
        System.out.println("String matches pattern: " + isMatch);
    }
}

