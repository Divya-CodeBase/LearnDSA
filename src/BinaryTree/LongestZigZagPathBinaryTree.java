package BinaryTree;

class LongestZigZagPathBinaryTree {

    static int maxi = 0;

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
      /*  tree.left = new TreeNode(2);
        tree.right = new TreeNode(6);
        tree.left.left = new TreeNode(4);
        tree.left.left.right = new TreeNode(7);Alwarpet5_

        tree.left.left.right.left = new TreeNode(8);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(6);*/

        System.out.println(longestZigZag(tree));
    }

    public static int longestZigZag(TreeNode root) {
        longZigZag(root.left, false, 1);
        longZigZag(root.right, true, 1);
        return maxi;

    }

    private static void longZigZag(TreeNode root, boolean dir, int len) {
        if (root == null) return;
        maxi = Math.max(maxi, len);
        if (dir == false) {
            //left dir
            longZigZag(root.left, false, 1);
            longZigZag(root.right, true, len + 1);
        } else {
            //right dir
            longZigZag(root.left, false, len + 1);
            longZigZag(root.right, true, 1);
        }
    }


}
