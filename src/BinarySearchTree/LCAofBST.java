package BinarySearchTree;

import BinaryTree.TreeNode;

public class LCAofBST {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right.right = new TreeNode(9);
        tree.right.left = new TreeNode(6);
        tree.right.right.right = new TreeNode(11);


        System.out.println(lowestCommonAncestor(tree, tree.right.left, tree.right.right.right));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        int curr = root.val;
        if (curr < p.val && curr < q.val) return lowestCommonAncestor(root.right, p, q);
        if (curr > p.val && curr > q.val) return lowestCommonAncestor(root.left, p, q);
        return root;

    }
}
