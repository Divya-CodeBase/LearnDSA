package BinaryTree;

import java.util.ArrayList;

public class LeafSimilar {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.left = new TreeNode(2);

        TreeNode tree2 = new TreeNode(1);
        tree2.right = new TreeNode(2);
        tree2.left = new TreeNode(2);


        //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
        System.out.println(leafSimilar(tree, tree2));

    }

    static ArrayList<Integer> collectLeaves(TreeNode root, ArrayList<Integer> leaf) {

        if (root == null) {
            return leaf;
        }
        if (root.left == null && root.right == null) {
            leaf.add(root.val);
        }
        collectLeaves(root.left, leaf);
        collectLeaves(root.right, leaf);
        return leaf;
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaf1 = new ArrayList<>();
        leaf1 = collectLeaves(root1, leaf1);
        ArrayList<Integer> leaf2 = new ArrayList<>();
        leaf2 = collectLeaves(root2, leaf2);

        return leaf1.equals(leaf2);

    }

}
