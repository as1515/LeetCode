import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    public List<Integer> inorderTraversalR(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inOrder(node.left, result);

        result.add(node.val);

        inOrder(node.right, result);
    }

    public List<Integer> inorderTraversalI(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);

            current = current.right;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InOrderTraversal traverse = new InOrderTraversal();
        List<Integer> resultR = traverse.inorderTraversalR(root);
        System.out.println(resultR);

        List<Integer> resultI = traverse.inorderTraversalI(root);
        System.out.println(resultI);
    }
}
