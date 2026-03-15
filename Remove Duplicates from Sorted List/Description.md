# [83. Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

## 🟢 Easy

---

### **Problem Statement**

Given the `head` of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list **sorted** as well.

---

### **Example 1**

![Remove Duplicates Example 1](https://assets.leetcode.com/uploads/2021/01/04/list1.jpg)

> **Input:** `head = [1,1,2]`  
> **Output:** `[1,2]`

### **Example 2**

![Remove Duplicates Example 2](https://assets.leetcode.com/uploads/2021/01/04/list2.jpg)

> **Input:** `head = [1,1,2,3,3]`  
> **Output:** `[1,2,3]`

---

### **Constraints**

- The number of nodes in the list is in the range `[0, 300]`.
- `-100 <= Node.val <= 100`
- The list is guaranteed to be **sorted** in ascending order.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$ where $n$ is the number of nodes in the list. We traverse the list once.
* **Space Complexity:** $O(1)$ as we are modifying the list in-place without using extra data structures.

---

### **Approach: Iterative Traversal**



Since the list is sorted, we can compare each node with its next node:

1.  **Start** at the `head` of the list.
2.  **Traverse** while `current` and `current.next` are not null:
    * If `current.val == current.next.val`, skip the next node by setting `current.next = current.next.next`.
    * If the values are different, simply move the `current` pointer forward: `current = current.next`.
3.  **Return** the modified `head`.

---

**Topics:** `Linked List`
