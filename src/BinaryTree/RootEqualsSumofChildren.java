package BinaryTree;

public class RootEqualsSumofChildren {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        System.out.println(checkTree(tree));
    }

    public static boolean checkTree(TreeNode root) {

        if(root==null)return false;
        int tot=0;
        if(root.left!= null)tot+=root.left.val;
        if(root.right!= null)tot+=root.right.val;

        return root.val==tot;

    }
}
