package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBTfromPostorderInorder {
    public static void main(String[] args) {

        System.out.println(buildTree(new int[]{40,50,20,60,30,10}, new int[]{40,20,50,10,60,30}));
    }


    public static TreeNode buildTree(int[] postorder, int[] inorder) {
        if (postorder == null || inorder == null || postorder.length != inorder.length) return null;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            mp.put(inorder[i], i);
        }

        TreeNode root = buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, mp);

        return root;
    }

    public static TreeNode buildTree(int[] inorder, int inS, int inE, int[] postorder, int pS, int pE, Map<Integer, Integer> mp) {
        if (pS > pE || inS > inE) return null;

        TreeNode root = new TreeNode(postorder[pE]);

        int curRoot = mp.get(postorder[pE]);
        int left = curRoot - inS;
        root.left = buildTree(inorder, inS, inS + curRoot - 1, postorder, pS, pS + left - 1, mp);
        root.right = buildTree(inorder, curRoot+1, inE, postorder, pS + left , pE - 1, mp);

return root;
    }
}
