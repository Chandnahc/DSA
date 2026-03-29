# [257. Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a binary tree, return **all root-to-leaf paths** in **any order**.

A **leaf** is a node with no children.

---

### **Examples**

**Example 1:**

![Binary Tree Paths Example 1](https://assets.leetcode.com/uploads/2021/03/12/paths-tree.jpg)

> **Input:** `root = [1,2,3,null,5]`  
> **Output:** `["1->2->5","1->3"]`

**Example 2:**
> **Input:** `root = [1]`  
> **Output:** `["1"]`

---

### **Constraints**

- The number of nodes in the tree is in the range `[1, 100]`.
- `-100 <= Node.val <= 100`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We visit every node in the binary tree exactly once.
* **Space Complexity:** $O(h)$  
  Where $h$ is the height of the tree. This space is taken by the recursion stack. In a balanced tree, $h = \log n$; in a skewed tree, $h = n$.

---

### **Approach: Depth-First Search (DFS) / Recursion**



To find all paths, we use a recursive DFS approach that keeps track of the "current path" string as it moves down the tree.

#### **The Strategy:**
1.  **Base Case:** If the current node is `null`, return.
2.  **Append to Path:** Add the current node's value to the path string.
3.  **Check for Leaf:** If the current node has no left or right children, it is a **leaf**. Add the completed path string to our result list.
4.  **Recursive Step:** If it's not a leaf, add `"->"` to the path and recursively call the function for both the left and right children.

#### **Implementation Detail:**
Using a string to pass the path by value (in languages like Java or C++) or using a list that you pop from (standard backtracking) ensures that when the recursion "backtracks" to a parent node, the path doesn't contain the nodes from the previously explored branch.

---

**Topics:** `String` | `Backtracking` | `Tree` | `Depth-First Search` | `Binary Tree`
