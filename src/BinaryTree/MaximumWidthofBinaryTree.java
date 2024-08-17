package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthofBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);

        tree.right.right = new TreeNode(4);

        System.out.println(widthOfBinaryTree(tree));


    }

    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int max = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {

            int min_Val = q.peek().b;
            int size = q.size();
            int f = 0;
            int l = 0;
            for (int i = 0; i < size; i++) {
                int index = q.peek().b - min_Val;
                TreeNode node = q.poll().a;
                if (i == 0) f = index;
                if (i == size - 1) l = index;
                if (node.left != null) {
                    q.add(new Pair(node.left, index*2 + 1));
                }
                if (node.right != null) {
                    q.add(new Pair(node.right, index*2 + 2));
                }

            }
            max = Math.max(max, l - f + 1);

        }
        return max;
    }
}
