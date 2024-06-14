public class fourtyfour {

    public static int countZeros(int number) {

        int num = number;
        if (num < 0) {
            num = -num; 
        }

        int count = 0;
        boolean isZero = false;

        if (num == 0) {
            return 1;
        }
        while (num != 0) {
            int digit = num % 10; 
            if (digit == 0) {
                count++;
            }
            num /= 10; 
        }

        return count;
    }

    public static void main(String[] args) {
        int input1 = 1234;
        System.out.println("Number of zeros in " + input1 + ": " + countZeros(input1));

    }
}
