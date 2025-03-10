public class StringCreation {
    public static void main(String[] args) {
        // Using string literal
        String str1 = "Hello";
        
        // Using new keyword
        String str2 = new String("World");
        
        // Using StringBuilder
        StringBuilder str3 = new StringBuilder("Java");
        
        // Using StringBuffer
        StringBuffer str4 = new StringBuffer("Programming");
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
    }
}
