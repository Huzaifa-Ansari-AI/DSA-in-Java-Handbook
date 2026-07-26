# Trees in Java

## Overview

A **Tree** is a **non-linear hierarchical data structure** consisting of nodes connected by edges.

Unlike arrays and linked lists (linear structures), trees organize data in parent-child relationships, making them efficient for searching, sorting, and hierarchical data representation.

---

# Basic Terminology

### Node
A single element in a tree.

### Root
The topmost node of the tree.

### Parent
A node that has one or more child nodes.

### Child
A node directly connected below a parent.

### Leaf Node
A node with no children.

### Edge
The connection between two nodes.

### Level
The position of a node from the root.

### Height
The longest path from the root to a leaf.

### Subtree
A tree formed from any node and its descendants.

---

# Basic Structure

```
        A
      /   \
     B     C
    / \   / \
   D   E F   G
```

- Root = A
- Parent of D = B
- Children of B = D, E
- Leaf Nodes = D, E, F, G

---

# Types of Trees

## General Tree
A node can have any number of children.

## Binary Tree
Each node has at most two children.

## Binary Search Tree (BST)
A binary tree where:

- Left child < Parent
- Right child > Parent

## Full Binary Tree
Every node has either 0 or 2 children.

## Complete Binary Tree
All levels are completely filled except possibly the last level.

## Perfect Binary Tree
Every internal node has two children and all leaves are at the same level.

## Balanced Binary Tree
The height difference between left and right subtrees is minimal.

---

# Tree Traversals

| Traversal | Order |
|-----------|-------|
| Preorder | Root → Left → Right |
| Inorder | Left → Root → Right |
| Postorder | Left → Right → Root |
| Level Order | Level by Level |

---

# Time Complexity

| Operation | Binary Search Tree |
|-----------|--------------------|
| Search | O(log n) (Average) |
| Insert | O(log n) (Average) |
| Delete | O(log n) (Average) |
| Traversal | O(n) |

---

# Advantages

- Fast searching
- Dynamic structure
- Efficient insertion and deletion
- Represents hierarchical data naturally

---

# Applications

Trees are widely used in:

- File systems
- Database indexing
- Search engines
- Decision trees
- XML/HTML documents
- Artificial Intelligence
- Compiler design

---

# Folder Structure

```
07-Trees/
│
├── README.md
├── TreeBasics.md
├── BinaryTree.java
├── BST.java
└── Traversals.java
```

---

# Learning Outcomes

After completing this folder, you will be able to:

- Understand tree terminology.
- Differentiate between tree types.
- Perform tree traversals.
- Understand Binary Search Trees.
- Analyze tree operations using time complexity.

---

# Summary

Trees are one of the most important non-linear data structures.

- They organize data hierarchically.
- Binary Search Trees provide efficient searching.
- Tree traversals are essential for visiting nodes.
- Trees are widely used in real-world software and algorithms.