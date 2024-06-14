public class fourtyone {
    
    public static int getProduct(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0) {
            return -1;
        }
        
        int product = 0;
        
        while (num1 > 0) {
            if (num1 % 2 != 0) {
                product += num2;
            }
            num1 /= 2;
            num2 *= 2;
        }
        
        return product;
    }
    
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 12;
        int result = getProduct(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + result); 
    }
}
