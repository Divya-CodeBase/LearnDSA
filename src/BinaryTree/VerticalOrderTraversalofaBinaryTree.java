package BinaryTree;

import java.util.*;

class Triple {
    TreeNode node;
    int row;
    int column;

    Triple(TreeNode node, int row, int column) {
        this.node = node;
        this.row = row;
        this.column = column;
    }

}

public class VerticalOrderTraversalofaBinaryTree {

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        System.out.println(verticalTraversal(tree));


    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> mp = new TreeMap<>();
        Queue<Triple> q = new LinkedList<>();
        if (root == null) return output;

        q.add(new Triple(root, 0, 0));

        while (!q.isEmpty()) {
            Triple tp = q.poll();
            TreeNode temp = tp.node;
            int row = tp.row;
            int column = tp.column;

            if (!mp.containsKey(row)) {
                mp.put(row, new TreeMap<>());
            }
            if (!mp.get(row).containsKey(column)) {
                mp.get(row).putIfAbsent(column,new PriorityQueue<>());
            }
            mp.get(row).get(column).add(temp.val);

            if (temp.left != null) {
                q.add(new Triple(temp.left, row - 1, column + 1));
            }
            if (temp.right != null) {
                q.add(new Triple(temp.right, row + 1, column + 1));
            }
        }
        for (TreeMap<Integer, PriorityQueue<Integer>> a : mp.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> b : a.values()) {
                while (!b.isEmpty()) {
                    col.add(b.poll());
                }
            }
            output.add(col);
        }
        return output;

    }

}
