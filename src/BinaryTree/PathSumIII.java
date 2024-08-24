package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {

    public static int tar;
    static Map<Long,Integer> mp= new HashMap<>();
    static int counter;

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(6);
        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(7);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(6);

        System.out.println(pathSum(tree, 11));
    }

    public static int pathSum(TreeNode root, int targetSum) {
        tar= targetSum;
        mp.put(0L,1);
        dfs(root,0L);
        return counter;
    }
    private static void dfs(TreeNode root, Long curSum){
        if(root==null) return;

        curSum+=root.val;

        if(mp.containsKey(curSum-tar)){
            counter+=mp.get(curSum-tar);
        }
        mp.put(curSum,mp.getOrDefault(curSum,0)+1);
        dfs(root.left,curSum);
        dfs(root.right,curSum);

        if(mp.get(curSum)<=1){
            mp.remove(curSum);
        }
        else {
            mp.put(curSum,mp.get(curSum)-1);
        }

    }
}
