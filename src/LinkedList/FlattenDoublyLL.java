package LinkedList;

public class FlattenDoublyLL {
    static Node head;

    class Node {

        int data;
        Node next, pre,child;

        Node(int d) {
            data = d;
            pre=next = child = null;
        }
    }

    // A utility function to create a linked list with n nodes. The data
    // of nodes is taken from arr[].  All child pointers are set as NULL
    Node createList(int arr[], int n) {
        Node node = null;
        Node p = null;

        int i;
        for (i = 0; i < n; ++i) {
            if (node == null) {
                node = p = new Node(arr[i]);
            } else {
                p.next = new Node(arr[i]);
                p = p.next;
            }
            p.next = p.child = null;
        }
        return node;
    }

    // A utility function to print all nodes of a linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("");
    }

    Node createList() {
        int arr1[] = new int[]{10, 5, 12, 7, 11};
        int arr2[] = new int[]{4, 20, 13};
        int arr3[] = new int[]{17, 6};


        /* create 8 linked lists */
        Node head1 = createList(arr1, arr1.length);
        Node head2 = createList(arr2, arr2.length);
        Node head3 = createList(arr3, arr3.length);


        /* modify child pointers to create the list shown above */
        head1.child = head2;
        head2.next.child=head3;


        /* Return head pointer of first linked list.  Note that all nodes are
         reachable from head1 */
        return head1;
    }

    public static void main(String[] args) {

        FlattenDoublyLL list = new FlattenDoublyLL();
        head = list.createList();
        list.flatten(head);
        list.printList(head);
    }


    public Node flatten(Node head) {
        if(head==null)return null;
        Node curr= head;

        while(curr!= null){
            if(curr.child== null){
                curr=curr.next;
            }
            else{
                Node temp= curr.child;
                while(temp.next!= null){
                    temp= temp.next;
                }
                if(curr.next!= null){
                    curr.next.pre=temp;
                }

                temp.next=curr.next;

                curr.next=curr.child;
                curr.child.pre=curr;
                curr.child=null;

            }
        }
        return head;




    }

}
