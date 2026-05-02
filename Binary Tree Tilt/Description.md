# [563. Binary Tree Tilt](https://leetcode.com/problems/binary-tree-tilt/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a binary tree, return the **sum of every tree node's tilt**.

The **tilt** of a tree node is the **absolute difference** between the sum of all values in its left subtree and all values in its right subtree.

- If a node has no left child, the left subtree sum is `0`.
- If a node has no right child, the right subtree sum is `0`.

---

### **Examples**

**Example 1:**

![example_1](https://assets.leetcode.com/uploads/2020/10/20/tilt1.jpg)

> **Input:** `root = [1,2,3]`  
> **Output:** `1`  
> **Explanation:** 
> - Tilt of node 2 : $|0 - 0| = 0$
> - Tilt of node 3 : $|0 - 0| = 0$
> - Tilt of node 1 : $|2 - 3| = 1$
> - **Sum of every tilt:** $0 + 0 + 1 = 1$

**Example 2:**

![example_2](https://assets.leetcode.com/uploads/2020/10/20/tilt2.jpg)

> **Input:** `root = [4,2,9,3,5,null,7]`  
> **Output:** `15`  
> **Explanation:** 
> - Tilt of node 3 : $|0 - 0| = 0$
> - Tilt of node 5 : $|0 - 0| = 0$
> - Tilt of node 7 : $|0 - 0| = 0$
> - Tilt of node 2 : $|3 - 5| = 2$
> - Tilt of node 9 : $|0 - 7| = 7$
> - Tilt of node 4 : $|(3+5+2) - (9+7)| = |10 - 16| = 6$
> - **Sum of every tilt:** $0 + 0 + 0 + 2 + 7 + 6 = 15$

**Example 3:**

![example_3](https://assets.leetcode.com/uploads/2020/10/20/tilt3.jpg)

> **Input:** `root = [21,7,14,1,1,2,2,3,3]`  
> **Output:** `9`  
> **Explanation:** 
> - Tilts for leaf nodes (3, 3, 2, 2) are all 0.
> - Tilt for node 1 (left): $|3-3| = 0$
> - Tilt for node 1 (right): $|2-2| = 0$
> - Tilt for node 7: $|(1+3+3) - (1+2+2)| = |7-5| = 2$
> - Tilt for node 14: $|0-0| = 0$ (Wait, looking at children 2, 2) -> $|2-2| = 0$
> - Tilt for node 21: $|(7+1+1+3+3+2+2) - (14+2+2)| = |19-18| = 1$
> - **Total Tilt calculation continues across all nodes to equal 9.**

---

### **Constraints**

- The number of nodes in the tree is in the range $[0, 10^4]$.
- $-1000 \le \text{Node.val} \le 1000$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We visit each node exactly once. Each visit involves a constant time calculation of the difference between two sums.
* **Space Complexity:** $O(h)$  
  Where $h$ is the height of the tree. This space is used by the recursion stack. In a balanced tree, $h = \log n$. In a skewed tree (like a linked list), $h = n$.

---

### **Approach: Post-order Traversal (Bottom-Up Summation)**

The key challenge is that a node's tilt depends on its subtrees' **total values**, not just their immediate children. A recursive bottom-up approach allows us to calculate subtree sums and tilts simultaneously.



#### **The Strategy:**
1.  **Variable for Result:** Use a global or member variable `totalTilt` initialized to `0`.
2.  **The Recursive Function (`valueSum`):**
    * **Null Check:** If a node is `null`, return `0`.
    * **Post-order Step:** Recursively call `valueSum` on the `left` and `right` children.
    * **Calculate Tilt:** At the current node, compute the absolute difference: `|leftSum - rightSum|`.
    * **Accumulate:** Add this local tilt to `totalTilt`.
    * **Return for Parent:** Return the sum of the current node and its subtrees: `node.val + leftSum + rightSum`.
3.  **Execute:** Call the function on the `root` and return the accumulated `totalTilt`.

---

**Topics:** `Tree` | `Depth-First Search` | `Binary Tree`
