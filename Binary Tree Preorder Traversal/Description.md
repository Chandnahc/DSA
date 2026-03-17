# [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a binary tree, return the **preorder traversal** of its nodes' values.

**Preorder Traversal Logic:**
1. Visit the **Root**.
2. Traverse the **Left** subtree.
3. Traverse the **Right** subtree.

---

### **Examples**

**Example 1:**

![Preorder Traversal Example 1](https://assets.leetcode.com/uploads/2024/08/29/screenshot-2024-08-29-202743.png)

> **Input:** `root = [1,null,2,3]`  
> **Output:** `[1,2,3]`

**Example 2:**

![Preorder Traversal Example 1](https://assets.leetcode.com/uploads/2024/08/29/tree_2.png)

> **Input:** `root = [1,2,3,4,5,null,8,null,null,6,7,9]`  
> **Output:** `[1,2,4,5,6,7,3,8,9]`

**Example 3:**
> **Input:** `root = []`  
> **Output:** `[]`

**Example 4:**
> **Input:** `root = [1]`  
> **Output:** `[1]`

---

### **Constraints**

- The number of nodes in the tree is in the range `[0, 100]`.
- `-100 <= Node.val <= 100`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We visit every node exactly once.
* **Space Complexity:** $O(n)$  
  In the worst case (a skewed tree), the recursion stack or manual stack will store $n$ nodes. For a balanced tree, it would be $O(\log n)$.

---

### **Approach: Recursive vs. Iterative**



#### **1. Recursive Approach (Intuitive)**
Since a tree is a recursive data structure, the simplest solution is to:
- Add `root.val` to our list.
- Recursively call the function for `root.left`.
- Recursively call the function for `root.right`.

#### **2. Iterative Approach (Using a Stack)**
In an interview, you may be asked to avoid recursion to prevent stack overflow:
1. Initialize an empty **Stack** and push the `root` onto it.
2. While the stack is not empty:
   - **Pop** the top node and add its value to the result list.
   - **Push Right Child** first (so it's processed later).
   - **Push Left Child** second (so it's processed first).
3. Continue until the stack is empty.

---

**Topics:** `Stack` | `Tree` | `Depth-First Search` | `Binary Tree`
