public class RemoveDuplicatesSorted {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int j = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }

        nums[j++] = nums[nums.length - 1];

        return j;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // Input array
        RemoveDuplicatesSorted removeDupes = new RemoveDuplicatesSorted();
        int k = removeDupes.removeDuplicates(nums);
        System.out.println(k);

    }
}
