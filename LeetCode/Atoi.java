public class Atoi {
    public int myAtoi(String s) {
        int total = 0, index = 0, sign = 1;

        if (s.length() == 0) {
            return 0;
        }

        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        while (index < s.length()) {
            int digit = s.charAt(index) - '0';
            System.out.println(digit);
            if (digit < 0 || digit > 9) {
                break;
            }

            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = 10 * total + digit;
            index++;
        }

        return total * sign;
    }

    public static void main(String[] args) {
        Atoi atoiInt = new Atoi();
        int atoi = atoiInt.myAtoi("    2147483649");
        System.out.println(atoi);
    }

}

// str = str.replaceAll("[^\\d.]", "");

// public int myAtoi(String s) {
// int i = 0;
// s = s.strip();
// s = s.replaceAll("[^\\d.]", "");
// boolean sign = s.contains("-");

// try {
// if (!sign) {
// i = Integer.valueOf(s) > Integer.MAX_VALUE ? Integer.MAX_VALUE :
// Integer.valueOf(s);
// } else {
// i = Integer.valueOf(s) < Integer.MIN_VALUE ? Integer.MIN_VALUE :
// Integer.valueOf(s);
// }
// } catch (NumberFormatException e) {
// if (!sign) {
// i = Integer.MAX_VALUE;
// } else {
// i = Integer.MIN_VALUE;
// }
// }

// return i;

// my code is flawed becuase. First of we are told to remove white spaces at the
// start of the string before digits not after.
//