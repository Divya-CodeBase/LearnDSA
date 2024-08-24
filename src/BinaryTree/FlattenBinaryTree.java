package BinaryTree;

import java.util.Stack;

public class FlattenBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(7);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(6);

        // flatten_Recursive(tree);
        //flatten_Stack(tree);
        flatten_morris(tree);
        System.out.println("ji");
    }

    public static TreeNode pre = null;

    public static void flatten_Recursive(TreeNode root) {
        if (root == null) return;

        if (root.right != null) flatten_Recursive(root.right);
        if (root.left != null) flatten_Recursive(root.left);

        root.right = pre;
        root.left = null;
        pre = root;

    }

    public static void flatten_Stack(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            if (node.right != null) {
                st.push(node.right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
            if (!st.isEmpty()) {
                node.right = st.peek();
            }
            node.left = null;
        }
    }

    public static void flatten_morris(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode pre = curr.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                pre.right = curr.right;
                curr.right = curr.left;
                curr.left=null;
            }
            curr = curr.right;
        }
    }
}
