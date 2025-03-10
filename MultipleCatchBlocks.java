

class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (Exception e) {
            System.out.println("Generic Exception caught");
        }
    }
}

