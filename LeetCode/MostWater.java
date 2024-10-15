public class MostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            int width = end - start;
            int currentHeight = Math.min(height[start], height[end]);
            int currentArea = width * currentHeight;

            maxArea = Math.max(currentArea, maxArea);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        MostWater water = new MostWater();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // int[] height = { 1, 1 };
        System.out.println(water.maxArea(height));
    }
}

// public int maxArea(int[] height) {
// int maxArea = 0;
// int start = 0;
// int end = 1;

// while (end <= height.length - 1) {
// if (height[end] > height[start]) {
// start++;
// } else if (height[end] <= height[start]) {
// int newMax = Math.min(height[start], height[end]) * (end - start);

// if (newMax > maxArea) {
// maxArea = newMax;
// }

// end++;
// }

// }

// return maxArea;
// }
