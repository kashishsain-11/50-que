public class sixteen {
    public static String getNumbersInRange(int value) {
        if (value < 0) {
            return "-1";
        }
        if (value == 0) {
            return "-2";
        }
        if (value > 99) {
            return "-3";
        }

        int maxLength = 5 * value; 
        char[] resultArray = new char[maxLength];
        int index = 0;
        int count = 0;

        for (int i = 1; i <= value; i++) {
            
            int num = i;
            int numStartIndex = index;

            if (num == 0) {
                resultArray[index++] = '0';
            } else {
                int numDigits = 0;
                int temp = num;
                while (temp > 0) {
                    numDigits++;
                    temp /= 10;
                }
                for (int j = 0; j < numDigits; j++) {
                    resultArray[numStartIndex + numDigits - 1 - j] = (char) ('0' + (num % 10));
                    num /= 10;
                }
                index += numDigits;
            }
            resultArray[index++] = ' ';
            count++;
            if (count == 4) {
                resultArray[index++] = '\n';
                count = 0;
            }
        }
        if (index > 0 && (resultArray[index - 1] == ' ' || resultArray[index - 1] == '\n')) {
            index--;
        }
        String result = "";
        for (int i = 0; i < index; i++) {
            result += resultArray[i];
        }

        return result;
    }



    public static void main(String[] args) {
        System.out.println(getNumbersInRange(10));  

}}