public class MaxDepthTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            System.out.println("ldepth " + lDepth + " rDepth " + rDepth);
            if (lDepth > rDepth) {
                return lDepth + 1;
            } else {
                return rDepth + 1;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.left = new TreeNode(2);

        MaxDepthTree maxDepth = new MaxDepthTree();
        System.out.println(maxDepth.maxDepth(root));
    }
}
