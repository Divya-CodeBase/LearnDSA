package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeandDeserializeBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(7);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(6);

        String output= serialize(tree);
        System.out.println(output);
        TreeNode out= deserialize(output);
        System.out.println(out);

    }

    public static String serialize(TreeNode root) {
        if(root==null)return "";
        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
        StringBuilder sb= new StringBuilder();

        while(!q.isEmpty()){
            TreeNode temp= q.poll();

            if(temp==null){
                sb.append("n ");
                continue;
            }
            sb.append(temp.val+" ");
            q.add(temp.left);
            q.add(temp.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if(data=="")return null;
        String s[]= data.split(" ");
        TreeNode root= new TreeNode(Integer.parseInt(s[0]));
        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);

        for(int i=1;i<s.length;i++){
            TreeNode temp= q.poll();
            if(!s[i].equals("n")){
                TreeNode left= new TreeNode(Integer.parseInt(s[i]));
                temp.left= left;
                q.add(left);
            }
            if(!s[++i].equals("n")) {
                TreeNode right = new TreeNode(Integer.parseInt(s[i]));
                temp.right = right;
                q.add(right);
            }
        }
        return root;

    }
}
