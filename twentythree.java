public class twentythree {
    public static int getFactorial(int value) {
        if (value < 0) {
            return -1;
        }
        if (value == 0) {
            return -2;
        }
        int factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }
        
        return factorial;
    }

    public static void main(String[] args) {
      
        System.out.println(getFactorial(5));  
    }
}
