# [448. Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)

## 🟢 Easy

---

### **Problem Statement**

Given an array `nums` of `n` integers where `nums[i]` is in the range `[1, n]`, return an array of all the integers in the range `[1, n]` that **do not appear** in `nums`.

**Challenge:** Could you do it without extra space and in $O(n)$ runtime? (You may assume the returned list does not count as extra space).

---

### **Examples**

**Example 1:**
> **Input:** `nums = [4,3,2,7,8,2,3,1]`  
> **Output:** `[5,6]`  
> **Explanation:** The numbers 5 and 6 are missing from the range [1, 8].

**Example 2:**
> **Input:** `nums = [1,1]`  
> **Output:** `[2]`

---

### **Constraints**

- $n == \text{nums.length}$
- $1 \le n \le 10^5$
- $1 \le \text{nums}[i] \le n$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the array twice: once to mark visited numbers and once to identify missing ones.
* **Space Complexity:** $O(1)$  
  (Excluding the output list). We modify the input array in-place to store state.

---

### **Approach: In-Place Marking (Negation)**



Since all numbers are positive ($1$ to $n$), we can use the **sign** of the number at a specific index as a "flag." If we see the number `x`, we go to `index = x - 1` and make the value there negative.

#### **The Strategy:**
1.  **Marking Phase:** Iterate through the array. For each value `val`:
    * Calculate the target index: `idx = abs(val) - 1`.
    * If the value at `nums[idx]` is positive, multiply it by `-1` to mark it as "seen."
2.  **Collection Phase:** Iterate through the array a second time:
    * If `nums[i]` is **positive**, it means no number in the array pointed to this index.
    * Therefore, the number `i + 1` is missing.
3.  **Return:** Add all such `i + 1` values to your result list.

#### **Why this works:**
We are essentially using the array itself as a Hash Set. By using negation, we preserve the original magnitude of the numbers (so we can still read them later in the loop) while simultaneously storing a "visited" boolean.

---

**Topics:** `Array` | `Hash Table`
