public class EvenOddSwitch {
    public static void main(String[] args) {
        int number = 10;
        switch (number % 2) {
            case 0 :  System.out.println(number + " is Even.");
            break;
            case 1 :  System.out.println(number + " is Odd.");
            break;
        }
    }
}

