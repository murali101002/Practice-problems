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
public class FullBinaryTree {
    static Node root = null;
    public static void main(String[] args) {
        root = new Node(9);
        root.left = new Node(6);
//        root.left.left = new Node(2);
        root.right = new Node(11);
        root.right.right = new Node(63);
        root.right.left = new Node(45);
//        root.right.left.left = new Node(23);
        System.out.println("Is Full Binary Tree :"+isFullBinaryTree(root));
    }

    private static boolean isFullBinaryTree(Node root) {
        if(root == null) return true;
        return hasNode(root.left,root.right);
    }

    private static boolean hasNode(Node leftNode, Node rightNode) {
        if(rightNode == null && leftNode == null) return true;
        if(rightNode == null || leftNode == null) return false;
        return hasNode(rightNode.left, rightNode.right) && hasNode(leftNode.left, leftNode.right);
    }

    private static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
