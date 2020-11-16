package com.company;

public class Main {


    public static void main(String[] args) {
        BST bst = new BST();

        bst.add(5);
        bst.add(9);
        bst.add(4);
        bst.add(3);
        bst.add(7);
        bst.add(10);
        bst.add(1);

        System.out.print("Pre Order:");
        bst.preOrderTraversal();
        System.out.println();

        System.out.print("In Order:");
        bst.inOrderTraversal();
        System.out.println();

        System.out.print("Post Order:");
        bst.postOrderTraversal();
        System.out.println();

        System.out.print("Breadth first:");
        bst.breadthFirstSearchRecursion();
        System.out.println();

        System.out.println("Find: " + bst.find(20));
    }
}
