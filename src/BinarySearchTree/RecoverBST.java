package BinarySearchTree;

import BinaryTree.TreeNode;

public class RecoverBST {
    public static TreeNode pre;
    public static TreeNode first;
    public static TreeNode middle;
    public static TreeNode last;
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(7);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        recoverTree(tree);
        System.out.println("hi");
    }



    public static void inorder(TreeNode root){
        if(root==null)return;

        inorder(root.left);
        if(pre!=null && root.val< pre.val){
            if(first==null){
                first=pre;
                middle= root;
            }
            else {
                last= root;
            }
        }
        pre= root;
        inorder(root.right);
    }

    public static void recoverTree(TreeNode root) {
        first= middle=last= null;
        pre= new TreeNode(Integer.MIN_VALUE);

        inorder(root);
        if(first!= null&&last!= null){
            int t= first.val;
            first.val= last.val;
            last.val= t;
        }
        else if(first!= null&&middle!= null){
            int t= first.val;
            first.val= middle.val;
            middle.val= t;
        }

    }
}
