# Sorting Algorithms in Java    
     
## Overview

Sorting is the process of arranging data in a specific order, usually **ascending** or **descending**.

Sorting improves the efficiency of searching, data processing, and many other algorithms.

This folder contains implementations of the most fundamental sorting algorithms in Java.

---

# Algorithms Covered

- Bubble Sort
- Selection Sort
- Insertion Sort
- Quick Sort

---

# Bubble Sort

## What is Bubble Sort?

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

### Characteristics

- Simple to understand
- Stable sorting algorithm
- In-place sorting
- Suitable for small datasets

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n) *(Optimized)* |
| Average | O(n²) |
| Worst | O(n²) |

### Space Complexity

```
O(1)
```

---

# Selection Sort

## What is Selection Sort?

Selection Sort repeatedly finds the smallest element from the unsorted portion of the array and places it in its correct position.

### Characteristics

- Simple implementation
- In-place sorting
- Performs fewer swaps than Bubble Sort
- Not stable by default

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n²) |
| Average | O(n²) |
| Worst | O(n²) |

### Space Complexity

```
O(1)
```

---

# Insertion Sort

## What is Insertion Sort?

Insertion Sort builds the sorted array one element at a time by inserting each element into its correct position.

### Characteristics

- Stable sorting algorithm
- In-place sorting
- Efficient for small or nearly sorted datasets

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n) |
| Average | O(n²) |
| Worst | O(n²) |

### Space Complexity

```
O(1)
```

---

# Quick Sort

## What is Quick Sort?

Quick Sort is a **divide-and-conquer** sorting algorithm that selects a **pivot** element and partitions the array into two parts.

### Characteristics

- Very fast in practice
- Recursive algorithm
- In-place sorting
- Performance depends on pivot selection

### Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n²) |

### Space Complexity

| Case | Complexity |
|------|------------|
| Average | O(log n) |
| Worst | O(n) |

---

# Comparison of Sorting Algorithms

| Algorithm | Best | Average | Worst | Space | Stable |
|-----------|------|----------|--------|--------|--------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | ✅ Yes |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | ❌ No |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | ✅ Yes |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | ❌ No |

---

# Which Algorithm Should You Use?

| Situation | Recommended Algorithm |
|------------|----------------------|
| Small dataset | Bubble Sort |
| Nearly sorted data | Insertion Sort |
| Fewer swaps required | Selection Sort |
| Large datasets | Quick Sort |

---

# Folder Structure

```
03-Sorting/
│
├── README.md
├── BubbleSort.java
├── SelectionSort.java
├── InsertionSort.java
└── QuickSort.java
```

---

# Learning Outcomes

After completing this folder, you will be able to:

- Understand how sorting algorithms work.
- Compare different sorting techniques.
- Analyze time and space complexity.
- Choose the appropriate sorting algorithm for different scenarios.
- Implement sorting algorithms in Java.

---

# Summary

Sorting is one of the most fundamental concepts in Data Structures and Algorithms.

- **Bubble Sort** is simple and beginner-friendly.
- **Selection Sort** minimizes the number of swaps.
- **Insertion Sort** performs well on small or nearly sorted data.
- **Quick Sort** is the preferred choice for large datasets because of its excellent average-case performance.
