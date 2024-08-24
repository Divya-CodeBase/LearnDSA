package BinarySearchTree;

import BinaryTree.TreeNode;

public class InorderSuccessorPredecessor {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);


        System.out.println(InorderSuccessor(tree, tree.left.left));
        System.out.println(InorderPredecessor(tree, tree.left.right));

    }

    public static int InorderSuccessor(TreeNode root, TreeNode p){
        TreeNode succ= null;
        while(root!= null){
            if(root.val<=p.val){
                root=root.right;
            }
            else{
                succ= root;
                root=root.left;
            }
        }
        return succ.val;

    }
    public static TreeNode InorderPredecessor(TreeNode root, TreeNode p){
        TreeNode pre= null;
        while(root!= null){
            if(root.val>=p.val){
                root=root.left;
            }
            else{
                pre= root;
                root=root.right;
            }
        }
        return pre;

    }
}
