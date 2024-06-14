public class fourteen {
    public static String getNumbersInRange(int start, int end) {
        if (start < 0 || end < 0) {
            return "-1";
        }
        if (start == end) {
            return "-2";
        }
        if (start < end) {
            return "-3";
        }
        if (start - end == 1) {
            return "-4";
        }

        String result = "";
        for (int i = start - 1; i > end; i--) {
            result += i + " ";
        }

      
        if (!result.isEmpty()) {
            result = result.substring(0, result.length() - 1);
        }

        return result;
    }
        public static void main(String[] args) {
        System.out.println(getNumbersInRange(10, 1)); 
        System.out.println(getNumbersInRange(3, 0)); 
    }

}