package LinkedList;

public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        int c = 0;
        ListNode curr = head;
        while (curr != null) {
            c++;
            curr = curr.next;
        }

        int mid = c / 2;

        curr = head;
        for (int i = 0; i < mid; i++) {
            curr = curr.next;
        }

        return curr;
    }
}
