package com.company;

import java.util.LinkedList;
import java.util.Queue;
//Remove method does not work. Will be fixed soon.
public class BST {
    Node root;//root
    int size = 0;


    public void add(int value) {
        root = addNode(root, value);
    }

    private Node addNode(Node node, int i) {

        if (node == null) {
            return new Node(i);
        }
        else if (i < node.getValue()) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(i));
            }
            else {
                node.setLeft(addNode(node.getLeft(), i));
            }
        }
        else if (i > node.getValue()) {
            if (node.getRight() == null) {
                node.setRight(new Node(i));
            }
            else {
                node.setRight(addNode(node.getRight(), i));
            }
            size++;
        }
        return node;
    }
    // hyelp
    /*
     public void remove(Node node, int i) {

             if (root == null)
                 return root;


             if (key < root.key)
                 root.left = deleteRec(root.left, key);
             else if (key > root.key)
                 root.right = deleteRec(root.right, key);


             else {
                 // one no children
                 if (root.left == null)
                     return root.right;
                 else if (root.right == null)
                     return root.left;
/*
                 // two children
                 root.key = minValue(root.right);

                 // Delete the inorder successor
                 root.right = deleteRec(root.right, root.key);

    }
    this code == dumpster file
     */
    public void preOrderTraversal() { preOrderTraversalRecursion(root); }
    public void preOrderTraversalRecursion(Node node) {

        if (node == null)
            return;

        System.out.print(node.getValue() + " ");
        //Node
        preOrderTraversalRecursion(node.left);
        //Left
        preOrderTraversalRecursion(node.right);
        //Right
    }


    public void inOrderTraversal() { inOrderTraversalRecursion(root); }
    public void inOrderTraversalRecursion(Node node) {
        if (node == null)
            return;

        inOrderTraversalRecursion(node.left);
        //Left
        System.out.print(node.getValue() + " ");
        //Node
        inOrderTraversalRecursion(node.right);
        //Right
    }



    public void postOrderTraversal() { postOrderTraversalRecursion(root); }
    public void postOrderTraversalRecursion(Node node) {
            if (node == null)
                return;
            postOrderTraversalRecursion(node.left);
            //Left
            postOrderTraversalRecursion(node.right);
            //Right
            System.out.print(node.getValue() + " ");
            //Node
        }


        public void breadthFirstSearchRecursion() {
            Queue queue = new LinkedList();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node node = (Node) queue.remove();
                System.out.print(node.getValue() + " ");
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

    }

    public int TraversalFind(Node node, int i) {
        if (node == null)
            return 0;

        if(node.getValue() == i){
            return i;
        }


        TraversalFind(node.left,i);
        TraversalFind(node.right,i);
        return 0;
    }

    public int find(int i) {
        return TraversalFind(root, i);
    }

    public void clear() {
        root = null;
    }

     public int size() {
        return size;
    }

    class Node {
        int value;
        Node right = null;
        Node left = null;

//setts and gets

        void setValue(int x){
            value = x;
        }
        void setRight(Node x){
            right = x;
        }
        void setLeft(Node x){
            left = x;
        }
        Node getRight(){
            return  right;
        }
        Node getLeft(){
            return  left;
        }
        int getValue(){
            return value;
        }
        Node(int data){
            value = data;
        }
    }
}


