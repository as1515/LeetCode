import java.util.ArrayList;

public class ReverseInt {
    public int reverse(int x) {

        int reversed = 0;
        while (x != 0) {
            int tmp = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE && tmp > 7) {
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE && tmp < -8) {
                return 0;
            }

            reversed = 10 * reversed + tmp;
        }

        return reversed;
    }

    public static void main(String[] args) {

        ReverseInt reverse = new ReverseInt();
        int s = reverse.reverse(123);
        System.out.println(s);
    }
}

// public class ReverseInt {
// public int reverse(int x) {
// ArrayList<Integer> list = new ArrayList<>();
// int tmp = 0;
// if (x > 0) {
// while (x > 0) {
// tmp = x % 10;
// list.add(tmp);
// x /= 10;
// }
// } else if (x < 0) {
// while (x < 0) {
// tmp = x % 10;
// list.add(tmp);
// x /= 10;
// }
// }

// int total = 0;
// for (Integer i : list) {
// total = 10 * total + i;
// }

// if (total <= Integer.MIN_VALUE || total >= Integer.MAX_VALUE) {
// total = 0;
// }

// return total;
// }
