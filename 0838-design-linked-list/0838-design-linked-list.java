class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node() {}
        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        Node ptr = head;
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        return ptr.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (size == 0) {
            tail = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node ptr = head;
            for (int i = 0; i < index - 1; i++) {
                ptr = ptr.next;
            }
            Node node = new Node(val);
            node.next = ptr.next;
            ptr.next = node;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
            if (size == 1) {
                tail = null;
            }
        } else {
            Node ptr = head;
            for (int i = 0; i < index - 1; i++) {
                ptr = ptr.next;
            }
            ptr.next = ptr.next.next;
            if (index == size - 1) {
                tail = ptr;
            }
        }
        size--;
    }
}
