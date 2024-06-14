public class twentyfour {
    public static String getFactors(int value) {
        if (value < 0) {
            return "-1";
        }
        if (value == 0) {
            return "-2";
        }
        String result = "";
        boolean first = true;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                if (!first) {
                    result += " ";
                }
                result += i;
                first = false;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getFactors(28));
    }
}

