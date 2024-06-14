public class thirtytwo {

    public boolean checknum(int n) {
        
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
       thirtytwo check = new thirtytwo();
        int n = 8;
        boolean result = check.checknum(n);
        System.out.println(n + " is a power of two: " + result);
        n = 10; 
        result = check.checknum(n);
        System.out.println(n + " is a power of two: " + result);
    }
}

