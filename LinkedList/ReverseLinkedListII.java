package LinkedList;

public class ReverseLinkedListII {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftPre = dummy;
        ListNode curr = head;

        for (int i = 0; i < left - 1; i++) {
            leftPre = leftPre.next;
            curr = curr.next;
        }

        ListNode subHead = curr; // Start of the sublist to reverse

        ListNode prev = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        leftPre.next = prev;     // Connect the part before the sublist
        subHead.next = curr;    // Connect the part after the sublist
        return dummy.next;
    }

    public static void main(String[] args) {
        // Example Usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int left = 2;
        int right = 4;

        ReverseLinkedListII solution = new ReverseLinkedListII();
        ListNode reversedHead = solution.reverseBetween(head, left, right);

        // Print the reversed list
        ListNode temp = reversedHead;
        while (temp != null) {
            System.out.print(temp.val + " "); // Output: 1 4 3 2 5
            temp = temp.next;
        }
        System.out.println();
    }
}