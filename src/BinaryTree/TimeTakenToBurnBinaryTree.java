package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TimeTakenToBurnBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(7);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(6);

        System.out.println(timeTakenToBurn(tree, 2));

    }

    public static int timeTakenToBurn(TreeNode root, int start) {
        Map<TreeNode, TreeNode> mp = new HashMap<>();
        if(root==null)return 0;
        TreeNode target= mapParent(mp, root,start);
        int levels= burnElements(mp, target);

return levels;
    }


    public static TreeNode mapParent(Map<TreeNode, TreeNode> mp, TreeNode root,int start) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode res= new TreeNode();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if(temp.val==start) res= temp;
            if (temp.left != null) {
                mp.put(temp.left, temp);
                q.add(temp.left);
            }
            if (temp.right != null) {
                mp.put(temp.right, temp);
                q.add(temp.left);
            }
        }
        return res;
    }

    public static int burnElements(Map<TreeNode, TreeNode> mp, TreeNode target) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(target);
        Map<TreeNode, Integer> visited = new HashMap<>();
        visited.put(target, 1);
        int level = 0;
        while (!q.isEmpty()) {

            int size = q.size();
            int fl=0;
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                if (temp.left != null && visited.get(temp.left) == null) {
                    fl=1;
                    visited.put(temp.left, 1);
                    q.add(temp.left);
                }
                if (temp.right != null && visited.get(temp.right) == null) {
                    fl=1;
                    visited.put(temp.right, 1);
                    q.add(temp.right);
                }
                if (mp.get(temp) != null && visited.get(mp.get(temp)) == null) {
                    fl=1;
                    visited.put(temp, 1);
                    q.add(temp);
                }
            }
            if(fl==1)level++;
        }
        return level;
    }

}
