# [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates **in-place** such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements `k`.

To get accepted, you must:
1.  Modify the array `nums` such that the first `k` elements contain the unique elements in their original sorted order.
2.  The remaining elements of `nums` are not important.
3.  Return `k`.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [1,1,2]`  
> **Output:** `2, nums = [1,2,_]`  
> **Explanation:** Your function should return `k = 2`, with the first two elements of `nums` being 1 and 2 respectively.

**Example 2:**
> **Input:** `nums = [0,0,1,1,1,2,2,3,3,4]`  
> **Output:** `5, nums = [0,1,2,3,4,_,_,_,_,_]`  
> **Explanation:** Your function should return `k = 5`, with the first five elements of `nums` being 0, 1, 2, 3, and 4 respectively.

---

### **Constraints**

- `1 <= nums.length <= 3 * 10^4`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in **non-decreasing** order.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the array once with the fast pointer.
* **Space Complexity:** $O(1)$  
  The modification is done in-place without any extra space.

---

### **Approach: Two Pointers**



We use a **slow pointer** and a **fast pointer** to filter the array:

1.  **Initialize** the slow pointer `i = 0`. This pointer tracks the position of the last unique element found.
2.  **Iterate** with a fast pointer `j` starting from index `1` to the end of the array.
3.  **Compare:** If `nums[j]` is different from `nums[i]`:
    * Increment the slow pointer `i`.
    * Update `nums[i]` with the value of `nums[j]`.
4.  **Return** `i + 1` (since `i` is an index, the count of unique elements is `i + 1`).

---

**Topics:** `Array` | `Two Pointers`
