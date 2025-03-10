public class StringTrim {
    public static void main(String[] args) {
        String str = "   Hello World   ";
        
        // Trimming the string
        String trimmedStr = str.trim();
        
        System.out.println("Original String: '" + str + "'");
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}
