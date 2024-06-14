public class thirtyeight {

    public String getSum(double number) {
      
        String numStr = Double.toString(number);
        
        int deciIndex = findIndex(numStr);
    
        int leftSum = sumLeft(numStr, deciIndex);
    
        int rightSum = sumRight(numStr, deciIndex);
        
        return leftSum + ":" + rightSum;
    }
  public int findIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                return i;
            }
        }
        return -1; 
    }
 public int sumLeft(String str, int decIndex) {
        int sum = 0;
        for (int i = 0; i < decIndex; i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += str.charAt(i) - '0'; 
            }
        }
        return sum;
    }
   public int sumRight(String str, int deciIndex) {
        int sum = 0;
        int length = str.length();
        for (int i = deciIndex + 1; i < length; i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += str.charAt(i) - '0'; 
            }
        }
        return sum;
    }

    public static void main(String[] args) {
       thirtyeight calculator = new thirtyeight();
        double number = 120.520; 
        String result = calculator.getSum(number);
        System.out.println("Sum of digits on either side of the decimal point: " + result);
    }
}
