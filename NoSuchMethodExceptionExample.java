

import java.lang.reflect.*;

class Sample {
    public void display() {}
}

class NoSuchMethodExceptionExample {
    public static void main(String[] args) {
        try {
            Method method = Sample.class.getDeclaredMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught");
        }
    }
}

