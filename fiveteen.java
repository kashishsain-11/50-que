public class fiveteen {
    
    public static String getNumbersInRange(int start_val, int end_val, int step) {
        if (start_val < 0 || end_val < 0 || step <= 0) {
            return "-1";
        }
        if (start_val == end_val) {
            return "-2";
        }
        if (start_val > end_val) {
            return "-3";
        }

        String result = "";
        for (int i = start_val + step; i < end_val; i += step) {
            result += i + " ";
        }

        
        if (!result.isEmpty()) {
            result = result.substring(0, result.length() - 1);
        }

        return result;
    }



    public static void main(String[] args) {
        System.out.println(getNumbersInRange(1, 10, 2));
        
    }
}