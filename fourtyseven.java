public class fourtyseven {

    public static int sumOfProperDivisors(int number) {
        if (number < 0) {
            return -2;
        }
        if (number == 0) {
            return -3;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return 0; 
        } else if (sum > number) {
            return 1;
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfProperDivisors(28));  
    }
}

