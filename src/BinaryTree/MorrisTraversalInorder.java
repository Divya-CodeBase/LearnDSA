package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class MorrisTraversalInorder {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(7);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(6);

        System.out.println(morrisInorder(tree));
        System.out.println(morrisPreorder(tree));


    }

    public static  List<Integer> morrisInorder(TreeNode root) {
        List<Integer>lt= new ArrayList<>();
        TreeNode curr= root;
        while(curr!= null){
            if(curr.left==null){
                lt.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode pre= curr.left;
                while(pre.right!= null && pre.right!= curr){
                    pre= pre.right;
                }
                if(pre.right==null){
                    pre.right= curr;
                    curr=curr.left;
                }
                else{
                    pre.right= null;
                    lt.add(curr.val);
                    curr=curr.right;
                }
            }
        }
        return lt;
    }
    public static  List<Integer> morrisPreorder(TreeNode root) {
        List<Integer>lt= new ArrayList<>();
        TreeNode curr= root;
        while(curr!= null){
            if(curr.left==null){
                lt.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode pre= curr.left;
                while(pre.right!= null && pre.right!= curr){
                    pre= pre.right;
                }
                if(pre.right==null){
                    pre.right= curr;
                    lt.add(curr.val);
                    curr=curr.left;
                }
                else{
                    pre.right= null;

                    curr=curr.right;
                }
            }
        }
        return lt;
    }
}
