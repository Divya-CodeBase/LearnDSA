package BinarySearchTree;

import BinaryTree.TreeNode;

public class DeleteNodeInBST {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);


        System.out.println(deleteNode(tree, 2));
    }

    public static TreeNode deleteNode(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) {
            return connector(root);
        }
        TreeNode temp = root;
        while (root != null) {
            if (root.val > val) {
                if (root.left != null && root.left.val == val) {
                    root.left = connector(root.left);
                } else {
                    root = root.left;
                }
            } else {
                if (root.right != null && root.right.val == val) {
                    root.right = connector(root.right);
                } else {
                    root = root.right;
                }
            }
        }
        return temp;

    }

    public static TreeNode connector(TreeNode root) {
        if (root.left == null) return root.right;
        else if (root.right == null) return root.left;
        TreeNode rightChild = root.right;
        TreeNode lastleft = lastleftchild(root.left);
        lastleft.right = rightChild;
        return root.left;

    }

    public static TreeNode lastleftchild(TreeNode root) {
        if (root.right == null) {
            return root;
        }
        return lastleftchild(root.right);
    }


}
