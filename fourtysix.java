public class fourtysix {

    public static String isKaprekarNumber(int number) {
        if (number < 0) {
            return "-1";
        }
        if (number == 0) {
            return "-2";
        }
        int square = number * number;
        String squareStr = Integer.toString(square);
        int len = squareStr.length();
        
        for (int i = 1; i < len; i++) {
            String leftPart = squareStr.substring(0, i);
            String rightPart = squareStr.substring(i);
            int left = Integer.parseInt(leftPart);
            int right = Integer.parseInt(rightPart);
            if (right != 0 && left + right == number) {
                return "True";
            }
        }
        return "False";
    }
    public static void main(String[] args) {
        System.out.println(isKaprekarNumber(9));   
    }
}
