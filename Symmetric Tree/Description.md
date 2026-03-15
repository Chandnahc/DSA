# [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

---

### **Example 1**

![Symmetric Tree Example](https://assets.leetcode.com/uploads/2021/02/19/symtree1.jpg)

> **Input:** `root = [1, 2, 2, 3, 4, 4, 3]`  
> **Output:** `true`  
> **Explanation:** The left and right subtrees are mirrors of each other.

### **Example 2**

![Non-Symmetric Tree Example](https://assets.leetcode.com/uploads/2021/02/19/symtree2.jpg)

> **Input:** `root = [1, 2, 2, null, 3, null, 3]`  
> **Output:** `false`  
> **Explanation:** The tree is not symmetric because the right side is missing nodes that should mirror the left.

---

### **Constraints**

- The number of nodes in the tree is in the range `[1, 1000]`.
- `-100 <= Node.val <= 100`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$ where $n$ is the number of nodes, as we visit every node once.
* **Space Complexity:** $O(h)$ where $h$ is the height of the tree, representing the recursion stack. In the worst case (a skewed tree), it's $O(n)$.

---

### **Approach**

To solve this, we use a helper function `isMirror(node1, node2)`:
1. **Base Case:** If both nodes are `null`, they are symmetric.
2. **Base Case:** If only one is `null`, they are **not** symmetric.
3. **Check Values:** The values of `node1` and `node2` must be equal.
4. **Recurse:** - Compare `node1.left` with `node2.right`.
   - Compare `node1.right` with `node2.left`.



---

**Topics:** `Tree` | `Depth-First Search` | `Breadth-First Search` | `Binary Tree`
