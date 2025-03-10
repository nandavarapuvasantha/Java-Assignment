

import java.lang.reflect.*;

class Sample {
    public int x;
}

class NoSuchFieldExceptionExample {
    public static void main(String[] args) {
        try {
            Field field = Sample.class.getDeclaredField("y"); // 'y' does not exist
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught");
        }
    }
}

