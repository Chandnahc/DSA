# [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a binary tree, return its **maximum depth**.

A binary tree's **maximum depth** is the number of nodes along the longest path from the root node down to the farthest leaf node.

---

### **Example 1**

![Binary Tree](https://assets.leetcode.com/uploads/2020/11/26/tmp-tree.jpg)

> **Input:** `root = [3, 9, 20, null, null, 15, 7]`  
> **Output:** `3`  
> **Explanation:** The longest path is `3 -> 20 -> 15` (or `3 -> 20 -> 7`), which has 3 nodes.

### **Example 2**

> **Input:** `root = [1, null, 2]`  
> **Output:** `2`

---

### **Constraints**

- The number of nodes in the tree is in the range `[0, 10^4]`.
- `-100 <= Node.val <= 100`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$ where $n$ is the number of nodes in the tree, as we must visit each node once.
* **Space Complexity:** * **Best Case:** $O(\log n)$ for a balanced tree (height of the tree).
    * **Worst Case:** $O(n)$ for a skewed tree (recursion stack depth).

---

### **Approaches**

#### **1. Recursive Depth-First Search (DFS)**
The depth of a node is $1 + \max(\text{depth of left child, depth of right child})$. This is the most common and concise solution.

#### **2. Iterative Breadth-First Search (BFS)**
Use a queue to traverse the tree level by level. The number of levels equals the maximum depth.

---

**Topics:** `Tree` | `Depth-First Search` | `Breadth-First Search` | `Binary Tree`
