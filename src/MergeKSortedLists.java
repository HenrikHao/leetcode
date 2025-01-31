package src;


import java.util.PriorityQueue;

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        // this comparator will return th element in ascending order
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                lists.length, (a, b)->(a.val - b.val));
        for (ListNode head: lists) {
            if (head != null) {
                pq.add(head);
            }
        }
        while (!pq.isEmpty()) {
            ListNode temp = pq.poll();
            p.next = temp;
            if (temp.next != null) {
                pq.add(temp.next);
            }
            p = p.next;
        }
        return dummyHead.next;
    }
}
