public class fourty {
    public boolean checkPalindrome (int number) {
        String numStr = Integer.toString(number);
        int len = numStr.length();
        int start = 0;
        int end = len - 1; 
        while (start < end) {
            if (numStr.charAt(start) != numStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }

   public static void main(String[] args) {
    
   fourty checker=new fourty();
        // Test cases
        int number1 = 12321; // Palindrome
        int number2 = 12345; // Not a palindrome
        
        System.out.println(number1 + " is palindrome? " + checker.checkPalindrome (number1));
        System.out.println(number2 + " is palindrome? " + checker.checkPalindrome (number2));
    }
}
