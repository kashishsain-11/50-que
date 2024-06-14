public class twentytwo {
    public static String checkArmStrong(int value) {
        if (value < 0) {
            return "-1";
        }
        if (value < 1000 || value > 9999) {
            return "-2";
        }
        if (isArmstrong(value)) {
            return "ArmStrong Number";
        } else {
            return "Not ArmStrong Number";
        }
    }
    
    private static boolean isArmstrong(int value) {
        int original = value;
        int sum = 0;
        while (value != 0) {
            int digit = value % 10;
            sum += digit * digit * digit * digit;
            value /= 10;
        }
        
        return original == sum;
    }

    public static void main(String[] args) {
        System.out.println(checkArmStrong(1634));  
    }
}

