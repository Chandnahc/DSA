# [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a binary tree, invert the tree, and return its root. Inverting a binary tree means swapping every left and right child for every node in the tree.

---

### **Examples**

**Example 1:**

![Invert Binary Tree Example 1](https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg)

> **Input:** `root = [4,2,7,1,3,6,9]`  
> **Output:** `[4,7,2,9,6,3,1]`

**Example 2:**

![Invert Binary Tree Example 2](https://assets.leetcode.com/uploads/2021/03/14/invert2-tree.jpg)

> **Input:** `root = [2,1,3]`  
> **Output:** `[2,3,1]`

**Example 3:**
> **Input:** `root = []`  
> **Output:** `[]`

---

### **Constraints**

- The number of nodes in the tree is in the range `[0, 100]`.
- `-100 <= Node.val <= 100`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We must visit every node in the tree exactly once to swap its children.
* **Space Complexity:** $O(h)$  
  Where $h$ is the height of the tree. This space is used by the recursion stack. In the worst case (a skewed tree), $h = n$.

---

### **Approach: Recursive Post-Order Traversal**



The most intuitive way to solve this is using recursion. Think of it as a "Bottom-Up" approach:

1.  **Base Case:** If the `root` is `null`, return `null`.
2.  **Recursive Step:** * Recursively call `invertTree` on the left child.
    * Recursively call `invertTree` on the right child.
3.  **Swap:** After the children are processed, swap the `root.left` and `root.right` pointers.
4.  **Return:** Return the `root`.

#### **Alternative: Iterative (BFS)**
You can also solve this using a **Queue** (Breadth-First Search). For every node you pull from the queue, swap its children and then add the children to the queue to be processed later. This is often preferred if the tree is very deep to avoid a stack overflow.

---

**Topics:** `Tree` | `Depth-First Search` | `Breadth-First Search` | `Binary Tree`
