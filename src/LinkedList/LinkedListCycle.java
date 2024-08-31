package LinkedList;

public class LinkedListCycle {

    public static void main(String args[]) {
        // ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head1 = new ListNode(10);
        head1.next = new ListNode(15);
        head1.next.next = new ListNode(30);

        // creation of second list
        ListNode head2 = new ListNode(3);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(9);
        head2.next.next.next = head1.next;

        //deleteMiddle(head);
        //System.out.println(hasCycle(head));
        //System.out.println(detectCycle(head));
        System.out.println(getIntersectionNode(head1,head2));
    }


    public static boolean hasCycle(ListNode head) {

        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                while (fast != head) {
                    head = head.next;
                    fast = fast.next;
                }
                return head;
            }
        }
        return null;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)return null;
        ListNode A= headA;
        ListNode B= headB;

        while(A!=B){
            A= A.next;
            B=B.next;
            if(A==B)
                return A;
            if(A==null)A=headB;
            if(B==null)B=headA;
        }
        return A;

    }
}
