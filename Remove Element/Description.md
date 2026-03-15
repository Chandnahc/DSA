# [27. Remove Element](https://leetcode.com/problems/remove-element/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` **in-place**. The order of the elements may be changed. Then return the number of elements in `nums` which are not equal to `val`.

Consider the number of elements in `nums` which are not equal to `val` be `k`. To get accepted, you need to do the following things:
1. Change the array `nums` such that the first `k` elements contain the elements which are not equal to `val`. 
2. The remaining elements of `nums` are not important.
3. Return `k`.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [3,2,2,3], val = 3`  
> **Output:** `2, nums = [2,2,_,_]`  
> **Explanation:** Your function should return `k = 2`, with the first two elements of `nums` being `2`.

**Example 2:**
> **Input:** `nums = [0,1,2,2,3,0,4,2], val = 2`  
> **Output:** `5, nums = [0,1,4,0,3,_,_,_]`  
> **Explanation:** Your function should return `k = 5`, with the first five elements of `nums` containing `0`, `0`, `1`, `3`, and `4`. Note that the five elements can be returned in any order.

---

### **Constraints**

- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the array exactly once.
* **Space Complexity:** $O(1)$  
  We perform the operation in-place without using any extra data structures.

---

### **Approach: Two Pointers**



The most efficient way to solve this is by using a "read" pointer and a "write" pointer:

1.  **Initialize** a pointer `k = 0`. This will track the position where the next "non-target" element should be placed.
2.  **Iterate** through the array with a pointer `i`:
    * If `nums[i]` is **not equal** to `val`:
        * Copy `nums[i]` to `nums[k]`.
        * Increment `k`.
3.  **Return `k`**: After the loop, `k` will represent the count of elements not equal to `val`, and they will all be at the front of the array.

---

**Topics:** `Array` | `Two Pointers`
