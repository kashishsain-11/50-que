public class fourtynine {

    public static void main(String[] args) {
        System.out.println(lucky("27-JUL-2010"));  
       
    }
    public static int convert(String month) {
        month = month.toUpperCase();
        if (month.equals("JAN") || month.equals("JANUARY")) return 1;
        if (month.equals("FEB") || month.equals("FEBRUARY")) return 2;
        if (month.equals("MAR") || month.equals("MARCH")) return 3;
        if (month.equals("APR") || month.equals("APRIL")) return 4;
        if (month.equals("MAY")) return 5;
        if (month.equals("JUN") || month.equals("JUNE")) return 6;
        if (month.equals("JUL") || month.equals("JULY")) return 7;
        if (month.equals("AUG") || month.equals("AUGUST")) return 8;
        if (month.equals("SEP") || month.equals("SEPTEMBER")) return 9;
        if (month.equals("OCT") || month.equals("OCTOBER")) return 10;
        if (month.equals("NOV") || month.equals("NOVEMBER")) return 11;
        if (month.equals("DEC") || month.equals("DECEMBER")) return 12;
        return -1; 
    }
    public static int sum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static int lucky(String dateOfBirth) {
        String[] parts = new String[3];
        int partIndex = 0;
        for (int i = 0; i < dateOfBirth.length(); i++) {
            if (dateOfBirth.charAt(i) == '-') {
                partIndex++;
            } else {
                if (parts[partIndex] == null) {
                    parts[partIndex] = "" + dateOfBirth.charAt(i);
                } else {
                    parts[partIndex] += dateOfBirth.charAt(i);
                }
            }
        }

        int day = Integer.parseInt(parts[0]);
        int month = convert(parts[1]);
        int year = Integer.parseInt(parts[2]);
        int sum = sum(day) + sum(month) +sum(year);
        while (sum >= 10) {
            sum = sum(sum);
        }

        return sum;
    }
    public static int parseInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                result = result * 10 + (c - '0');
            }
        }
        return result;
    }
}
