# [169. Majority Element](https://leetcode.com/problems/majority-element/)

## 🟢 Easy

---

### **Problem Statement**

Given an array `nums` of size `n`, return the **majority element**.

The majority element is the element that appears more than $\lfloor n / 2 \rfloor$ times. You may assume that the majority element always exists in the array.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [3,2,3]`  
> **Output:** `3`

**Example 2:**
> **Input:** `nums = [2,2,1,1,1,2,2]`  
> **Output:** `2`

---

### **Constraints**

- `n == nums.length`
- $1 \le n \le 5 \times 10^4$
- $-10^9 \le \text{nums}[i] \le 10^9$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the array exactly once.
* **Space Complexity:** $O(1)$  
  We only maintain two variables: `candidate` and `count`.

---

### **Approach: Boyer-Moore Voting Algorithm**



The intuition behind this algorithm is that if we cancel out each occurrence of an element with all other elements that are different from it, the majority element will remain at the end because it appears more than half the time.

1.  **Initialize:** Start with a `candidate` (can be any value) and a `count = 0`.
2.  **Iterate:** For every number `num` in the array:
    * If `count == 0`, set the current `num` as our new `candidate`.
    * If `num == candidate`, increment `count`.
    * If `num != candidate`, decrement `count`.
3.  **Result:** The `candidate` at the end of the loop is the majority element.

#### **Why does this work?**
Since the majority element appears more than $n/2$ times, even if every other element "votes" against it, there will still be at least one "vote" for the majority element left over.

---

**Topics:** `Array` | `Hash Table` | `Divide and Conquer` | `Sorting` | `Counting`
