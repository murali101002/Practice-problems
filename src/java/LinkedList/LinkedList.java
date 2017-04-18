package LinkedList;

import java.util.ArrayList;

public class LinkedList {
    Node head;
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.head = new Node(1);
        Node sec = new Node(2);
        Node three = new Node(3);
        lList.head.next = sec;
        sec.next = three;
        lList.push(4);
        lList.insertAfter(lList.head.next.next,5);
        lList.append(6);
        lList.printList();
        lList.pop(5);
        lList.printList();
    }

    private void printList() {
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    private void push(int i) {
        System.out.println("Pushing value in to Linked List");
        Node n = new Node(i);
        n.next = head;
        head = n;
    }

     private void append(int i) {
         System.out.println("Appending value in to Linked List");
         Node newNode = new Node(i);
        if(head == null){
            head = newNode;
        }else{
          newNode.next = null;
          Node last = head;
          while(last.next!=null){
              last = last.next;
          }
          last.next = newNode;
        }
    }

    private void insertAfter(Node head, int i) {
        System.out.println("Inserting after in to Linked List");
        if(head == null){
            System.out.println("Head cannot be null to perform this operation.");
        }else{
             Node newNode = new Node(i);
             newNode.next = head.next;
             head.next = newNode;
        }
    }

    private Node last() {
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        return last;
    }

    private void pop(int i) {
        Node temp = head, prev = null;
        if(temp!=null && temp.data == i){
            head = temp.next;
            return;
        }
        while(temp!=null && temp.data != i){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return;
        prev.next = temp.next;
    }

    private static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
