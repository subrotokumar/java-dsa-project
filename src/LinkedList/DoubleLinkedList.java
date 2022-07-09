package LinkedList;

import java.util.Scanner;

public class DoubleLinkedList {

    Node head;

    public void insertFirst(int val){
        Node node= new Node(val);
        node.next = head;
        node.prev = null;
        if(head==null){
            head.prev = node;
            head=node;
        }
    }

    private class Node{
        int value;
        Node prev;
        Node next;
        Node(int value){
            this.value=value;
        }
        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
}
