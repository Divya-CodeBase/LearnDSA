package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeBFS {
    static List<Integer> output = new ArrayList<>();

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(3);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(6);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(5);

        //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
         //levelOrder(tree);
        levelOrder1(tree);

        // Print the preorder traversal

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> output1= new ArrayList<>();
        if(root == null) {
            return output1;
        }
        q.add(root);
        while(!q.isEmpty()){
            int len= q.size();
            List<Integer>sublist= new ArrayList<>();
            for(int i=0;i<len;i++){
                if(q.peek().left!= null) q.add(q.peek().left);
                if(q.peek().right!= null) q.add(q.peek().right);
                sublist.add(q.poll().val);
            }
            output1.add(sublist);
        }
        return output1;
    }

    public static List<List<Integer>> levelOrder1(TreeNode root)
    {
        List<List<Integer>>al=new ArrayList<>();
        pre(root,0,al);
        return al;
    }
    public static void pre(TreeNode root,int l,List<List<Integer>>al) {

        if(root==null){
            return;
        }
        if(l==al.size()){
            List<Integer> sl= new ArrayList<>();
            sl.add(root.val);
            al.add(sl);
        }
        else{
            al.get(l).add(root.val);
        }
        pre(root.left,l+1,al);
        pre(root.right,l+1,al);




    }


}
