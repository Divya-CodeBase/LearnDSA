package BinaryTree;

public class CounttotalNodesInCOMPLETEBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(7);
        tree.right.left = new TreeNode(5);
        //tree.right.right = new TreeNode(6);

        System.out.println(countNodes(tree));

    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        int lh = findLeftHeight(root.left);
        int rh = findRightHeight(root.right);

        if (lh == rh) {
            return ((2 << (lh ))- 1);
        } else return 1 + countNodes(root.left) + countNodes(root.right);

    }


    public static int findLeftHeight(TreeNode root) {
        if (root == null) return 0;
        int count = 0;
        while (root != null) {
            root = root.left;
            count++;
        }
        return count;
    }

    public static int findRightHeight(TreeNode root) {
        if (root == null) return 0;
        int count = 0;
        while (root != null) {
            root = root.right;
            count++;
        }
        return count;
    }
}
