public class thirtyone {
    public int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        int squareOfSum = sum * sum;
        return squareOfSum - sumOfSquares;
    }

    public static void main(String[] args) {
        thirtyone calculator = new thirtyone();
        int n = 10;
        int result = calculator.calculateDifference(n);
        System.out.println("The difference between the sum of the squares and the square of the sum of the first " + n + " natural numbers is: " + result);
    }
}
