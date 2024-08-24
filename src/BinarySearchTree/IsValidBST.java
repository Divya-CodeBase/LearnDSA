package BinarySearchTree;

import BinaryTree.TreeNode;

public class IsValidBST {

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(6);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);


        System.out.println(isValidBST(tree));
    }

    public static long min = Long.MIN_VALUE;
    public static boolean isValid = true;

    public static boolean isValidBST(TreeNode root) {
       // return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        isValid(root);
        return isValid;

    }

    public static boolean isValid(TreeNode root, int min, int max) {
        if (root == null) return true;
        if (root.val >= max || root.val <= min) return false;
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }

    public static void isValid(TreeNode root) {
        if (root == null) return;
        isValid(root.left);
        if (min >= root.val) isValid = false;
        min=root.val;
        isValid(root.right);
    }
}
