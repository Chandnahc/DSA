# [160. Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/)

## 🟢 Easy

---

### **Problem Statement**

Given the heads of two singly linked-lists `headA` and `headB`, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return `null`.

The test cases are generated such that there are no cycles anywhere in the entire linked structure.

**Note:** The linked lists must retain their original structure after the function returns.

---

### **Examples**

**Example 1:**

![Intersection Example 1](https://assets.leetcode.com/uploads/2021/03/05/160_example_1_1.png)

> **Input:** `intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3`  
> **Output:** `Intersected at '8'`  
> **Explanation:** The intersected node's value is 8. From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5].

**Example 2:**

![Intersection Example 2](https://assets.leetcode.com/uploads/2021/03/05/160_example_2.png)

> **Input:** `intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1`  
> **Output:** `Intersected at '2'`

**Example 3:**

![Intersection Example 3](https://assets.leetcode.com/uploads/2021/03/05/160_example_3.png)

> **Input:** `intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2`  
> **Output:** `No intersection`

---

### **Constraints**

- `m == listA.length`, `n == listB.length`
- $1 \le m, n \le 3 \times 10^4$
- $1 \le \text{Node.val} \le 10^5$
- The intersection point is determined by reference, not by value.

---

### **Complexity Analysis**

* **Time Complexity:** $O(m + n)$  
  Each pointer traverses at most two lists ($m + n$ nodes total).
* **Space Complexity:** $O(1)$  
  We only use two pointers, meeting the requirement for constant extra space.

---

### **Approach: Two-Pointer (Path Switching)**



If we have two lists of different lengths, the "gap" between their starting points and the intersection point is different. We can neutralize this difference by having each pointer "swap" to the other list after it reaches the end.

1.  **Initialize** two pointers, `ptrA` at `headA` and `ptrB` at `headB`.
2.  **Traverse** both lists simultaneously.
3.  **Switch Paths:** * When `ptrA` reaches the end of List A, redirect it to `headB`.
    * When `ptrB` reaches the end of List B, redirect it to `headA`.
4.  **Meeting Point:** By doing this, both pointers will travel a total distance of $m + n$. If the lists intersect, they will meet at the intersection node during the second pass.
5.  **No Intersection:** If they don't intersect, both will eventually reach `null` at the same time and exit the loop.

---

**Topics:** `Hash Table` | `Linked List` | `Two Pointers`
