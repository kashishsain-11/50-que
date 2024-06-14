public class fourtyeight {

    public static void main(String[] args) {
        System.out.println(sumOfAmicablePairs());
    }
    public static int getSumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static int sumOfAmicablePairs() {
        int limit = 1000000;
        int sumOfAmicablePairs = 0;

        for (int i = 1; i < limit; i++) {
            int sumOfDivisors = getSumOfProperDivisors(i);
            if (sumOfDivisors > i && sumOfDivisors < limit) {
                if (i == getSumOfProperDivisors(sumOfDivisors) && i != sumOfDivisors) {
                    sumOfAmicablePairs += i + sumOfDivisors;
                }
            }
        }
        return sumOfAmicablePairs;
    }
}

