import java.util.concurrent.ThreadFactory;

public class thirtyfour {
    public int findSum(int n) {
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10; 
            sum += digit * digit * digit; 
            n /= 10; 
        }
        
        return sum;
    }

    public static void main(String[] args) {
        thirtyfour calculator = new thirtyfour();
        int number = 123; 
        int result = calculator.findSum(number);
        System.out.println("The sum of the cubes of the digits of the number " + number + " is: " + result);
    }
}

