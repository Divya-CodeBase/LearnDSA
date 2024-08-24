package BinaryTree;

import java.util.*;

public class MaximumLevelSumofaBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(2);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(6);

        System.out.println(maxLevelSum(tree));
    }

    public static int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level=0;int maxSum=0;
        int out=0;
        while (!q.isEmpty()) {
            int size = q.size();
            level++;
            int sum=0;
            while(size>0) {
                TreeNode temp = q.poll();
                sum+=temp.val;
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                size--;
            }
            if(maxSum<sum){
                out= level;
                maxSum=sum;
            }
        }
        return out;
    }
}
