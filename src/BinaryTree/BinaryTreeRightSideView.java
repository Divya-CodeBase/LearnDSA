package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        System.out.println(rightSideView(tree));


    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        rightView(root, output, 0);
        return output;
    }

    public static void rightView(TreeNode root, List<Integer> level, int depth) {
        if (root == null) {
            return;
        }
        if (depth == level.size()) {
            level.add(root.val);
        }
        rightView(root.right, level, depth + 1);
        rightView(root.left, level, depth + 1);
    }
}
