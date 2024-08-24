package BinarySearchTree;

import BinaryTree.TreeNode;

import javax.swing.*;

public class BSTFromPreorder {


    public static void main(String[] args) {
        System.out.println(bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12}));
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode temp= bstFromPreorder(preorder, Integer.MAX_VALUE, new int[]{0});
        return temp;
    }

    public static TreeNode bstFromPreorder(int[] preorder, int bound, int[] ref) {
        if (ref[0] == preorder.length || preorder[ref[0]] > bound) return null;
        TreeNode node = new TreeNode(preorder[ref[0]++]);
        node.left = bstFromPreorder(preorder, node.val, ref);
        node.right = bstFromPreorder(preorder, bound, ref);
        return node;

    }


}
