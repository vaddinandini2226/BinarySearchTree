/*
 * Program: Binary Search Tree Implementation using Java
 * Description:
 * This program implements a Binary Search Tree (BST) using generics. It supports
 * inserting elements into the tree, performing an inorder traversal to display
 * elements in sorted order, calculating the total number of nodes, and searching
 * for a specific element using recursive traversal while maintaining the BST property.
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

        if (root == null)
            return new Node(data);

        if (data.compareTo(root.data) < 0)
            root.left = addRecursive(root.left, data);

        else if (data.compareTo(root.data) > 0)
            root.right = addRecursive(root.right, data);

        return root;
    }

    public void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public int size(Node root) {

        if (root == null)
            return 0;

        return 1 + size(root.left) + size(root.right);
    }

    public boolean search(Node root, T ele) {

        boolean flag = false;

        if (root == null)
            return false;

        else if (ele.compareTo(root.data) == 0) {
            return true;
        }

        else if (ele.compareTo(root.data) < 0) {
            flag = search(root.left, ele);
        }

        else {
            flag = search(root.right, ele);
        }

        return flag;
    }

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);

        System.out.println("Inorder Traversal:");
        bst.inorder(bst.root);
        System.out.println("\n");
        System.out.println("Size of Binary Tree : " + bst.size(bst.root));
        System.out.println();
        System.out.println("Searching for 63: " + bst.search(bst.root, 63));
    }
}