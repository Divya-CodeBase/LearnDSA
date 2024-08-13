package BinaryTree;

public class BalancedBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.left = new TreeNode(2);


        //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
        System.out.println(isBalanced(tree));


    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return false;

        return balanced(root) != -1;
    }
    public static int balanced(TreeNode root) {
        if (root == null) return 0;
        int lh = balanced(root.left);
        if (lh == -1) return -1;
        int rh = balanced(root.right);
        if (rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;
        return 1 + Math.max(lh, rh);

    }

}
