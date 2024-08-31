package LinkedList;

public class RemoveNodeFromLL {
    public static int curSize = 0;

    public static void main(String args[]) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(6);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(3);
        //System.out.println(deletenthNode(head, 4));
        System.out.println(removeNthFromEnd(head, 5));

    }

    public static ListNode deletenthNode(ListNode head, int n) {
        //Case 1: head is null
        if (head == null) return null;

        //case 2: head is to be deleted-> position 1 or if only one node
        if (n == 1) {
            if (head.next == null) {
                return null;
            }
            head = head.next;
            return head;
        }
        //case 3 : delete at index
        ListNode pre = null;
        ListNode temp = head;
        for (int i = 1; temp != null && i < n; i++) {
            pre = temp;
            temp = temp.next;
        }
        if (temp != null) {
            pre.next = temp.next;
        }
        return head;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //Case 1: if head is empty
        if (head == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; fast != null && i < n; i++) {
            fast = fast.next;
        }
//case 2: if n >lll size
        if (fast == null)
            return head.next;

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
