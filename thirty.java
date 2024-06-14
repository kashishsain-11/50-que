import java.util.Scanner;

public class thirty{
    public int calculate(int n) {
        int sum = 0;
        int count = 0;
        int i = 1;
        
        while (count < n) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        
        return sum;
    }

    public static void main(String[] args) {
       thirty calculator=new thirty();
       Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int result = calculator.calculate(n);
        System.out.println("The sum of the first " + n + " natural numbers divisible by 3 or 5 is: " + result);
    }
}
