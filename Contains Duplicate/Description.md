# [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [1,2,3,1]`  
> **Output:** `true`  
> **Explanation:** The element 1 occurs at indices 0 and 3.

**Example 2:**
> **Input:** `nums = [1,2,3,4]`  
> **Output:** `false`  
> **Explanation:** All elements are distinct.

**Example 3:**
> **Input:** `nums = [1,1,1,3,3,4,3,2,4,2]`  
> **Output:** `true`

---

### **Constraints**

- $1 \le \text{nums.length} \le 10^5$
- $-10^9 \le \text{nums}[i] \le 10^9$

---

### **Complexity Analysis**

| Approach | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| **Brute Force** | $O(n^2)$ | $O(1)$ |
| **Sorting** | $O(n \log n)$ | $O(1)$ or $O(n)$ |
| **Hash Set** | $O(n)$ | $O(n)$ |

---

### **Approach: Using a Hash Set**



The most efficient way to solve this is by using a **Hash Set**, which allows for $O(1)$ average time complexity for both insertions and lookups.

1.  **Initialize** an empty Hash Set.
2.  **Iterate** through each number in the input array `nums`.
3.  **Check for Existence:** Before adding the current number to the set, check if it already exists:
    * **If it exists:** We've found a duplicate! Return `true`.
    * **If it doesn't exist:** Add the number to the set and continue to the next element.
4.  **Final Result:** If the loop finishes without finding any duplicates, return `false`.

#### **Why not Sorting?**
Sorting the array ($O(n \log n)$) allows you to check adjacent elements for equality. While this saves space ($O(1)$), it is slower than the Hash Set approach for large datasets.

---

**Topics:** `Array` | `Hash Table` | `Sorting`
