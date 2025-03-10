

class MyCustomException extends Exception {
    MyCustomException(String message) {
        super(message);
    }
}

class CustomExceptionExample {
    public static void main(String[] args) throws MyCustomException {
        throw new MyCustomException("This is a custom exception");
    }
}

