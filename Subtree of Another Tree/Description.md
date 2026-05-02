# [572. Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/)

## 🟢 Easy

---

### **Problem Statement**

Given the roots of two binary trees `root` and `subRoot`, return `true` if there is a subtree of `root` with the same structure and node values as `subRoot`, and `false` otherwise.

A **subtree** of a binary tree `tree` is a tree that consists of a node in `tree` and all of this node's descendants. The tree `tree` could also be considered as a subtree of itself.

---

### **Examples**

**Example 1:**

![example_1](https://assets.leetcode.com/uploads/2021/04/28/subtree1-tree.jpg)

> **Input:** `root = [3,4,5,1,2], subRoot = [4,1,2]`  
> **Output:** `true`  
> **Explanation:** The structure of `subRoot` perfectly matches the subtree starting at node `4` in the `root`.

**Example 2:**

![example_2](https://assets.leetcode.com/uploads/2021/04/28/subtree2-tree.jpg)

> **Input:** `root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]`  
> **Output:** `false`  
> **Explanation:** Although a part of the `root` looks like `subRoot`, the node `2` in the `root` has an extra child `0`, whereas `subRoot` does not.

---

### **Constraints**

- The number of nodes in `root` is in the range $[1, 2000]$.
- The number of nodes in `subRoot` is in the range $[1, 1000]$.
- $-10^4 \le \text{root.val} \le 10^4$
- $-10^4 \le \text{subRoot.val} \le 10^4$

---

### **Complexity Analysis**

* **Time Complexity:** $O(M \times N)$  
  Where $M$ is the number of nodes in `root` and $N$ is the number of nodes in `subRoot`. In the worst case, we perform a full comparison of `subRoot` at every node in `root`.
* **Space Complexity:** $O(\max(H_{root}, H_{sub}))$, where $H$ is the height of the trees. This is the space used by the recursion stack.

---

### **Approach: Double Recursion**

This problem requires two separate recursive functions:
1.  **`isSubtree`**: Traverses the `root` tree to find a potential starting point.
2.  **`isSameTree`**: A helper function that takes two nodes and checks if the trees rooted at them are identical in structure and value.

#### **The Strategy:**
1.  **Base Cases for `isSubtree`:**
    * If `root` is `null`, we've searched the whole tree and found nothing. Return `false`.
    * If `subRoot` is `null`, technically every tree has a null subtree (though constraints say $n \ge 1$), so return `true`.
2.  **The Check:**
    * At every node in `root`, check if it matches `subRoot` by calling `isSameTree(root, subRoot)`.
    * If they match, return `true`.
3.  **The Search:**
    * If they don't match, recursively call `isSubtree` on `root.left` and `root.right`.
4.  **`isSameTree` Logic:**
    * If both nodes are `null`, they match.
    * If one is `null` and the other isn't, or if their values differ, they don't match.
    * Recursively check if `left` children match and `right` children match.

#### **Why not just check values?**
As seen in Example 2, just matching the values and immediate children isn't enough. You must ensure the entire **descendant structure** is identical. If the `root` subtree has "extra" nodes that `subRoot` doesn't have, it is not a match.

---

**Topics:** `Tree` | `Depth-First Search` | `Binary Tree` | `String Matching` | `Hash Function`
