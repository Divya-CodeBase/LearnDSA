package LinkedList;

public class AddTwoNumbers {
    public static void main(String args[]) {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(addTwoNumbers(list1, list2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode digit = result;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = l1 == null ? 0 : l1.val;
            int digit2 = l2 == null ? 0 : l2.val;

            int sum = digit1 + digit2 + carry;

            int digits = sum % 10;
            carry = sum / 10;

            ListNode newnode = new ListNode(digits);

            result.next = newnode;
            result = result.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

        }

        return digit.next;
    }
}
