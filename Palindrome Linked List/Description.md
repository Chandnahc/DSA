# [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)

## 🟢 Easy

---

### **Problem Statement**

Given the `head` of a singly linked list, return `true` if it is a **palindrome** or `false` otherwise.

---

### **Examples**

**Example 1:**

![Palindrome Linked List Example 1](https://assets.leetcode.com/uploads/2021/03/03/pal1linked-list.jpg)

> **Input:** `head = [1,2,2,1]`  
> **Output:** `true`

**Example 2:**

![Palindrome Linked List Example 2](https://assets.leetcode.com/uploads/2021/03/03/pal2linked-list.jpg)

> **Input:** `head = [1,2]`  
> **Output:** `false`

---

### **Constraints**

- The number of nodes in the list is in the range $[1, 10^5]$.
- $0 \le \text{Node.val} \le 9$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the list to find the middle, reverse the second half, and compare. Each step is linear.
* **Space Complexity:** $O(1)$  
  By reversing the second half of the list in place, we avoid using extra space like an array or recursion stack.

---

### **Approach: Reverse Second Half**



The most efficient way to check for a palindrome without extra space is to compare the first half of the list with the reversed second half.

#### **Step-by-Step Logic:**
1.  **Find the Middle:** Use the **Fast and Slow Pointer** technique. When the `fast` pointer reaches the end, the `slow` pointer will be at the middle.
2.  **Reverse the Second Half:** Starting from the `slow` pointer, reverse the remaining part of the linked list (using the same logic as Problem 206).
3.  **Compare:** * Start one pointer at the original `head`.
    * Start another pointer at the new head of the `reversed` second half.
    * Compare values one by one. If they all match, it's a palindrome.
4.  **Restore (Optional):** In a real-world scenario, you might reverse the second half back to its original state to keep the data structure intact.

---

**Topics:** `Linked List` | `Two Pointers` | `Stack` | `Recursion`
