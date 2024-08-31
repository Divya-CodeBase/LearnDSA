package BinaryTree;

public class PathSum {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(3);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(6);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(5);

        //System.out.println(maxDepth(tree));
        System.out.println(hasPathSum(tree,44));

    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;

        if(root.left==null&& root.right==null){
            return targetSum==root.val;
        }
        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);





    }
}
