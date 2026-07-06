# Binary Search Tree Implementation using Java

## Overview
This repository contains Java implementations of the **Binary Search Tree (BST)** data structure using Java Generics. The programs demonstrate the fundamental operations of a BST, including insertion, traversal, size calculation, and searching while maintaining the Binary Search Tree property.

## Branch
**dev**

## Programs Included

### 1. Binary Search Tree Insertion and Inorder Traversal
This program demonstrates the basic implementation of a Binary Search Tree by inserting elements recursively and displaying them using inorder traversal.

**Operations Covered**
- Insert nodes into the BST
- Recursive insertion
- Inorder traversal (Sorted Order)

---

### 2. Binary Search Tree Size Calculation
This program extends the basic BST implementation by calculating the total number of nodes present in the tree.

**Operations Covered**
- Insert nodes
- Inorder traversal
- Calculate the size of the tree recursively

---

### 3. Binary Search Tree Search Operation
This program further enhances the BST by implementing recursive searching of an element.

**Operations Covered**
- Insert nodes
- Inorder traversal
- Calculate tree size
- Search for an element in the BST

---

## Data Structure Used
- Binary Search Tree (BST)
- Binary Tree
- Recursion
- Java Generics

## Binary Search Tree Property

For every node in the tree:

- All values in the left subtree are smaller than the node.
- All values in the right subtree are greater than the node.
- Both left and right subtrees are themselves Binary Search Trees.

## Example

### Elements Inserted

```
56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67
```

### Inorder Traversal

```
3 11 16 22 30 40 56 60 63 65 67 70 95
```

### Size of Tree

```
13
```

### Search Operation

```
Search(63) → true
Search(100) → false
```

## Time Complexity

| Operation | Average Case | Worst Case |
|-----------|--------------|------------|
| Insert | O(log n) | O(n) |
| Search | O(log n) | O(n) |
| Inorder Traversal | O(n) | O(n) |
| Size | O(n) | O(n) |

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Java Generics
- Recursion
- Binary Trees

## Learning Outcomes
- Understand the Binary Search Tree data structure.
- Learn recursive insertion into a BST.
- Perform inorder traversal to obtain sorted data.
- Calculate the total number of nodes in a tree.
- Search for elements efficiently using the BST property.
- Build a generic Binary Search Tree without using Java Collections.

## Future Enhancements
- Implement node deletion.
- Find minimum and maximum elements.
- Calculate tree height.
- Check whether the tree is balanced.
- Perform preorder and postorder traversals.
- Implement level-order traversal using a queue.
- Support AVL Tree and Red-Black Tree implementations.

---

**Author:** Vaddi Nandini
