public class twentyone {
    public static String checkPalindrome(int value) {
        if (value < 0) {
            return "-1";
        }
        if (value >= 0 && value <= 9) {
            return "-2";
        }
        if (isPalindrome(value)) {
            return "true";
        } else {
            return "false";
        }
    }
    
    private static boolean isPalindrome(int value) {
        int original = value;
        int reverse = 0;
        
        while (value != 0) {
            int digit = value % 10;
            reverse = reverse * 10 + digit;
            value /= 10;
        }
        
        return original == reverse;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(121)); 
    }
}
