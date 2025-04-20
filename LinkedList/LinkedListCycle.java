package LinkedList;

public class LinkedListCycle {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null) {
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Example Usage:
        ListNode head = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode zero = new ListNode(0);
        ListNode negFour = new ListNode(-4);

        head.next = two;
        two.next = zero;
        zero.next = negFour;
        negFour.next = two;  // Create a cycle

        LinkedListCycle solution = new LinkedListCycle();
        boolean hasCycle = solution.hasCycle(head);

        System.out.println("Has Cycle: " + hasCycle); // Output: Has Cycle: true
    }
}