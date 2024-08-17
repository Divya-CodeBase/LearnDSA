package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class RootToNodePAth {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(4);

        System.out.println(binaryTreePaths(tree,4));


    }

    public static List<Integer> binaryTreePaths(TreeNode root,int k) {
        List<Integer> output= new ArrayList<>();
        if (root==null)return output;
        getpath(root,output,k);
        return output;
    }
    static boolean getpath (TreeNode root, List<Integer>lt, int k){
        if (root==null)return false;
        lt.add(root.val);
        if(root.val==k) return true;
        if(getpath(root.left,lt,k)||getpath(root.right,lt,k))return true;
        lt.remove(lt.size()-1);
        return false;

        }


}
