# [617. Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/)

## 🟢 Easy

---

### **Problem Statement**

You are given two binary trees `root1` and `root2`.

Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. 

**The merge rule:** 
- If two nodes overlap, sum their values as the new value of the merged node. 
- Otherwise, the non-null node will be used as the node of the new tree.

Return the merged tree.

**Note:** The merging process must start from the root nodes of both trees.

---

### **Examples**

**Example 1:**

![example_1](https://assets.leetcode.com/uploads/2021/02/05/merge.jpg)

> **Input:** `root1 = [1,3,2,5]`, `root2 = [2,1,3,null,4,null,7]`  
> **Output:** `[3,4,5,5,4,null,7]`

**Example 2:**
> **Input:** `root1 = [1]`, `root2 = [1,2]`  
> **Output:** `[2,2]`

---

### **Constraints**

- The number of nodes in both trees is in the range $[0, 2000]$.
- $-10^4 \le \text{Node.val} \le 10^4$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  Where $n$ is the total number of nodes in the smaller tree (or rather, the overlapping region), as we must visit each overlapping node once.
* **Space Complexity:** $O(h)$  
  Where $h$ is the height of the tree. This space is used by the recursion stack. In the worst case (a skewed tree), $h = n$.

---

### **Approach: Recursive Depth-First Search (DFS)**

The most elegant way to solve this is using recursion. We traverse both trees simultaneously and build the merged tree as we go.

#### **Implementation Logic**
1. **Base Cases:**
   - If `root1` is null, return `root2` (the non-null part).
   - If `root2` is null, return `root1`.
   - If both are null, it returns null (handled by the conditions above).

2. **Merging Logic:**
   - Create a new node (or modify `root1` in place) with the value `root1.val + root2.val`.
   - Recursively call the merge function for the **left** children: `mergedRoot.left = merge(root1.left, root2.left)`.
   - Recursively call the merge function for the **right** children: `mergedRoot.right = merge(root1.right, root2.right)`.

3. **Return:**
   - Return the merged root node.

---

**Topics:** `Tree` | `Binary Tree` | `Depth-First Search` | `Breadth-First Search`
