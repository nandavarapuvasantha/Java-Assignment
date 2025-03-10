

class MethodSameParamsDifferentReturnType {
    int display(int a) {
        return a * 2;
    }

    public static void main(String[] args) {
        MethodSameParamsDifferentReturnType obj = new MethodSameParamsDifferentReturnType();
        int result = obj.display(10);
        System.out.println("Result: " + result);
    }
}

