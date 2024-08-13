package BinaryTree;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BinaryTreePreorderTraversal {
    static List<Integer> output = new ArrayList<>();

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.right.left = new TreeNode(3);


        // Get the preorder traversal of the tree
      //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
        List<Integer> preorderTraversal_iterate = preorderTraversal_iterate(tree);


        // Print the preorder traversal
        System.out.println("Preorder traversal of the binary tree:");
        for (int value : preorderTraversal_iterate) {
            System.out.print(value + "");
        }
    }


    public static List<Integer> preorderTraversal_recursion(TreeNode root) {
        preOrder(root);
        return output;
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        output.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static List<Integer> preorderTraversal_iterate(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            root = st.pop();
            output.add(root.val);
            if (root.right != null) {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }
        }
        return output;
    }
}
