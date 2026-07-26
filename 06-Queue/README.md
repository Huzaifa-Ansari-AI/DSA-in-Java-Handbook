# Queue in Java

## Overview

A **Queue** is a **linear data structure** that follows the **FIFO (First In, First Out)** principle.

The first element inserted into the queue is the first element removed.

Queues are widely used in CPU scheduling, printer management, task scheduling, networking, and breadth-first search (BFS).

---

# FIFO Principle

```
Front                             Rear

10   20   30   40

↑                 ↑
Remove          Insert
```

The first inserted element (`10`) is the first one removed.

---

# Basic Operations

## Enqueue

Adds an element at the **rear** of the queue.

**Time Complexity:** `O(1)`

---

## Dequeue

Removes an element from the **front** of the queue.

**Time Complexity:** `O(1)`

---

## Peek (Front)

Returns the front element without removing it.

**Time Complexity:** `O(1)`

---

## isEmpty()

Checks whether the queue is empty.

**Time Complexity:** `O(1)`

---

## isFull()

Checks whether the queue is full (array implementation).

**Time Complexity:** `O(1)`

---

# Queue Conditions

## Overflow

Occurs when an enqueue operation is performed on a full queue.

---

## Underflow

Occurs when a dequeue operation is performed on an empty queue.

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| Enqueue | O(1) |
| Dequeue | O(1) |
| Peek | O(1) |
| isEmpty | O(1) |
| isFull | O(1) |

---

# Advantages

- Fast insertion and deletion
- Maintains processing order
- Simple implementation
- Useful for scheduling tasks

---

# Disadvantages

- Limited access (only front and rear)
- Fixed size in array implementation
- Cannot directly access middle elements

---

# Applications

Queues are commonly used in:

- CPU Scheduling
- Printer Queue
- Task Scheduling
- Network Packet Handling
- Breadth First Search (BFS)
- Call Center Systems
- Messaging Systems

---

# Folder Structure

```
06-Queue/
│
├── README.md
├── QueueArray.java
├── Enqueue.java
├── Dequeue.java
└── Traversal.java
```

---

# Learning Outcomes

After completing this folder, you will be able to:

- Understand the FIFO principle.
- Implement a queue using an array.
- Perform Enqueue and Dequeue operations.
- Detect Queue Overflow and Underflow.
- Analyze queue operations using time complexity.

---

# Summary

A Queue is one of the most fundamental linear data structures.

- It follows the **FIFO (First In, First Out)** principle.
- **Enqueue** inserts an element at the rear.
- **Dequeue** removes an element from the front.
- Queue operations are performed in **O(1)** time, making queues efficient for scheduling and sequential processing.