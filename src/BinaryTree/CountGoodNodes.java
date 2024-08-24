package BinaryTree;

public class CountGoodNodes {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(2);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(6);


        System.out.println(goodNodes(tree));
    }

    public static int goodNodes(TreeNode root) {
        return countnode(root, Integer.MIN_VALUE);
    }

    public static int countnode(TreeNode root, int max) {

        if (root == null) return 0;
        int count = 0;
        if (root.val > max) {
            count = 1;
        }
        max = Math.max(root.val, max);

        count += countnode(root.left, max);
        count += countnode(root.right, max);
        return count;
    }
}
