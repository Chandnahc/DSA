# [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

## 🟢 Easy

---

### **Problem Statement**

You are given the heads of two sorted linked lists `list1` and `list2`.

**Merge** the two lists into one **sorted** list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

---

### **Example 1**

![Merge Two Sorted Lists Example](https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg)

> **Input:** `list1 = [1,2,4], list2 = [1,3,4]`  
> **Output:** `[1,1,2,3,4,4]`

### **Example 2**

> **Input:** `list1 = [], list2 = []`  
> **Output:** `[]`

### **Example 3**

> **Input:** `list1 = [], list2 = [0]`  
> **Output:** `[0]`

---

### **Constraints**

- The number of nodes in both lists is in the range `[0, 50]`.
- `-100 <= Node.val <= 100`
- Both `list1` and `list2` are sorted in **non-decreasing** order.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n + m)$  
  Where $n$ and $m$ are the lengths of the two lists. We traverse each node in both lists exactly once.
* **Space Complexity:** $O(1)$  
  We are merging the lists in-place by changing pointers, using only a constant amount of extra space. (If using recursion, the space complexity would be $O(n + m)$ due to the stack).

---

### **Approach: Iterative with Dummy Node**



The most common and robust way to solve this is using a **dummy node** to act as the starting point:

1.  **Initialize** a `dummy` node and a `current` pointer to that dummy.
2.  **Compare** the heads of `list1` and `list2`:
    * Attach the smaller node to `current.next`.
    * Move the pointer of the list you just took from (e.g., `list1 = list1.next`).
    * Move the `current` pointer forward.
3.  **Handle Remaining Nodes:** If one list becomes empty before the other, simply attach the remainder of the non-empty list to `current.next`.
4.  **Return** `dummy.next` (the actual head of the merged list).

---

**Topics:** `Linked List` | `Recursion`
