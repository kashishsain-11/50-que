public class thirtyfive {
    public int sumOfFactorial(int n) {
        int sum = 0;
        int a = 0, b = 1;
        
        for (int i = 1; i <= n; i++) {
            int fib = (i == 1) ? a : (i == 2) ? b : a + b;
            if (i > 2) {
                a = b;
                b = fib;
            }
            sum += factorial(fib);
        }
        
        return sum;
    }
    private int factorial(int m) {
        int result = 1;
        for (int i = 1; i <= m; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        thirtyfive calculator = new thirtyfive();
        int n = 5;
        int result = calculator.sumOfFactorial(n);
        System.out.println("The sum of the factorials of the first " + n + " Fibonacci numbers is: " + result);
    }
}

