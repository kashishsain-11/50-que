public class thirtysix {
    public int getPrimeSum(int n) {
        int sum = 0;
        int count = 0;
        int num = 2; 
        
        while (count < n) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }
        
        return sum;
    }

   
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        thirtysix calculator = new thirtysix();
        int n = 5; // Example value for n
        int result = calculator.getPrimeSum(n);
        System.out.println("The sum of the first " + n + " prime numbers is: " + result);
    }
}

