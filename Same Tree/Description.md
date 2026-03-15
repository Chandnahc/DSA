# [100. Same Tree](https://leetcode.com/problems/same-tree/)

## 🟢 Easy

---

### **Problem Statement**

Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not.

Two binary trees are considered the **same** if they are structurally identical, and the nodes have the same value.

---

### **Example 1**

![Same Tree Example 1](https://assets.leetcode.com/uploads/2020/12/20/ex1.jpg)

> **Input:** `p = [1,2,3], q = [1,2,3]`  
> **Output:** `true`

### **Example 2**

![Same Tree Example 2](https://assets.leetcode.com/uploads/2020/12/20/ex2.jpg)

> **Input:** `p = [1,2], q = [1,null,2]`  
> **Output:** `false`

### **Example 3**

![Same Tree Example 3](https://assets.leetcode.com/uploads/2020/12/20/ex3.jpg)

> **Input:** `p = [1,2,1], q = [1,1,2]`  
> **Output:** `false`

---

### **Constraints**

- The number of nodes in both trees is in the range `[0, 100]`.
- `-10^4 <= Node.val <= 10^4`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$ where $n$ is the number of nodes in the smaller tree, as we visit each node once.
* **Space Complexity:** $O(h)$ where $h$ is the height of the tree (recursion stack). In the worst case of a completely unbalanced tree, this is $O(n)$.

---

### **Approach: Recursion**

To determine if two trees are identical, we check three conditions at each node:
1. If both nodes are `null`, the trees are identical at this position (**Base Case**).
2. If only one node is `null`, or the values of the nodes differ, the trees are **not** the same.
3. Recursively check if `p.left` is the same as `q.left` **AND** `p.right` is the same as `q.right`.



---

**Topics:** `Tree` | `Depth-First Search` | `Breadth-First Search` | `Binary Tree`
