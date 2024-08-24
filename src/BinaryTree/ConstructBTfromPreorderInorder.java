package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBTfromPreorderInorder {
    public static void main(String[] args) {

        System.out.println(buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
    }


    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            mp.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, mp);

        return root;
    }

    public static TreeNode buildTree(int[] preoder, int preS, int preE, int[] inorder, int inS, int inE, Map<Integer, Integer> mp) {
        if(preS>preE||inS>inE)return null;
        TreeNode root = new TreeNode(preoder[preS]);

        int curRoot = mp.get(root.val);

        int left = curRoot - inS;

        root.left = buildTree(preoder, preS + 1, preS + left, inorder, inS, curRoot - 1, mp);
        root.right = buildTree(preoder, preS + left + 1, preE, inorder, curRoot + 1, inE, mp);

        return root;

    }
}
