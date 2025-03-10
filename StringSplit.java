public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        
        // Splitting the string
        String[] words = str.split(",");
        
        for (String word : words) {
            System.out.println(word);
        }
    }
}
