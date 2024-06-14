public class fifty{

    public static void main(String[] args) {
        System.out.println(getGCD(20, 30)); 
    }
    public static int getGCD(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            return -1;
        }
        num1 = abs(num1);
        num2 = abs(num2);
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        
        return num1;
    }
    public static int abs(int number) {
        return (number < 0) ? -number : number;
    }
}
