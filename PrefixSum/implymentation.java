package LinkedList;

public class implymentation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp ;
            }
            else{
                temp.next = head;
                head = temp ;
            }
        }
        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if(idx==size()){ //islia kyuki tail add ho jai
                insertAtEnd(val);
                return;
            } else if (idx==0) {
                insertAtHead(val);
                return;
            } else if (idx<0 || idx>size()) {
                System.out.println("Wrong Input");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

            void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertAtEnd(4);
            ll.insertAtEnd(5);
            ll.insertAtEnd(7);
            ll.insertAtEnd(86);
            ll.display();
        System.out.println();
            ll.insertAtHead(56);
            ll.display();
        ll.insertAt(2,34);
        System.out.println();
        ll.display();

        System.out.println();
        System.out.println("size is: "+ll.size());
        System.out.println("head :"+ll.head.data);
        System.out.println("tail :"+ll.tail.data);
        }
    }
