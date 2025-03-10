public class StringComparison1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "World";
        
        // Comparing strings using equals()
        System.out.println("str1 equals str2: " + str1.equals(str2));
        
        // Comparing strings using equalsIgnoreCase()
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));
        
        // Checking if string starts with a specific prefix
        System.out.println("str1 starts with 'He': " + str1.startsWith("He"));
        
        // Checking if string ends with a specific suffix
        System.out.println("str1 ends with 'lo': " + str1.endsWith("lo"));
        
        // Comparing strings using compareTo()
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
    }
}
