package BinaryTree;

import java.util.*;

public class AllNodesDistanceKinBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        System.out.println(distanceK(tree, tree.left.right, 2));
    }

    public static void markParent(TreeNode root, Map<TreeNode, TreeNode> mp) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.left != null) {
                q.add(temp.left);
                mp.put(temp.left, temp);
            }
            if (temp.right != null) {
                q.add(temp.right);
                mp.put(temp.right, temp);
            }
        }
    }


    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> mp = new HashMap<>();
        markParent(root, mp);
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, Boolean> visited = new HashMap<>();
        queue.add(target);
        visited.put(target, true);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (level == k) break;
            level++;
            TreeNode temp = queue.poll();
            for (int i = 0; i < size; i++) {

                if (temp.left != null && visited.get(temp.left) == null) {
                    visited.put(temp.left, true);
                    queue.add(temp.left);
                }
                if (temp.right != null && visited.get(temp.right) == null) {
                    visited.put(temp.right, true);
                    queue.add(temp.right);
                }
                if (mp.get(temp) != null && visited.get(mp.get(temp)) == null) {
                    visited.put(mp.get(temp), true);
                    queue.add(mp.get(temp));
                }
            }

        }

        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            ans.add(queue.poll().val);
        }
        return ans;
    }

}
