# [530. Minimum Absolute Difference in BST](https://leetcode.com/problems/minimum-absolute-difference-in-bst/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a **Binary Search Tree (BST)**, return the minimum absolute difference between the values of any two different nodes in the tree.

---

### **Examples**

**Example 1:**

![example_1](https://assets.leetcode.com/uploads/2021/02/05/bst1.jpg)

> **Input:** `root = [4,2,6,1,3]`  
> **Output:** `1`  
> **Explanation:** The minimum differences are $|2-1|=1$, $|3-2|=1$, or $|4-3|=1$.

**Example 2:**

![example_2](https://assets.leetcode.com/uploads/2021/02/05/bst2.jpg)

> **Input:** `root = [1,0,48,null,null,12,49]`  
> **Output:** `1`  
> **Explanation:** The minimum difference is $|49-48|=1$.

---

### **Constraints**

- The number of nodes is in the range $[2, 10^4]$.
- $0 \le \text{Node.val} \le 10^5$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We visit every node exactly once during the in-order traversal.
* **Space Complexity:** $O(h)$  
  Where $h$ is the height of the tree. This is the space used by the recursion stack. In the worst case (a skewed tree), this is $O(n)$; in a balanced tree, it is $O(\log n)$.

---

### **Approach: In-order Traversal**

The key to this problem is remembering that an **In-order Traversal** (Left -> Root -> Right) of a BST yields values in **sorted order**.



#### **The Strategy:**
1.  **Initialize:** * `min_diff` to a very large number (infinity).
    * `prev_node` to `null` (to keep track of the value we saw just before the current one).
2.  **Traverse:** Perform a recursive in-order traversal:
    * Visit the **Left** subtree.
    * Process the **Current** node:
        * If `prev_node` is not null, calculate the difference: `current_val - prev_node.val`.
        * Update `min_diff` if this new difference is smaller.
        * Set `prev_node` to the current node.
    * Visit the **Right** subtree.
3.  **Return:** The final `min_diff`.

#### **Why only adjacent nodes?**
In a sorted list like `[1, 2, 4, 8]`, the minimum difference will never be between `1` and `4` if it could be between `1` and `2`. By visiting nodes in order, we only ever need to compare the "current" node with its "immediate predecessor" to find the global minimum.

---

**Topics:** `Tree` | `Depth-First Search` | `Binary Search Tree` | `Binary Tree`
