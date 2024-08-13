package BinaryTree;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.left = new TreeNode(2);
        tree.left.right = new TreeNode(3);


        //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
        System.out.println(diameterOfBinaryTree(tree));


    }

    static int dia = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        int[] dia = new int[1];
        height(root, dia);
        return dia[0];
    }

    public static int height(TreeNode root, int[] dia) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left, dia);
        int rh = height(root.right, dia);
        int max = lh + rh;
        dia[0] = Math.max(dia[0], max);
        return 1 + Math.max(lh, rh);
    }

}
