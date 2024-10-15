public class MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Base case
        if (root.left == null && root.right == null) {
            System.out.println("root val base case " + root.val);
            return 1;
        }

        if (root.left == null) {
            System.out.println("root.left == null " + root.val);
            return minDepth(root.right) + 1;
        }

        if (root.right == null) {
            System.out.println("root.right == null " + root.val);
            return minDepth(root.left) + 1;
        }

        System.out.println("root.left " + root.left.val + " root.right " + root.right.val);
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(4);
        root2.right.right.right = new TreeNode(5);
        root2.right.right.right.right = new TreeNode(6);

        MinDepth depth = new MinDepth();
        System.out.println(depth.minDepth(root2));
    }
}
