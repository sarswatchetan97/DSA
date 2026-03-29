import java.util.List;

public class SinglyLinkedList {
    private static ListNode head;

    private static class ListNode {
        private int data; //Generic type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int position, int value) {
        // 1 -> 4 -> 5
        // 1 -> 6 -> 4 -> 5

        ListNode node = new ListNode(value);

        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public ListNode deleteFirst() {
        if(head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLastNode() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void delete(int position) {
        //position is valid and starting from null
        //3 -> 6 -> 2 -> 4 -> null
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean find(ListNode head, int searchKey) {
        if (head == null) {
            return false;
        }

        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode getMiddle() {
        if (head == null) {
            return null;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }

    public ListNode getNthNode(int n) {
        if (head == null) {
            return null;
        }

        if (n < 0) {
            throw new IllegalArgumentException("Invalid value n - " + n);
        }

        ListNode refPtr = head;
        ListNode mainPtr = head;

        int count = 0;

        while (count < n) {
            refPtr = refPtr.next;
            count++;
        }

        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr;
    }

    // Remove Duplicates from SLL
    public void removeDuplicate() {
        if (head == null) {
            return;
        }

        ListNode current = head;

        while (current!=null && current.next!=null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // Insert in sorted singly linked list
    public ListNode insertInSortedSinglyLinkedList(int value) {
        ListNode newNode = new ListNode(11);

        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }

        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    // Remove given key from SLL
    public void deleteNode(int key) {
        ListNode current = head;
        ListNode temp = null;

        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        while (current!=null && current.data!=key) {
            temp = current;
            current = current.next;
        }

        if (current == null) return;
        temp.next = current.next;
    }

    // Detect a loop in SLL
    public boolean containsLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr!=null && fastPtr.next!=null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == fastPtr) {
                return true;
            }
        }

        return false;
    }

    // Method to create loop in SLL
    public void createALoopInLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }


    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createALoopInLinkedList();
        System.out.println(singlyLinkedList.containsLoop());
//        singlyLinkedList.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(11);
//
//        //will connect them together
//        singlyLinkedList.head.next = second;
//        second.next = third;
//        third.next = fourth;

//        singlyLinkedList.display();
//        System.out.println();
//        System.out.println(singlyLinkedList.length());

//        singlyLinkedList.insertFirst(20);
//        singlyLinkedList.insertFirst(0);
//        singlyLinkedList.insertFirst(15);

//        singlyLinkedList.insertLast(11);
//        singlyLinkedList.insertLast(1);
//        singlyLinkedList.insertLast(2);

//        singlyLinkedList.insert(1, 1);
//        singlyLinkedList.insert(2, 1);
//        singlyLinkedList.insert(3, 2);
//        singlyLinkedList.insert(4, 3);
//        singlyLinkedList.insert(5, 3);
//        singlyLinkedList.display();
//        singlyLinkedList.removeDuplicate();
//        System.out.println();
//        singlyLinkedList.display();

//        singlyLinkedList.insertFirst(16);
//        singlyLinkedList.insertFirst(10);
//        singlyLinkedList.insertFirst(8);
//        singlyLinkedList.insertFirst(1);
//        singlyLinkedList.display();
//        singlyLinkedList.insertInSortedSinglyLinkedList(11);
//        singlyLinkedList.display();
//        singlyLinkedList.deleteNode(11);
//        System.out.println();
//        singlyLinkedList.display();
//
//        System.out.println(singlyLinkedList.deleteFirst());
//        singlyLinkedList.display();
//        singlyLinkedList.deleteLastNode();
//        System.out.println();
//        singlyLinkedList.display(head);
//        System.out.println();
//        System.out.println();
//        singlyLinkedList.delete(2);
//        singlyLinkedList.display();
//        System.out.println();
//        singlyLinkedList.delete(3);
//        singlyLinkedList.display();

//        if (singlyLinkedList.find(head, 5)) {
//            System.out.println("Search Key found!!");
//        } else {
//            System.out.println("Search Key not found!!");
//        }
//        ListNode reversedList = singlyLinkedList.reverse(head);
//        singlyLinkedList.display(reversedList);
//        ListNode middleNode = singlyLinkedList.getMiddle();
//        System.out.println("Middle node is: " + middleNode.data);

//        ListNode nthNode = singlyLinkedList.getNthNode(2);
//        System.out.println(nthNode.data);
    }
}
