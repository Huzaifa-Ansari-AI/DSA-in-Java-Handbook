# Searching Algorithms in Java
     
## Overview 
 
Searching is the process of finding a specific element within a collection of data.

This folder covers the two most fundamental searching algorithms:

- Linear Search
- Binary Search

Understanding these two algorithms provides the foundation for solving most searching problems.

---

# Linear Search

## What is Linear Search?

Linear Search checks each element one by one until the required element is found or the array ends.

### Features

- Works on both sorted and unsorted arrays.
- Simple to understand and implement.
- Suitable for small datasets.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(1) |
| Average | O(n) |
| Worst | O(n) |

### Space Complexity

```
O(1)
```

---

# Binary Search

## What is Binary Search?

Binary Search repeatedly divides a **sorted array** into two halves until the required element is found.

### Features

- Requires a sorted array.
- Much faster than Linear Search for large datasets.
- Uses the divide-and-conquer approach.

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(1) |
| Average | O(log n) |
| Worst | O(log n) |

### Space Complexity

```
O(1)
```

(Iterative implementation)

---

# Linear Search vs Binary Search

| Feature | Linear Search | Binary Search |
|----------|--------------|---------------|
| Data Requirement | Sorted or Unsorted | Sorted Only |
| Method | Sequential | Divide and Conquer |
| Best Case | O(1) | O(1) |
| Worst Case | O(n) | O(log n) |
| Suitable For | Small Data | Large Sorted Data |

---

# Files

- `LinearSearch.java` → Sequential searching
- `BinarySearch.java` → Divide-and-conquer searching

---

# Summary

If the data is **unsorted**, use **Linear Search**.

If the data is **sorted**, **Binary Search** is the preferred choice because it is significantly faster.
