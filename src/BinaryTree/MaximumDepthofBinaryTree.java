package BinaryTree;

public class MaximumDepthofBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(3);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(6);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(5);

        System.out.println(maxDepth(tree));

    }


    public static int maxDepth(TreeNode root) {
        if(root== null){
            return 0;
        }
        int lh= maxDepth(root.left);
        int rh= maxDepth(root.right);
        return Math.max(lh,rh)+1;
    }

}
