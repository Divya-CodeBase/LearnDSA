package BinarySearchTree;

import BinaryTree.TreeNode;

import java.util.Stack;

public class BSTIterator {
    Stack<TreeNode> st= new Stack<>();
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);

        BSTIterator bs = new BSTIterator(tree);
    }

    public BSTIterator(TreeNode root) {
        insertAll(root);
    }

    public int next() {
        TreeNode temp= st.pop();
        insertAll(temp);
        return temp.val;

    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

    public void insertAll(TreeNode root){
        while(root!= null){
            st.push(root);
            root=root.left;
        }
    }
}
