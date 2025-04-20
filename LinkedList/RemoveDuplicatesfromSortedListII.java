package LinkedList;

public class RemoveDuplicatesfromSortedListII {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }

            if (prev.next == head) {
                prev = prev.next;
            } else {
                prev.next = head.next;
            }

            head = head.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        RemoveDuplicatesfromSortedListII solution = new RemoveDuplicatesfromSortedListII();
        ListNode result = solution.deleteDuplicates(head);

        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}