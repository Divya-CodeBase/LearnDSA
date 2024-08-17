package BinaryTree;

public class LowestCommonAncestorofaBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        TreeNode ans =lowestCommonAncestor(tree, tree.left.left, tree.right.right);
        System.out.println(ans.val);


    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left =lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left== null){
            return right;
        }
        else if(right== null){
            return left;
        }
        else {
            return root;
        }
    }
}
