

class MethodThrowsException {
    static void throwException() throws ArithmeticException {
        throw new ArithmeticException("Custom Exception Thrown");
    }

    public static void main(String[] args) {
        throwException(); 
    }
}

