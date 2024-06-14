public class eighteen {
    public static String createStarPattern(int rows) {
        if (rows < 0) {
            return "-1";
        }
        if (rows == 0) {
            return "-2";
        }
        String result = "";
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                result += "* ";
            }
            if (i < rows) {
                result += "\n";
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(createStarPattern(4));
     
    }

}