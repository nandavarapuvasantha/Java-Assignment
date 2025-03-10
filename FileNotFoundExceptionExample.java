

import java.io.*;

class FileNotFoundExceptionExample {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("nonexistent.txt");
    }
}

