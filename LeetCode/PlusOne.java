public class PlusOne {
    public int[] lastNumberIncrement(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;

    }

    public static void main(String[] args) throws Exception {
        PlusOne numberWay = new PlusOne();
        int[] numberInt = { 1, 9 };
        int[] result = numberWay.lastNumberIncrement(numberInt);

        for (int i : result) {
            System.out.print(i);
        }
    }
}
