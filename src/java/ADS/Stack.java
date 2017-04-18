/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS;



/**
 *
 * @author muralidhar
 */
public class Stack {
    private Node head = null;
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(23);
        stack.push(54);
        stack.push(14);
        stack.push(78);
        stack.push(69);
        stack.push(32);
        stack.push(65);
        stack.push(12);
        stack.push(78);
        stack.push(57);
        stack.pop();
        stack.display();
        
        
    }

    private void push(int i) {
        Node newNode = new Node(i);
        newNode.next = head;
//        newNode.prev = head;
        head = newNode;
    }

    private void pop() {
        if(head!=null){
            head = head.next;
        }
    }

    private void display() {
//        System.out.println(head.data);
        if(head!=null){
            while(head.next!=null){
                System.out.println(head.data);
                head = head.next;
            }
            System.out.println(head.data);
        }
    }
    private class Node{
        int data;
        Node next, prev;
        public Node(int data) {
            this.data = data;
            next = null;
        }
        
    }
    
}
