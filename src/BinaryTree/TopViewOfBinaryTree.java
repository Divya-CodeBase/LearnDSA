package BinaryTree;

import java.util.*;

class TopViewOfBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        System.out.println(topView(tree));


    }

    public static List<Integer> topView(TreeNode root) {

        List<Integer> output = new ArrayList<>();
        Map<Integer,Integer> mp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        if(root==null)return output;
        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair p= q.poll();
            TreeNode temp= p.a;
            int col= p.b;

            if(!mp.containsKey(col)){
                mp.put(col,temp.val);
            }
            if(temp.left!= null){
                q.add(new Pair(temp.left,col-1));
            }
            if(temp.right!= null){
                q.add(new Pair(temp.right,col+1));
            }

        }
        for(Map.Entry<Integer,Integer> p: mp.entrySet()){
            output.add(p.getValue());
        }
        return output;


    }
}
