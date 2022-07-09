package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public LinkedList() {
        this.size = 0;
    }

    void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size ++;
    }

    void insertLast(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size ++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Insert
    public void insertRec(int val, int index){
        head=insertRecursion(val,index,head);
    }
    public Node insertRecursion(int val, int index, Node node){
        if(index==0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        insertRecursion(val, index--, node.next);
        return node;
    }

    public Integer deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
    }

}
