package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;

public class BoundaryTraversal {
    static ArrayList<Integer> res = new ArrayList<>();

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(20);

        tree.left = new TreeNode(8);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(12);
        tree.left.right.left = new TreeNode(10);
        tree.left.right.right = new TreeNode(14);
        tree.right = new TreeNode(22);
        tree.right.right = new TreeNode(25);


        //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
        System.out.println(boundary(tree,res));


    }

    public static boolean isLeaf(TreeNode node) {
        if (node.left == null && node.right == null) {
            return true;
        }
        return false;
    }

    static void addLeftBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode curr = root.left;
        while (curr != null) {
            if (isLeaf(curr) == false) {
                res.add(curr.val);
            }
            if (curr.left != null) {
                curr = curr.left;
            } else curr = curr.right;
        }
    }

    static void addrightBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode curr = root.right;
        ArrayList<Integer> rev = new ArrayList<>();
        while (curr != null) {
            if (isLeaf(curr) == false) {
                rev.add(curr.val);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else curr = curr.left;
        }
        for (int i = rev.size() - 1; i >= 0; i--) {
            res.add(rev.get(i));
        }
    }

    static void addLeaves(TreeNode root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.val);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);

    }

    public static ArrayList<Integer> boundary(TreeNode root, ArrayList<Integer> res) {
        if (isLeaf(root) == false) res.add(root.val);
        addLeftBoundary(root, res);
        addLeaves(root, res);
        addrightBoundary(root, res);
        return res;
    }

}
