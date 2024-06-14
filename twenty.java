public class twenty {

    public static String checkPrime(int value) {
        if (value < 0) {
            return "-1";
        }
        if (value == 0 || value == 1) {
            return "-2";
        }
        if (isPrime(value)) {
            return "true";
        } else {
            return "false";
        }
    }

    private static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        System.out.println(checkPrime(29));  
    }
    }

    