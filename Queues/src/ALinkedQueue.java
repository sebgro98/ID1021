public class ALinkedQueue {

    public Node head;
    public int length;
    public Node tail;

    public class Node {
        public Integer data;

        public Node next;
        public Node tail;

        public Node(Integer data) {
            this.data = data;
            this.next = null;


        }
    }

    public ALinkedQueue() {
        head = null;
        tail = null;
        this.length = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {

            tail.next = newNode;
            tail = tail.next;
        }
    }
    public Integer remove() {
        Integer returnValue;
        if (head == null) {
            return null;
        }
        returnValue = head.data;
        head = head.next;
        return returnValue;
    }


    public void printForward() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return length == 0;
    }

}

