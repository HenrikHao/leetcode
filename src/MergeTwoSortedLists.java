package src;

public class ListNode {
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

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode h = dummyHead, h1 = list1, h2 = list2;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                h.next = h1;
                h1 = h1.next;
            } else {
                h.next = h2;
                h2 = h2.next;
            }
            h = h.next;
        }
        if (h1 != null) {
            h.next = h1;
        }
        if (h2 != null) {
            h.next = h2;
        }
        return dummyHead.next;
    }
}
