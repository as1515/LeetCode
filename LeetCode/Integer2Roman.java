
public class Integer2Roman {
    public String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] numerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder numeral = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                numeral.append(numerals[i]);
            }
        }
        return numeral.toString();
    }

    public static void main(String[] args) {
        Integer2Roman convert = new Integer2Roman();
        System.out.println(convert.intToRoman(58));

    }
}
