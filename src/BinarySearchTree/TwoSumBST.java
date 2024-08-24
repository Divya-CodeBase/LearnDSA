package BinarySearchTree;

import BinaryTree.TreeNode;

import java.util.Stack;

class BSTIterators {
    Stack<TreeNode> st = new Stack<>();
    Boolean reverse;

    public BSTIterators(TreeNode root, boolean isReverse) {
        reverse = isReverse;
        insertAll(root);
    }

    public int next() {
        TreeNode temp = st.pop();
        if (reverse == false) {
            insertAll(temp.right);
        } else {
            insertAll(temp.left);
        }
        return temp.val;

    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

    public void insertAll(TreeNode root) {
        while (root != null) {
            st.push(root);
            if (reverse == true) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
    }

}

public class TwoSumBST {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        System.out.println(findTarget(tree, 34));

    }


    public static boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        BSTIterators lt = new BSTIterators(root, false);
        BSTIterators rt = new BSTIterators(root, true);
        int i = lt.next();
        int j = rt.next();
        while (i < j) {
            if (i + j == k) {
                return true;
            } else if (i + j < k) {
                i = lt.next();
            } else {
                j = rt.next();
            }
        }
        return false;
    }
}
