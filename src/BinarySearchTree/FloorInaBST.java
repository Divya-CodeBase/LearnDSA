package BinarySearchTree;

import BinaryTree.TreeNode;

public class FloorInaBST {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);


        System.out.println(floorBST(tree, 5));
    }

    public static int floorBST(TreeNode root, int val) {
        int floor=-1;
        while(root!=null){
            if(root.val==val){
                floor=root.val;
                return floor;
            }
            if(val>root.val){
                floor= root.val;
                root= root.right;
            }
            else {
                root=root.left;
            }

        }
        return floor;

    }
}
