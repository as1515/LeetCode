public class SortArr2Tree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return mainTree(nums, 0, nums.length - 1);

    }

    public TreeNode mainTree(int[] nums, int left, int right) {
        TreeNode root = new TreeNode();
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        root.val = nums[mid];
        root.left = mainTree(nums, left, mid - 1);
        root.right = mainTree(nums, mid + 1, right);

        return root;
    }

    public void printLeafNodes(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.printf("%d ", node.val);

        printLeafNodes(node.left);
        printLeafNodes(node.right);

    }

    public static void main(String[] args) throws Exception {
        int[] nums = { -10, -3, 0, 5, 9 };
        // int[] nums1 = { 1, 3 };

        SortArr2Tree sortTree = new SortArr2Tree();
        TreeNode tree = sortTree.sortedArrayToBST(nums);
        sortTree.printLeafNodes(tree);
        System.out.println();

        // TreeNode tree1 = sortTree.sortedArrayToBST(nums1);
        // sortTree.printLeafNodes(tree1);
        // System.out.println();
    }
}
