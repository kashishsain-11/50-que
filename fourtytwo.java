public class fourtytwo {

    public static String getCollatzSequence(int num) {

        if (num < 0) {
            return "Error";
        }

        StringBuilder sequence = new StringBuilder();
        int count = 0;
        int current = num;

        while (current != 1 && count < 100) {
            sequence.append(current).append(" ");
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = 3 * current + 1;
            }
            count++;
        }
        sequence.append("1");
        if (current != 1) {
            return "Does not Converge";
        }

        return sequence.toString().trim();
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Collatz Sequence for " + number + ": " + getCollatzSequence(number));

    }
}

