public class twentyeight {

    public static String getPrimeNumbers(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            return "-1";
        }
        if (num1 >= num2) {
            return "-2";
        }
        String result = "";
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += i;
            }
        }

        return result;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) {
        System.out.println(getPrimeNumbers(10, 20));  
    }
}

