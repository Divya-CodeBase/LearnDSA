package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPath {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(4);

        System.out.println(binaryTreePaths(tree));


    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> lt = new ArrayList<>();
        if (root == null) return lt;
        getPath(root, "", lt);
        return lt;
    }
    static void getPath(TreeNode root, String path, List<String> lt) {
        if (root.left == null && root.right == null) lt.add(path + root.val);
        if (root.left != null) {
            getPath(root.left, path+root.val+"->", lt);
        }
        if (root.right != null) {
            getPath(root.right, path+root.val+"->", lt);
        }

    }
}
