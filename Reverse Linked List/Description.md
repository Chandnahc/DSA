# [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)

## 🟢 Easy

---

### **Problem Statement**

Given the `head` of a singly linked list, reverse the list, and return the **reversed list**.

---

### **Examples**

**Example 1:**

![Reverse Linked List Example 1](https://assets.leetcode.com/uploads/2021/02/19/rev1ex1.jpg)

> **Input:** `head = [1,2,3,4,5]`  
> **Output:** `[5,4,3,2,1]`

**Example 2:**

![Reverse Linked List Example 1](https://assets.leetcode.com/uploads/2021/02/19/rev1ex2.jpg)

> **Input:** `head = [1,2]`  
> **Output:** `[2,1]`

**Example 3:**
> **Input:** `head = []`  
> **Output:** `[]`

---

### **Constraints**

- The number of nodes in the list is in the range `[0, 5000]`.
- `-5000 <= Node.val <= 5000`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We visit each node exactly once to flip its pointer.
* **Space Complexity:** $O(1)$  
  For the iterative approach, we only use three pointers regardless of list length.

---

### **Approach: Iterative Pointer Reversal**



The key to reversing a linked list is to change the `next` pointer of every node to point to its **previous** node instead of its next one. Because a singly linked list doesn't have "back" pointers, we must track the previous node manually.

1.  **Initialize Pointers:**
    * `prev = null` (This will eventually become the new tail).
    * `curr = head` (The node we are currently flipping).
2.  **Iterate through the list:**
    * **Save the Next Node:** Before flipping `curr.next`, save it in a temporary variable (`nextTemp = curr.next`) so you don't lose the rest of the list.
    * **Flip the Pointer:** Set `curr.next = prev`.
    * **Shift Forward:** Move `prev` to `curr` and `curr` to `nextTemp`.
3.  **Return Result:** Once `curr` is null, `prev` will be pointing to the new head of the reversed list.

#### **Follow-up: Recursive Approach**
The list can also be reversed recursively. Each call reverses the "rest" of the list and then points the original next node back to the current node. This uses $O(n)$ space due to the recursion stack.

---

**Topics:** `Linked List` | `Recursion`
