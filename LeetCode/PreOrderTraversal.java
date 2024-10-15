import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    private void preOrder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.val);

        preOrder(node.left, result);

        preOrder(node.right, result);
    }

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        PreOrderTraversal traverse = new PreOrderTraversal();
        List<Integer> result = traverse.preOrderTraversal(root);
        System.out.println(result);
    }
}
