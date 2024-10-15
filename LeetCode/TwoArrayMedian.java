public class TwoArrayMedian {
    public double findMedian(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            System.out.println("nums1 is > than nums2 so we need to rerun the method");
            return findMedian(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;
        System.out.println("first x: " + x + " first y: " + y);

        int low = 0;
        int high = x;
        System.out.println("first low: " + low + " first high: " + high);

        while (low <= high) {
            // partition for the first array
            int partitionX = (low + high) / 2;
            // partition for the second array
            int partitionY = ((x + y + 1) / 2) - partitionX;

            System.out.println("PartitionX: " + partitionX + " PartitionY " + partitionY);

            double maxLeftX = (partitionX != 0 ? nums1[partitionX - 1] : Double.NEGATIVE_INFINITY);
            double minRightX = (partitionX != x ? nums1[partitionX] : Double.POSITIVE_INFINITY);
            double maxLeftY = (partitionY != 0 ? nums2[partitionY - 1] : Double.NEGATIVE_INFINITY);
            double minRightY = (partitionY != y ? nums2[partitionY] : Double.POSITIVE_INFINITY);

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) %
                        2 == 0) {
                    System.out
                            .println("Even: " + (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0);
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    System.out.println("Odd: " + (Math.max(maxLeftX, maxLeftY)));
                    return (Math.max(maxLeftX, maxLeftY));
                }
            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
                System.out.println("MinLeftX > MinRightY high: " + high);
            } else {
                low = partitionX + 1;

                System.out.println("MaxLeftX: " + maxLeftX + " MaxLeftY " + maxLeftY + " MinRightX " + minRightX
                        + " MinRightY " + minRightY);
                System.out.println("else" + low);
            }
        }
        throw new IllegalArgumentException("The nums you entered might be invalid");
    }

    public static void main(String[] args) {
        TwoArrayMedian median = new TwoArrayMedian();
        int[] nums1 = new int[] { 1, 2, 3, 4 };
        int[] nums2 = new int[] { 6, 7, 8, 9 };
        double medianValue = median.findMedian(nums1, nums2);
        System.out.println("The median is: " + medianValue);
    }
}
