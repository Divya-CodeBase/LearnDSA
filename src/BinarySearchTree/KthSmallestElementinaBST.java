package BinarySearchTree;

import BinaryTree.TreeNode;

public class KthSmallestElementinaBST {

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);


        System.out.println(kSmallestNode(tree, 3));
    }

    public static int small = 0;
    public static int count = 0;

    public static int kSmallestNode(TreeNode root, int val) {

            Inorder(root, val);
            return small;

    }

    public static void Inorder(TreeNode root, int val) {
        if (root == null || count >= val) return;

        Inorder(root.left, val);
        count++;
        if (count == val) {
            small = root.val;
            return;
        }

       Inorder(root.right, val);

    }


    //inorder Left Node right

}
