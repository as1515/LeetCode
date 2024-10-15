import java.util.Arrays;
import java.util.HashMap;

public class TwoSumNew {
    public int[] twoSumBrute(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[] { i, j };
                }
            }
        }
        return result;
    }

    public int[] twoSumHash(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result = new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return result;
    }

    // public int[] twoSumNew(int[] nums, int target) {
    // int[] sortedNums = Arrays.sort(nums); // sort the nums and put into a new
    // variable
    // int left = 0;
    // int right = nums.length - 1;
    // int[] result = new int[2];
    // while (left < right) {
    // if (nums[left] + nums[right] == target) {
    // // find the index from nums not sorted nums
    // result = new int[] { left, right };
    // } else if (nums[left] + nums[right] < target) {
    // left++;
    // } else {
    // right--;
    // }
    // }

    // return result;
    // }

    public static void main(String[] args) throws Exception {
        TwoSumNew sum = new TwoSumNew();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = sum.twoSumHash(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
