package BinaryTree;

public class SymmetricTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(4);

        System.out.println(isSymmetric(tree));


    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
         return checkSymmetry(root.left, root.right);
    }

    public static boolean checkSymmetry(TreeNode left, TreeNode right) {
        if (left == null && right == null) return left == right;
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) return false;

        return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
    }


}
