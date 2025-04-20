package LinkedList;

public class basicsll {
    //RECURTION
    public static void displayr(Node head){
        //RECURTION
        if(head==null)return;
        System.out.print(head.data+ " ");
        displayr(head.next);
    }
    public static class Node{
        int data;// value
         Node next;//Address of next node
        Node(int data){ //Constructor
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node x =new Node(5); //Head Node
        Node y =new Node(3);
        Node z =new Node(6);

        // 5  3  6

        x.next = y;  // 5-> 3  6
        y.next = z; // 5-> 3-> 6

//        System.out.println(x.next);//LinkedList.basicsll$Node@6acbcfc0
//        System.out.println(y);//LinkedList.basicsll$Node@6acbcfc0
//        System.out.println(z);
       // System.out.println(x.next.next.data);

        Node temp = x;

//        for(int i=1; i<=3 ; i++){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
        displayr(x); //RECURTION
    }
}
