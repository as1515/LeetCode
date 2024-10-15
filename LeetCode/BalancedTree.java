public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        return (checkHeight(root) != -1);
    }

    private int checkHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = checkHeight(root.left);
        if (root != null) {
            System.out.println("val " + root.val);
        }
        System.out.println("leftHeight " + leftHeight);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(root.right);
        if (root != null) {
            System.out.println("val " + root.val);
        }
        System.out.println("rightHeight " + rightHeight);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) throws Exception {

        TreeNode root2 = new TreeNode(3);
        root2.right = new TreeNode(9);
        root2.left = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);

        TreeNode root3 = new TreeNode(1);
        root3.right = new TreeNode(2);
        root3.left = new TreeNode(2);
        root3.left.left = new TreeNode(3);
        root3.left.right = new TreeNode(3);
        root3.left.left.right = new TreeNode(4);
        root3.left.left.left = new TreeNode(4);

        TreeNode root4 = new TreeNode(1);
        root4.right = new TreeNode(2);
        root4.left = new TreeNode(2);
        root4.right.right = new TreeNode(3);
        root4.left.left = new TreeNode(3);
        root4.right.right.right = new TreeNode(4);
        root4.left.left.left = new TreeNode(4);

        BalancedTree balance = new BalancedTree();
        System.out.println(balance.isBalanced(root2));
        System.out.println(balance.isBalanced(root3));
        System.out.println(balance.isBalanced(root4));

    }
}
