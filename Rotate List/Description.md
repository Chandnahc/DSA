# [61. Rotate List](https://leetcode.com/problems/rotate-list/)

## 🟡 Medium

---

### **Problem Statement**

Given the `head` of a linked list, rotate the list to the right by `k` places.

---

### **Examples**

**Example 1:**

![example_1](https://assets.leetcode.com/uploads/2020/11/13/rotate1.jpg)

> **Input:** `head = [1,2,3,4,5], k = 2`  
> **Output:** `[4,5,1,2,3]`  
> **Explanation:**
> - Rotate 1: `[5,1,2,3,4]`
> - Rotate 2: `[4,5,1,2,3]`

**Example 2:**

![example_2](https://assets.leetcode.com/uploads/2020/11/13/roate2.jpg)

> **Input:** `head = [0,1,2], k = 4`  
> **Output:** `[2,0,1]`  
> **Explanation:**
> - Rotate 1: `[2,0,1]`
> - Rotate 2: `[1,2,0]`
> - Rotate 3: `[0,1,2]`
> - Rotate 4: `[2,0,1]` (Note: $k=4$ is effectively $k=1$ since the length is 3)

---

### **Constraints**

- The number of nodes in the list is in the range $[0, 500]$.
- $-100 \le \text{Node.val} \le 100$
- $0 \le k \le 2 \times 10^9$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the list once to find the length and once more to find the new tail.
* **Space Complexity:** $O(1)$  
  We only use a few pointer variables regardless of the list size.

---

### **Approach: The Ring Strategy**

Since rotating a list is essentially moving the tail to the head, the most efficient way is to temporarily turn the list into a **circular linked list**.

#### **The Strategy:**
1.  **Handle Edge Cases:** If the list is empty, has one node, or $k=0$, return the `head`.
2.  **Find Length & Tail:** Traverse to the end of the list to find the length `L` and keep a reference to the `tail` node.
3.  **Optimize $k$:** Set `k = k % L`. If `k == 0`, the list remains unchanged.
4.  **Close the Loop:** Connect the `tail.next` to the `head`. Now you have a circle.
5.  **Find the New Breakpoint:** The new tail will be at position `L - k` from the original head.
    * Traverse `L - k - 1` steps from the head to reach the **new tail**.
6.  **Break the Ring:**
    * Set the `newHead` to `newTail.next`.
    * Set `newTail.next = null` to terminate the list.
7.  **Return:** `newHead`.

#### **Why this works:**
Rotating right by $k$ is the same as moving the "cut" point $k$ positions from the end. By forming a circle first, we avoid complex logic about which nodes move where—we simply choose a new starting point and snip the connection behind it.

---

**Topics:** `Linked List` | `Two Pointers`
