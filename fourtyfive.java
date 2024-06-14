public class fourtyfive {
    
    public static int getReverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    public static int getSquare(int number) {
        return number * number;
    }

    public static boolean number(int number) {
        int squareOriginal = getSquare(number);
        int reversedNumber = getReverse(number);
        int squareReversed = getSquare(reversedNumber);
        
        return getReverse(squareOriginal) == squareReversed;
    }

    public static void main(String[] args) {
        System.out.println(number(121));
    }
}

