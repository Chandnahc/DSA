# [404. Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a binary tree, return the **sum of all left leaves**.

- A **leaf** is a node with no children.
- A **left leaf** is a leaf that is specifically the left child of another node.

---

### **Examples**

**Example 1:**

![example1_image]("https://assets.leetcode.com/uploads/2021/04/08/leftsum-tree.jpg")

> **Input:** `root = [3,9,20,null,null,15,7]`  
> **Output:** `24`  
> **Explanation:** There are two left leaves in the binary tree, with values `9` and `15`. Note that `7` is a leaf, but it is a *right* leaf, so it is excluded.

**Example 2:**
> **Input:** `root = [1]`  
> **Output:** `0`  
> **Explanation:** A single root node is a leaf, but it is not a *left* leaf of any parent.

---

### **Constraints**

- The number of nodes in the tree is in the range $[1, 1000]$.
- $-1000 \le \text{Node.val} \le 1000$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We must visit every node in the tree exactly once to check if it has a left leaf.
* **Space Complexity:** $O(h)$  
  Where $h$ is the height of the tree. This space is used by the recursion stack (DFS) or the queue (BFS). In the worst case (a skewed tree), $h = n$.

---

### **Approach: Recursive DFS**



To identify a left leaf, a node needs to "look down" at its children. When we are at a parent node, we check if its left child is a leaf.

#### **The Strategy:**
1.  **Base Case:** If the current node is `null`, return `0`.
2.  **Identify Left Leaf:** Check the left child:
    * Is there a left child? (`node.left != null`)
    * Is that left child a leaf? (`node.left.left == null` and `node.left.right == null`)
    * If **yes**, the value of that left child is part of our sum.
3.  **Recurse:**
    * If the left child was a leaf, we take its value and add it to the recursive result of the **right** subtree.
    * If the left child was *not* a leaf, we recursively call the function on both the **left** and **right** subtrees and sum their results.
4.  **Return:** The total accumulated sum.

#### **Refinement:**
You can also pass a boolean flag `isLeft` into your recursive function to tell the current node whether it is a left child or not. If `isLeft` is true and the node is a leaf, add its value to the total.

---

**Topics:** `Tree` | `Depth-First Search` | `Breadth-First Search` | `Binary Tree`
