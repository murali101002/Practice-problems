/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS.Trees;

/**
 *
 * @author muralidhar
 */
public class BalancedTree {
    static Node root = null;
//    static int l=0,r=0;
    public static void main(String[] args) {
        root = new Node(9);
        root.left = new Node(6);
        root.left.left = new Node(2);
        root.right = new Node(11);
        root.right.right = new Node(63);
        root.right.left = new Node(45);
        root.right.left.left = new Node(23);
        System.out.println("Height is : "+getHeight(root));
        System.out.println("Is Balanced : "+balanced(root));
    }

    private static int getHeight(Node root) {
        if(root==null)return 0;
        return Math.max(getHeight(root.left), getHeight(root.right))+1;
    }

    private static boolean balanced(Node root) {
        int l = 0, r = 0;
        if(root == null) return true;
        l = getHeight(root.left);
        r = getHeight(root.right);
        return (Math.abs(l-r)<=1)&&balanced(root.left)&&balanced(root.right);
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

