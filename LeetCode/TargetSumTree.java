public class TargetSumTree {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        targetSum -= root.val;

        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);

    }

    public static void main(String[] args) throws Exception {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);
        root1.left.left = new TreeNode(11);
        root1.left.left.left = new TreeNode(7);
        root1.left.left.right = new TreeNode(2);
        root1.right = new TreeNode(8);
        root1.right.right = new TreeNode(4);
        root1.right.left = new TreeNode(13);
        root1.right.right.right = new TreeNode(1);

        TargetSumTree sumTree = new TargetSumTree();
        System.out.println(sumTree.hasPathSum(root1, 22));
    }
}
