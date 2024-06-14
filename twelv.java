public class twelv {
    public static String getNumber(int start, int end) {
        if (start > end) {
            return "";
        }
        if (start == end) {
            return Integer.toString(start);
        }
        return start + " " + getNumber(start + 1, end);
    }

    public static void main(String[] args) {
        System.out.println(getNumber(1, 10));
        
    }
}