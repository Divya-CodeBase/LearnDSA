package BinarySearchTree;

import BinaryTree.TreeNode;

public class SearchInBST {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);


        System.out.println(searchBST(tree, 30));
    }

    public static TreeNode searchBST(TreeNode root, int val) {

        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
}
