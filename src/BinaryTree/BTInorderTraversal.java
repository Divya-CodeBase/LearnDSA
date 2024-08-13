package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTInorderTraversal {
    static List<Integer> output = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.right.left = new TreeNode(3);


        // Get the preorder traversal of the tree
          List<Integer> inorderTraversal = InorderTraversal_iterate(tree);
       // List<Integer> preorderTraversal_iterate = preorderTraversal_iterate(tree);


        // Print the preorder traversal
        System.out.println("Preorder traversal of the binary tree:");
        for (int value : inorderTraversal) {
            System.out.print(value + "");
        }
    }

    public static List<Integer> inorderTraversal_recursion(TreeNode root) {
        InOrder(root);
        return output;
    }

    public static void InOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        InOrder(root.left);
        output.add(root.val);
        InOrder(root.right);
    }

    public static List<Integer> InorderTraversal_iterate(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        if(root==null){
            return output;
        }
        while (true) {
            if(root!=null){
                st.push(root);
                root= root.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                root= st.pop();
                output.add(root.val);
                root= root.right;
            }
        }
        return output;
    }
}


