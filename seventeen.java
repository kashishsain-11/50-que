public class seventeen {
    public static String createBoxPattern(int rows, int cols) {
        if (rows < 0 || cols < 0) {
            return "-1";
        }
        if (rows == 0 || cols == 0) {
            return "-2";
        }

        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    result += "* ";
                } else {
                    result += "  ";
                }
            }
            if (i < rows - 1) {
                result += "\n";
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(createBoxPattern(4, 5));
        
    }

}