package BinaryTree;

import java.util.ArrayList;
import java.util.List;

import java.util.Stack;

class Pair {
    TreeNode a = new TreeNode();
    int b;

    Pair(TreeNode a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class BTPreInPostOrderTraversal {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.right.left = new TreeNode(3);

        //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
        getTreeTraversal(tree);


    }

    public static void getTreeTraversal(TreeNode root) {

        // Write your code here.
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        Stack<Pair> st = new Stack<Pair>();
        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {
            Pair b = st.pop();

            if (b.b == 1) {
                pre.add(b.a.val);
                b.b++;
                st.push(b);
                if (b.a.left != null) {
                    st.push(new Pair(b.a.left, 1));
                }
            } else if (b.b == 2) {
                in.add(b.a.val);
                b.b++;
                st.push(b);
                if (b.a.right != null) {
                    st.push(new Pair(b.a.right, 1));
                }
            } else {
                post.add(b.a.val);
            }
        }
    }
}
