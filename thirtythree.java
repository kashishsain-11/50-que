public class thirtythree {
    public int findSum(int n) {
        int sum = 0;
        int count = 0;
        int i = 1;
        
        while (count < n) {
            int number = i * 2; 
            if (number % 3 == 0 && number % 8 == 0) {
                sum += number;
                count++;
            }
            i++;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        thirtythree calculator = new thirtythree();
        int n = 5;
        int result = calculator.findSum(n);
        System.out.println("The sum of the first " + n + " even numbers divisible by 3 and 8 is: " + result);
    }
}
