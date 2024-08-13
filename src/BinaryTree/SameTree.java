package BinaryTree;

public class SameTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.left = new TreeNode(2);

        TreeNode tree2 = new TreeNode(1);
        tree2.right = new TreeNode(2);
        tree2.left = new TreeNode(3);


        //  List<Integer> preorderTraversal = preorderTraversal_recursion(tree);
        System.out.println(isSameTree(tree,tree2));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&& q== null){
            return p==q;
        }
        return (p.val==q.val) && isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);
    }
}
