# Hashing in Java

## Overview

**Hashing** is a technique used to store and retrieve data efficiently using a **hash function**.

A hash function converts a key into an array index, allowing fast insertion, searching, and deletion.

Hashing is widely used in databases, caches, dictionaries, symbol tables, and password storage.

---

# Key Concepts

## Hash Function

A hash function maps a key to an index.

Example:

```
Hash Function:

Index = Key % Table Size

Key = 27
Table Size = 10

27 % 10 = 7
```

The key **27** is stored at index **7**.

---

## Hash Table

A Hash Table is a data structure that stores data using a hash function.

```
Index      Data

0
1
2
3         13
4         24
5
6
7         27
8
9
```

---

## Collision

A collision occurs when two different keys produce the same hash index.

Example:

```
Hash Function:

Key % 10

27 % 10 = 7
17 % 10 = 7

Collision occurs.
```

---

# Collision Resolution Techniques

## 1. Linear Probing

Search the next available position.

```
Index

7 → Occupied

8 → Store Here
```

---

## 2. Chaining

Store multiple elements in a linked list at the same index.

```
Index 7

27 → 17 → 37
```

---

# Time Complexity

| Operation | Average | Worst |
|-----------|----------|--------|
| Insert | O(1) | O(n) |
| Search | O(1) | O(n) |
| Delete | O(1) | O(n) |

---

# Advantages

- Very fast searching
- Fast insertion
- Fast deletion
- Simple implementation
- Efficient for large datasets

---

# Disadvantages

- Collisions may occur
- Performance depends on a good hash function
- May waste memory if the table is sparsely filled

---

# Applications

Hashing is used in:

- HashMap
- HashSet
- Database Indexing
- Password Storage
- Caching
- Symbol Tables
- Dictionaries
- Compilers

---

# Folder Structure

```
08-Hashing/
│
├── README.md
└── HashTable.java
```

---

# Learning Outcomes

After completing this folder, you will be able to:

- Understand hashing.
- Understand hash functions.
- Implement a simple hash table.
- Understand collisions.
- Learn basic collision handling.
- Analyze hashing time complexity.

---

# Summary

Hashing is one of the fastest searching techniques.

- Uses a **hash function** to compute an index.
- Stores data in a **hash table**.
- Average search, insertion, and deletion take **O(1)** time.
- Collisions are handled using techniques like **Linear Probing** and **Chaining**.