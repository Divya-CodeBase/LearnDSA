package Grind75;


import org.w3c.dom.Node;

public class DesignLinkedList {
    public static void main(String args[]) {
        MyLinkedList ll = new MyLinkedList();
    }
}

class MyLinkedList {

    public class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }
    }

    Node head = null;
    Node tail = null;
    int llSize = 0;

    public MyLinkedList() {

    }

    public int get(int index) {
        if ((index < 0) || (index > llSize)) {
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public Node getNodeAtIndex(int index) {
        if ((index < 0) || (index > llSize)) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void addAtHead(int val) {
        Node curr = new Node(val);
        if (llSize == 0) {
            tail = head;
        }
        curr.next = head.next;
        head = curr;
        llSize++;

    }

    public void addAtTail(int val) {
        Node curr = new Node(val);
        if (llSize == 0) {
            addAtHead(val);
        }
        tail.next = curr;
        tail = curr;
        llSize++;

    }


    public void addAtIndex(int index, int val) {

        if (index == 0) {
            addAtHead(val);
        } else if (index == llSize) {
            addAtTail(val);
        } else {
            Node curr = new Node(val);
            Node pre = getNodeAtIndex(index);
            curr.next = pre.next;
            pre.next = curr;
            llSize++;
        }

    }

    public void deleteAtIndex(int index) {
        if (index == 0 || index > llSize) {
            return;
        } else if (index == 0) {
            head = head.next;
        } else if (index == llSize - 1) {
            Node pre = getNodeAtIndex(index - 1);
            pre.next = null;
            tail = pre;
        }
        else{
            Node pre = getNodeAtIndex(index - 1);
            pre.next=pre.next.next;
        }
        llSize--;

    }
}

