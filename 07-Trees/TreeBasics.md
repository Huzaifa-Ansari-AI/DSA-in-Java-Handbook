# Tree Basics

## Definition

A **Tree** is a non-linear hierarchical data structure made up of **nodes** connected by **edges**.

The topmost node is called the **root**, and every node can have zero or more child nodes.

---

# Basic Terminology

## Root
The first (topmost) node of the tree.

## Parent
A node that has one or more child nodes.

## Child
A node directly connected to a parent.

## Sibling
Nodes that share the same parent.

## Leaf Node
A node with no children.

## Edge
A connection between two nodes.

## Level
The distance of a node from the root.

## Height
The number of edges in the longest path from the root to a leaf.

## Subtree
A smaller tree formed from a node and all of its descendants.

---

# Example

```
        A
      /   \
     B     C
    / \   / \
   D   E F   G
```

| Term | Example |
|------|---------|
| Root | A |
| Parent | B |
| Children of B | D, E |
| Siblings | D and E |
| Leaf Nodes | D, E, F, G |

---

# Types of Trees

- General Tree
- Binary Tree
- Binary Search Tree (BST)
- Full Binary Tree
- Complete Binary Tree
- Perfect Binary Tree
- Balanced Binary Tree

---

# Tree Traversals

### Preorder
Root → Left → Right

### Inorder
Left → Root → Right

### Postorder
Left → Right → Root

### Level Order
Visit nodes level by level.

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| Search (BST Average) | O(log n) |
| Insert (BST Average) | O(log n) |
| Delete (BST Average) | O(log n) |
| Traversal | O(n) |

---

# Applications

- File System
- Database Indexing
- Search Engines
- AI Decision Trees
- HTML/XML DOM
- Compiler Design

---

# Key Takeaways

- Trees are hierarchical, non-linear data structures.
- Every tree starts with a root node.
- Binary Search Trees enable efficient searching.
- Tree traversals are used to visit every node.
- Trees are widely used in modern software systems.