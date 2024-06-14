public class fourtythree {

    public static String getQuadraticSequence(int numTerms) {
      
        if (numTerms <= 0) {
            return null;
        }

        StringBuilder sequence = new StringBuilder();
        int current = 1;
        int increment = 2; 
        for (int i = 0; i < numTerms; i++) {
            sequence.append(current);
            if (i < numTerms - 1) {
                sequence.append(",");
            }
            current += increment;
            increment++;
        }

        return sequence.toString();
    }

    public static void main(String[] args) {
        int input1 = 2;
        System.out.println("Input: " + input1 + ", Output: " + getQuadraticSequence(input1));
    }
}
