# [559. Maximum Depth of N-ary Tree](https://leetcode.com/problems/maximum-depth-of-n-ary-tree/)

## 🟢 Easy

---

### **Problem Statement**

Given an **n-ary tree**, find its maximum depth.

The **maximum depth** is the number of nodes along the longest path from the root node down to the farthest leaf node.

---

### **Examples**

**Example 1:**

> **Input:** `root = [1,null,3,2,4,null,5,6]`  
> **Output:** `3`  
> **Explanation:** The longest path is 1 -> 3 -> 5 (or 6), which contains 3 nodes.

**Example 2:**
> **Input:** `root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]`  
> **Output:** `5`

---

### **Constraints**

- The total number of nodes is in the range $[0, 10^4]$.
- The depth of the n-ary tree is $\le 1000$.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We must visit every node in the tree exactly once to determine the maximum depth.
* **Space Complexity:** $O(h)$  
  Where $h$ is the height of the tree. This is the space used by the recursion stack. In the worst case (a thin, line-like tree), it is $O(n)$; in a balanced tree, it is much less.

---

### **Approach: Recursive DFS (Post-order)**



The depth of a node is $1 +$ the maximum depth among all of its children.

#### **The Strategy:**
1.  **Base Case:** If the `root` is `null`, the depth is `0`.
2.  **Leaf Case:** If the `root` has no children, its depth is `1`.
3.  **Recursive Step:** 
    * Initialize `max_child_depth = 0`.
    * Iterate through each child in `root.children`.
    * For each child, recursively call `maxDepth(child)`.
    * Update `max_child_depth` if the returned value is greater.
4.  **Return:** `max_child_depth + 1` (the `+1` accounts for the current root node).

#### **Why this works:**
This is a bottom-up approach. The recursion travels all the way to the leaves first. Each leaf returns `1` to its parent. Each parent looks at the values returned by its children, picks the biggest one, adds `1`, and passes that up. By the time the recursion reaches the original root, we have the global maximum.

---

**Topics:** `Tree` | `Depth-First Search` | `Breadth-First Search`
