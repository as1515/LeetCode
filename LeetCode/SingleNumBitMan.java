public class SingleNumBitMan {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
            System.out.println("Single " + single + " nums " + num);
        }
        return single;
    }

    public static void main(String[] args) {
        SingleNumBitMan finder = new SingleNumBitMan();

        int[] nums1 = { 4, 1, 2, 1, 4 };
        System.out.println(finder.singleNumber(nums1));

        int[] nums2 = { 4, 2, 1, 2, 1 };
        System.out.println(finder.singleNumber(nums2));

        int[] nums3 = { 2, 4, 1, 4, 2 };
        System.out.println(finder.singleNumber(nums3));
    }
}
