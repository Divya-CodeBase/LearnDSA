package BinaryTree;

public class CountUniValueNodes {
    /*
    Given the root of a binary tree, return the number of uni-value subtrees.

A uni-value subtree means all nodes of the subtree have the same value.

Input: root = [5,1,5,5,5,null,5]
Output: 4

     */

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(5);
        tree.right = new TreeNode(5);
        tree.left = new TreeNode(1);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(5);
        tree.right.right = new TreeNode(5);

        //System.out.println(maxDepth(tree));
        System.out.println(countUnivalSubtrees(tree));

    }

    static int ans;
    public static int countUnivalSubtrees(TreeNode root) {
        dfs(root);
        return ans;

    }

    public static boolean dfs(TreeNode root){
        if(root==null)return true;

        boolean l= dfs(root.left);
        boolean r= dfs(root.right);

        if(!l||!r)return false;

        int a= root.left==null? root.val: root.left.val;
        int b= root.right==null? root.val: root.right.val;

        if(a==b&& a==root.val){
            ans++;
            return true;
        }
        return false;
    }
}
