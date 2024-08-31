package LinkedList;


public class RemoveLinkedListElements {
    public static void main(String args[]) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(2)))));
        //removeElements(head, 2);
        removeElements_recursive(head, 2);
    }

    public static ListNode removeElements(ListNode head, int val) {
    ListNode temp = new ListNode(0);
    temp.next= head;
    ListNode curr= temp;

    while(curr.next!= null){

        if(curr.next.val==val){
            curr.next=curr.next.next;
        }
        else
        curr= curr.next;
    }
    return temp.next;

    }
    public static ListNode removeElements_recursive(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements_recursive(head.next, val);
        return head.val == val ? head.next : head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
