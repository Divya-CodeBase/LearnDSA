package LinkedList;

public class ReverseLL {
    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

       // System.out.println(reverseList(head));
        System.out.println(reverseList_Recursive(head));

    }

    public static ListNode reverseList(ListNode head) {
        //if head is empty
        if (head == null) return null;

        //Case 2 move front to back

        ListNode pre = null;
        ListNode front = null;
        ListNode curr = head;

        while (curr != null) {
            front= curr.next;
            curr.next= pre;
            pre=curr;
            curr= front;
        }

        head= pre;
        return head;


    }


    public static ListNode reverseList_Recursive(ListNode head) {

        return reverse (head,null);
    }
    static ListNode reverse (ListNode current, ListNode prev){
        if (current == null){
            return prev;
        }
        ListNode next = current.next;
        current.next = prev;
        return reverse(next,current);
    }
}
