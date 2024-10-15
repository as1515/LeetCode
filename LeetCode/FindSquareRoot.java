public class FindSquareRoot {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        long t = x / 2;
        while (true) {
            long sqrt = (t + (x / t)) / 2;
            if (t <= sqrt || Math.abs(t - sqrt) <= 1) {
                return (int) t;
            }
            t = sqrt;
        }
    }

    public int mySqrt2(int x) {
        if (x < 2) {
            return x;
        }

        long t;
        long sqrt = x / 2;

        do {
            t = sqrt;
            sqrt = (t + (x / t)) / 2;
        } while (Math.abs(t - sqrt) > 0);

        return (int) sqrt;
    }

    public int mySqrt3(int x) {
        if (x < 2) {
            return x;
        }

        long left = 0;
        long right = x;

        while (left < right) {
            long mid = left + (right - left) / 2 + 1;
            System.out.println("mid " + mid);
            if (mid * mid > x) {
                right = mid - 1;
                System.out.println("right " + right);
            } else {
                left = mid;
                System.out.println("left " + left);
            }

        }
        return (int) left;
    }

    public static void main(String[] args) throws Exception {
        FindSquareRoot squareRoot = new FindSquareRoot();
        System.out.println(squareRoot.mySqrt3(16));
    }
}
