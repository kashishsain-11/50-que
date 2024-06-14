public class twentysix {

    public static String getEvenNumbers(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            return "-1";
        }
        if (num1 == 0 || num2 == 0 || num1 == num2) {
            return "-2";
        } 
        int start, end;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }
        String result = "";
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getEvenNumbers(10, 20)); 
       
    }
}
