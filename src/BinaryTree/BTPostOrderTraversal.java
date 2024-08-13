package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTPostOrderTraversal {
    static List<Integer> output = new ArrayList<>();

    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.right.left = new TreeNode(3);

        //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
        List<Integer> postorderTraversal_iterate = PostorderTraversal_1Stack(tree);

        // Print the preorder traversal
        System.out.println("Preorder traversal of the binary tree:");
        for (int value : postorderTraversal_iterate) {
            System.out.print(value + "");
        }
    }

    public static List<Integer> PostorderTraversal_recursion(TreeNode root) {
        postOrder(root);
        return output;
    }

    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        output.add(root.val);
    }

    public static List<Integer> PostorderTraversal_2Stack(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        if (root == null) {
            return output;
        }
        st1.add(root);
        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);
            if (root.left != null) {
                st1.add(root.left);

            }
            if (root.right != null) {
                st1.add(root.right);
            }
        }
        while (!st2.isEmpty()) {
            output.add(st2.pop().val);
        }
        return output;
    }

    public static List<Integer> PostorderTraversal_1Stack(TreeNode root){
        Stack<TreeNode>st= new Stack<>();
        TreeNode cur= root;

        while(cur!= null||!st.isEmpty()){
            if(cur!= null) {
                st.push(cur);
                cur = cur.left;
            }
            else{
                TreeNode temp= st.peek().right;
                if(temp==null){
                    temp=st.pop();

                    output.add(temp.val);

                    while(!st.isEmpty()&& temp==st.peek().right){
                        temp= st.pop();
                        output.add(temp.val);
                    }

                }
                else{
                    cur= temp;
                }
            }
        }


return output;

    }
}
