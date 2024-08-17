package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLefrSideView {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        System.out.println(leftSideView(tree));


    }

    public static List<Integer> leftSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        leftView(root, output, 0);
        return output;
    }

    public static void leftView(TreeNode root, List<Integer> level, int depth) {
        if (root == null) {
            return;
        }
        if (depth == level.size()) {
            level.add(root.val);
        }
        leftView(root.left, level, depth + 1);
        leftView(root.right, level, depth + 1);

    }
}
