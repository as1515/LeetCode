public class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int i = 0;
        int k = 0;
        while (i < prices.length - 1) {
            minPrice = Math.min(minPrice, prices[i++]);
            if (prices[i] < minPrice) {
                k = i;
            }
            System.out.println("MinPrice " + minPrice + " i " + i + " k " + k);
        }

        int j = prices.length - 1;
        int maxPrice = prices[j];
        while (j > k) {
            maxPrice = Math.max(maxPrice, prices[j--]);
            System.out.println("MaxPrice " + maxPrice + " j " + j);
        }

        int profit = maxPrice - minPrice;
        if (profit < 0) {
            return 0;
        } else {
            return profit;
        }
    }

    public static void main(String[] args) throws Exception {
        MaxProfit profit = new MaxProfit();
        int[] prices = { 7, 6, 4, 3, 2, 1 };
        System.out.println(profit.maxProfit(prices));
    }
}
