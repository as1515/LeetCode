public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        while (i < m) {
            nums3[k++] = nums1[i++];
        }

        while (j < n) {
            nums3[k++] = nums2[j++];
        }

        for (i = 0; i < m + n; i++) {
            nums1[i] = nums3[i];
        }
    }

    public static void main(String[] args) throws Exception {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };

        MergeSortedArray mergeArray = new MergeSortedArray();

        mergeArray.merge(arr1, 3, arr2, 3);

        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
