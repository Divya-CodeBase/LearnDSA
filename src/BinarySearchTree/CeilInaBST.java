package BinarySearchTree;

import BinaryTree.TreeNode;

public class CeilInaBST {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);


        System.out.println(ceilBST(tree, 5));
    }

    public static int ceilBST(TreeNode root, int val) {
        int ceil=-1;
        if(root==null)return 0;
        while(root!= null){
            if(val==root.val){
                ceil=root.val;
                return ceil;
            }
            if(val>root.val){
                root=root.right;
            }
            else{
                ceil=root.val;
                root=root.left;

            }

        }
        return ceil;
    }

    }
