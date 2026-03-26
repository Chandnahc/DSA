# [222. Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a **complete** binary tree, return the number of nodes in the tree.

**Definition of a Complete Binary Tree:**
Every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between $1$ and $2^h$ nodes inclusive at the last level $h$.

**Requirement:** Design an algorithm that runs in **less than $O(n)$** time complexity.

---

### **Examples**

**Example 1:**

![Complete Binary Tree Example 1](https://assets.leetcode.com/uploads/2021/01/14/complete.jpg)

> **Input:** `root = [1,2,3,4,5,6]`  
> **Output:** `6`

**Example 2:**
> **Input:** `root = []`  
> **Output:** `0`

**Example 3:**
> **Input:** `root = [1]`  
> **Output:** `1`

---

### **Constraints**

- The number of nodes in the tree is in the range `[0, 5 * 10^4]`.
- `0 <= Node.val <= 5 * 10^4`
- The tree is guaranteed to be **complete**.

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log^2 n)$  
  In each step, we compute the height of the tree ($O(\log n)$) and we do this for each level of the tree ($O(\log n)$).
* **Space Complexity:** $O(\log n)$  
  The space used by the recursion stack.

---

### **Approach: Leveraging "Completeness"**



In a **Perfect Binary Tree** of height $h$, the total number of nodes is exactly $2^h - 1$. We can use this property to avoid visiting every node.

1.  **Calculate Left and Right Heights:** * Find the height of the leftmost path (`leftHeight`).
    * Find the height of the rightmost path (`rightHeight`).
2.  **Compare Heights:**
    * **If `leftHeight == rightHeight`:** The tree is a *perfect* binary tree. Use the formula: $\text{nodes} = 2^{\text{height}} - 1$.
    * **If `leftHeight != rightHeight`:** The tree is not perfect. We solve the problem recursively: $1 + \text{countNodes(left)} + \text{countNodes(right)}$.
3.  **Efficiency:** Because it is a complete tree, at least one of the subtrees (left or right) will always be a perfect binary tree at every step, allowing us to prune half the search space.

---

**Topics:** `Binary Search` | `Bit Manipulation` | `Tree` | `Binary Tree`
