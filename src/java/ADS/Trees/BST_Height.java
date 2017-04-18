/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS.Trees;

import java.util.Scanner;


/**
 *
 * @author muralidhar
 */
public class BST_Height {
    static Node root = null;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BST_Height bst = new BST_Height();
        while(n-- >0){
            int data = scan.nextInt();
            bst.insert(data);
        }
        System.out.println("Height is : "+bst.getHeight(root));
    }

    private int getHeight(Node root) {
        int l = 0, r = 0;
        if(root!=null){
            l = getHeight(root.left)+1;
            r = getHeight(root.right)+1;
        }
        return Math.max(l, r);
    }

    public void insert(int data){
        Node node = new Node(data);
        if(root == null) root = node;
        else insertNode(root,node);
    }

    private void insertNode(Node root, Node node) {
        if(node.data<root.data){
            if(root.left == null)root.left = node;
            else insertNode(root.left, node);
        }else{
            if(root.right == null) root.right = node;
            else insertNode(root.right, node);
        }
    }
    
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }
}
