package LinkedList;

public class IntersectionofTwoLinkedLists {


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lengthA = 0;
        while(tempA!=null){
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB = 0;
        while(tempB!=null){
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(lengthA>lengthB){
            int steps = lengthA - lengthB;
            for(int i=1;i<=steps;i++){
                tempA = tempA.next;
            }
        }
        else{
            int steps = lengthB - lengthA;
            for(int i=1;i<=steps;i++){
                tempB = tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }


    public static void main(String[] args) {
        // Create intersecting linked lists for testing
        ListNode commonNode = new ListNode(8);
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        a1.next = a2;
        a2.next = commonNode;
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);
        b1.next = b2;
        b2.next = b3;
        b3.next = commonNode;

        IntersectionofTwoLinkedLists solution = new IntersectionofTwoLinkedLists();
        ListNode intersection = solution.getIntersectionNode(a1, b1);

        if (intersection != null) {
            System.out.println("Intersection at: " + intersection.val); // Output: 8
        } else {
            System.out.println("No intersection");
        }
    }
}