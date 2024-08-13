package BinaryTree;

public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.left = new TreeNode(2);
        tree.left.right = new TreeNode(3);


        //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
        System.out.println(maxPathSum(tree));


    }
    public static int maxSum=Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
        int [] maxSum= new int[1];
        pathSum(root,maxSum);
        return maxSum[0];
    }
    public static int pathSum(TreeNode root,int [] maxSum){
        if(root==null){
            return 0;
        }
        int leftSum= Math.max(0,pathSum(root.left,maxSum));
        int rightSum= Math.max(0,pathSum(root.right,maxSum));
        maxSum[0] = Math.max(maxSum[0],root.val+leftSum+rightSum);
        return Math.max(leftSum,rightSum)+root.val;
    }

}
