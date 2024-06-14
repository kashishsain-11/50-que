public class twentyfive {
    public static int getSumOfFactors(int value) {
        if (value < 0) {
            return -1;
        }
        if (value == 0) {
            return -2;
        }
        int sum = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                sum += i;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSumOfFactors(28));  
    }
}

