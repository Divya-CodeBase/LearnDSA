package BinaryTree;

public class ChildrenSumPropertyBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(4);

        changeTreeSum(tree);

System.out.println("hi");
    }

    public static void changeTreeSum(TreeNode root) {
        if (root == null) return;
        int child = 0;
        if (root.left != null) {
            child += root.left.val;
        }
        if (root.right != null) {
            child += root.right.val;
        }
        if (child >= root.val) {
            root.val = child;
        } else {
            if (root.left != null)root.left.val = root.val;
            if (root.right != null)root.right.val = root.val;
        }
        if (root.left != null) changeTreeSum(root.left);
        if (root.right != null) changeTreeSum(root.right);

        int total = 0;
        if (root.right != null)total+=root.right.val;
        if (root.left != null)total+=root.left.val;
        if (root.right != null || root.left != null) root.val = root.left.val + root.right.val;

    }
}
