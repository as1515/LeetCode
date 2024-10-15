import java.util.HashMap;

public class ClimbStairs {
    HashMap<Integer, Integer> memo = new HashMap<>();

    public int climbStairsR(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        int[] ways = { 1, 2 };
        int totalCount = 0;

        for (int i : ways) {
            int climb = n - i;
            int count = climbStairsR(climb);
            totalCount += count;
        }
        memo.put(n, totalCount);
        return memo.get(n);
    }

    public static void main(String[] args) throws Exception {
        ClimbStairs stairs = new ClimbStairs();
        System.out.println(stairs.climbStairsR(4));
    }
}

// n 3
// ways 1 2
// n 2 1
// ways 1 2 1 2
// n 1 0 0 -1
// ways 1 2
// n 0 -1
