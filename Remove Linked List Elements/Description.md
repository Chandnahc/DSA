# [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)

## 🟢 Easy

---

### **Problem Statement**

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that have `Node.val == val`, and return the **new head**.

---

### **Examples**

**Example 1:**

![Remove Linked List Elements Example 1](https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg)

> **Input:** `head = [1,2,6,3,4,5,6], val = 6`  
> **Output:** `[1,2,3,4,5]`

**Example 2:**
> **Input:** `head = [], val = 1`  
> **Output:** `[]`

**Example 3:**
> **Input:** `head = [7,7,7,7], val = 7`  
> **Output:** `[]`

---

### **Constraints**

- The number of nodes in the list is in the range `[0, 10^4]`.
- `1 <= Node.val <= 50`
- `0 <= val <= 50`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the list exactly once, where $n$ is the number of nodes.
* **Space Complexity:** $O(1)$  
  We only use a few pointers (`dummy`, `curr`), regardless of the list size.

---

### **Approach: Dummy Node Technique**



When deleting nodes from a linked list, the edge case of deleting the `head` can make the code messy with `if/else` logic. A **Dummy Node** (or Sentinel Node) simplifies this:

1.  **Create a Dummy Node:** Initialize a new node that points to the `head` (`dummy.next = head`).
2.  **Initialize a Pointer:** Set `curr` to the dummy node.
3.  **Traverse the List:** While `curr.next` is not null:
    * **Match Found:** If `curr.next.val == val`, "skip" the node by pointing `curr.next` to `curr.next.next`.
    * **No Match:** If the values don't match, simply move the `curr` pointer forward (`curr = curr.next`).
4.  **Return Result:** Return `dummy.next`, which is the new head of the modified list.

#### **Why use a Dummy Node?**
If the input is `[7, 7, 7]` and `val = 7`, the dummy node allows us to treat the first `7` just like any other node in the middle of the list, preventing us from having to write a separate loop to find the first non-matching head.

---

**Topics:** `Linked List` | `Recursion`
