public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0 || x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return false;
        }
        int reversed = 0;
        int y = x;
        while (y != 0) {
            int tmp = y % 10;
            y /= 10;
            reversed = 10 * reversed + tmp;
        }
        System.out.println(reversed);
        System.out.println(x);
        return (x == reversed);
    }

    public static void main(String[] args) {
        IsPalindrome palindrome = new IsPalindrome();
        System.out.println(palindrome.isPalindrome(0));
    }
}
