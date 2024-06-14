public class thirtynine {
    private static final String[] WORDS = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public String getNumber(int number) {
        if (number == 0) {
            return "Zero";
        }
        StringBuilder sb = new StringBuilder();
        boolean needSpace = false;
        while (number > 0) {
            int digit = number % 10;
            number /= 10; 
            String word = WORDS[digit];
            if (needSpace) {
                sb.insert(0, ' '); 
            }

            sb.insert(0, word); 
            needSpace = true;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        thirtynine converter = new thirtynine();
        int number = 123; 
        String words = converter.getNumber(number);
        System.out.println(number + " == " + words);
    }
}
