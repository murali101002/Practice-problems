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
public class BinaryTreeTraversal {
    private static Node root;
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(7);
        root.left.left = new Node(8);
        root.left.right = new Node(2);
        root.right.left = new Node(4);
        root.right.right = new Node(9);
        binaryTree.postOrder(root);
        binaryTree.preOrder(root);
        binaryTree.inOrder(root);
    }

    static class Node {
        int key;
        Node left, right;
        Node(int key){
            this.key = key;
            left = right = null;
        }
    }
    static class BinaryTree{
        Node root;
        public BinaryTree() {
            root = null;
        }
        void postOrder(Node node){
            if(node!=null){
                postOrder(node.left);
                postOrder(node.right);
                System.out.println("Post Order:"+node.key);
                
            }
        }
        void inOrder(Node node){
            if(node!=null){
                inOrder(node.left);
                System.err.println("In Order:"+node.key);
                inOrder(node.right);
            }
        }
        void preOrder(Node node){
            if(node!=null){
                System.out.println("Pre Order:"+node.key);
                preOrder(node.left);
                preOrder(node.right);
            }
        }
        
    }

}
