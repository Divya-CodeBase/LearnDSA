package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTZigZagTraversal {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.left = new TreeNode(3);
        tree.left.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);

        //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
        System.out.println(zigzagLevelOrder(tree));


    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>q= new LinkedList<>();
        List<List<Integer>> ans= new ArrayList<>();

        if(root==null){
            return ans;
        }
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int len= q.size();
            List<Integer>sub= new ArrayList<>();
            for(int i =0;i<len;i++){

                if(q.peek().left!= null)q.add(q.peek().left);
                if(q.peek().right!= null)q.add(q.peek().right);
                if(level%2==0){
                    sub.add(q.poll().val);
                }
                else{
                    sub.add(0,q.poll().val);
                }

            }

            ans.add(sub);
            level++;
        }
        return ans;
    }
}
