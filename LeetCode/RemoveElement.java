public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        // if (nums.length == 0 || nums.length == 1 && ) {
        // return nums.length;
        // }

        int j = 0;
        // int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
                // count++;
            }
            ;
        }

        // while (j < nums.length) {
        // nums[j++] = -1;
        // }

        return j;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = { 2 };
        int val = 3;

        RemoveElement remove = new RemoveElement();
        int k = remove.removeElement(nums, val);
        System.out.println(k);
    }
}
