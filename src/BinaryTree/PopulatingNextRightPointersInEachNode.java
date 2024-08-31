package BinaryTree;
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class PopulatingNextRightPointersInEachNode {

    public static Node connect(Node root) {
        if(root==null)return null;
        if(root.left!= null){
            root.left.next=root.right;
        }
        if(root.right!= null&& root.next!= null){
            root.right.next=root.next.left;
        }
        connect(root.left);
        connect(root.left);
        return root;
    }

    public static Node connect_2(Node root) {
        if(root==null)return null;
       connection(root.left,root.right);
    }
    public static void connection(Node root1,Node root2) {
        if(root1==null&&root2==null)return;

        connection(root1.left,root1.right);
        connection(root1.right,root2.left);
        connection(root2.left,root2.right);


    }

}
