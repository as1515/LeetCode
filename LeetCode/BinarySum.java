public class BinarySum {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.insert(0, (char) ((sum % 2) + '0'));
            carry = sum / 2;
        }

        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        BinarySum sum = new BinarySum();
        System.out.println(sum.addBinary("1010", "1011"));

    }
}
