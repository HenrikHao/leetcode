package src;

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode h1 = head, h2 = head;
        while (h2 != null && h2.next != null) {
            h2 = h2.next.next;
            h1 = h1.next;
        }
        return h1;
    }
}
