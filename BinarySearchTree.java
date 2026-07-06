/*
 * Program: Binary Search Tree Implementation using Java
 * Description:
 * This program implements a Binary Search Tree (BST) using generics. It supports
 * inserting elements into the tree and performing an inorder traversal, which
 * displays the elements in sorted order according to the Binary Search Tree property.
 */
package datastructures;
public class BinarySearchTree<T extends Comparable<T>> {

    class Node {
        T data;
        Node left;
        Node right;

        Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    public void add(T data) {
        root = addRecursive(root, data);
    }
    private Node addRecursive(Node root, T data) {

        if (root == null) {
            return new Node(data);
        }

        if (data.compareTo(root.data) < 0) {
            root.left = addRecursive(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = addRecursive(root.right, data);
        }

        return root;
    }
    public void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        System.out.println("Inorder Traversal:");
        bst.inorder(bst.root);
    }
}