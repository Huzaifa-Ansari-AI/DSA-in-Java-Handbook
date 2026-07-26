# Stack in Java

## Overview

A **Stack** is a **linear data structure** that follows the **LIFO (Last In, First Out)** principle.

The last element inserted into the stack is the first element to be removed.

Stacks are widely used in function calls, expression evaluation, undo/redo operations, browser history, and backtracking algorithms.

---

# LIFO Principle

```
Top
│
│ 40  ← Removed First
│ 30
│ 20
│ 10  ← Removed Last
└──────────────
```

The last inserted element (`40`) is the first one removed.

---

# Basic Operations

## Push

Adds a new element to the **top** of the stack.

**Time Complexity:** `O(1)`

---

## Pop

Removes the element from the **top** of the stack.

**Time Complexity:** `O(1)`

---

## Peek (Top)

Returns the top element without removing it.

**Time Complexity:** `O(1)`

---

## isEmpty()

Checks whether the stack is empty.

**Time Complexity:** `O(1)`

---

## isFull()

Checks whether the stack has reached its maximum capacity (for array-based stacks).

**Time Complexity:** `O(1)`

---

# Stack Conditions

## Overflow

Overflow occurs when a **push** operation is performed on a **full stack**.

Example:

```
Stack Size = 5

[10]
[20]
[30]
[40]
[50]

Push(60)

Result:
Stack Overflow
```

---

## Underflow

Underflow occurs when a **pop** operation is performed on an **empty stack**.

Example:

```
Stack

(empty)

Pop()

Result:
Stack Underflow
```

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| Push | O(1) |
| Pop | O(1) |
| Peek | O(1) |
| isEmpty | O(1) |
| isFull | O(1) |

---

# Advantages

- Fast insertion and deletion
- Simple implementation
- Efficient memory usage
- Useful for recursive algorithms

---

# Disadvantages

- Limited access (only top element)
- Fixed size in array implementation
- Cannot directly access middle elements

---

# Applications

Stacks are commonly used in:

- Function call management
- Recursion
- Undo / Redo functionality
- Browser history
- Parentheses matching
- Expression evaluation
- Expression conversion (Infix, Prefix, Postfix)
- Backtracking algorithms
- Depth First Search (DFS)

---

# Folder Structure

```
05-Stack/
│
├── README.md
├── StackArray.java
├── Push.java
├── Pop.java
├── Overflow.java
└── Underflow.java
```

---

# Learning Outcomes

After completing this folder, you will be able to:

- Understand the LIFO principle.
- Implement a stack using an array.
- Perform Push and Pop operations.
- Detect Stack Overflow and Underflow.
- Analyze stack operations using time complexity.
- Apply stacks to common real-world problems.

---

# Summary

A Stack is one of the most fundamental data structures in DSA.

- It follows the **LIFO (Last In, First Out)** principle.
- **Push** inserts an element.
- **Pop** removes the top element.
- **Overflow** occurs when pushing into a full stack.
- **Underflow** occurs when popping from an empty stack.

Because all major operations run in **O(1)** time, stacks are highly efficient and are widely used in software development and algorithm design.