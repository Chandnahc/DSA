# [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)

## 🟢 Easy

---

### **Problem Statement**

Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. **Note that `pos` is not passed as a parameter.**

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

---

### **Examples**

**Example 1:**

![Linked List Cycle Example 1](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png)

> **Input:** head = [3,2,0,-4], pos = 1  
> **Output:** true  
> **Explanation:** There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

**Example 2:**

![Linked List Cycle Example 2](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png)

> **Input:** head = [1,2], pos = 0  
> **Output:** true  
> **Explanation:** There is a cycle in the linked list, where the tail connects to the 0th node.

**Example 3:**

![Linked List Cycle Example 3](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png)

> **Input:** head = [1], pos = -1  
> **Output:** false  
> **Explanation:** There is no cycle in the linked list.

---

### **Constraints**

- The number of the nodes in the list is in the range `[0, 10^4]`.
- `-10^5 <= Node.val <= 10^5`
- `pos` is `-1` or a valid index in the linked-list.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  In the worst case (no cycle), we visit each node once. If there is a cycle, the fast pointer will catch the slow pointer within $n$ steps.
* **Space Complexity:** $O(1)$  
  We only use two pointers (`slow` and `fast`), regardless of the size of the linked list.

---

### **Approach: Floyd's Cycle-Finding Algorithm (Tortoise and Hare)**



The most efficient way to detect a cycle without extra memory is to use two pointers moving at different speeds.

1.  **Initialize** two pointers, `slow` and `fast`, both starting at the `head`.
2.  **Traverse** the list:
    * Move `slow` by **one step** (`slow = slow.next`).
    * Move `fast` by **two steps** (`fast = fast.next.next`).
3.  **Check for Meeting:** If there is a cycle, the `fast` pointer will eventually "lap" the `slow` pointer, and they will point to the same node (`slow == fast`).
4.  **Check for End:** If the `fast` pointer reaches the end of the list (`null`), there is no cycle.

---

**Topics:** `Linked List` | `Two Pointers`
