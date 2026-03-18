# [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a binary tree, return the **postorder traversal** of its nodes' values.

**Postorder Traversal Logic:**
1. Traverse the **Left** subtree.
2. Traverse the **Right** subtree.
3. Visit the **Root**.

---

### **Examples**

**Example 1:**

![Postorder Traversal Example 1](https://assets.leetcode.com/uploads/2024/08/29/screenshot-2024-08-29-202743.png)

> **Input:** `root = [1,null,2,3]`  
> **Output:** `[3,2,1]`  
> **Explanation:** The traversal visits 3, then 2, then 1.

**Example 2:**

![Postorder Traversal Example 2](https://assets.leetcode.com/uploads/2024/08/29/tree_2.png)

> **Input:** `root = [1,2,3,4,5,null,8,null,null,6,7,9]`  
> **Output:** `[4,6,7,5,2,9,8,3,1]`

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
  Every node is visited exactly once.
* **Space Complexity:** $O(n)$  
  The recursion stack can go up to $O(n)$ for a skewed tree, or $O(\log n)$ for a balanced tree.

---

### **Approach: Bottom-Up Processing**



#### **1. Recursive Approach**
This is the most natural way to implement postorder:
- Call `postorder(root.left)`
- Call `postorder(root.right)`
- Add `root.val` to the result.

#### **2. Iterative Approach (The "Reverse Preorder" Trick)**
While a standard iterative postorder is complex, a clever shortcut exists:
1. Perform a modified **Preorder** (Root -> Right -> Left).
2. **Reverse** the final result list.
3. This yields the correct Postorder (Left -> Right -> Root).

---

**Topics:** `Stack` | `Tree` | `Depth-First Search` | `Binary Tree`
