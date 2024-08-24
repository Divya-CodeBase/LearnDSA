package BinarySearchTree;

import BinaryTree.TreeNode;

class NodeValue {
    int maxNode, minNode, maxSize;

    // Constructor to initialize
    // the NodeValue object
    NodeValue(int minNode, int maxNode, int maxSize) {
        this.maxNode = maxNode;
        this.minNode = minNode;
        this.maxSize = maxSize;
    }

}

public class LargestBSTinBT {

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right.right = new TreeNode(6);

        System.out.println(largestBst(tree));

    }

    public static int largestBst(TreeNode root) {
return largestBSTSubtreeHelper(root).maxSize;
    }

    private static NodeValue largestBSTSubtreeHelper(TreeNode root) {
        // An empty tree is a BST of size 0
        if (root == null) {
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        // Get values from left and right
        // subtrees of the current tree.
        NodeValue left = largestBSTSubtreeHelper(root.left);
        NodeValue right = largestBSTSubtreeHelper(root.right);

        // Check if the current tree is a BST based
        // on its left and right subtrees' properties
        if (left.maxNode < root.val && root.val < right.minNode) {
            // It is a BST, update the values for the current tree
            return new NodeValue(Math.min(root.val, left.minNode),
                    Math.max(root.val, right.maxNode), left.maxSize + right.maxSize + 1);
        }

        // If the current tree is not a BST,
        // return values indicating invalid tree properties
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
    }


}
