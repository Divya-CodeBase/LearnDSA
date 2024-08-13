package LinkedList;

public class MergeSortedLinkedList {
    public static void main(String args[]) {
        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5)));
        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode curr = result;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = (list1 != null) ? list1 : list2;
        return result.next;
    }

}
