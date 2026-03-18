# [162. Find Peak Element](https://leetcode.com/problems/find-peak-element/)

## 🟡 Medium

---

### **Problem Statement**

A peak element is an element that is strictly greater than its neighbors.

Given a **0-indexed** integer array `nums`, find a peak element, and return its index. If the array contains multiple peaks, return the index to **any of the peaks**.

You may imagine that `nums[-1] = nums[n] = -∞`. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in **$O(\log n)$** time.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [1,2,3,1]`  
> **Output:** `2`  
> **Explanation:** 3 is a peak element and your function should return the index number 2.

**Example 2:**
> **Input:** `nums = [1,2,1,3,5,6,4]`  
> **Output:** `5`  
> **Explanation:** Your function can return either index number 1 (where the peak element is 2), or index number 5 (where the peak element is 6).

---

### **Constraints**

- `1 <= nums.length <= 1000`
- `-2^31 <= nums[i] <= 2^31 - 1`
- `nums[i] != nums[i + 1]` for all valid `i`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log n)$  
  We use binary search to halve the search space in each step.
* **Space Complexity:** $O(1)$  
  We only use a few variables for the pointers (`low`, `high`, `mid`).

---

### **Approach: Binary Search on Slopes**



Even though the array isn't sorted, we can use binary search because we only need to find *one* peak. By comparing an element with its neighbor, we can determine which direction a peak must lie.

1.  **Initialize** `low = 0` and `high = nums.length - 1`.
2.  **While** `low < high`:
    * Calculate `mid = low + (high - low) / 2`.
    * **Check the Slope:** Compare `nums[mid]` with `nums[mid + 1]`.
    * **Ascending Slope:** If `nums[mid] < nums[mid + 1]`, a peak must exist to the right. Move `low = mid + 1`.
    * **Descending Slope:** If `nums[mid] > nums[mid + 1]`, `mid` itself could be a peak, or a peak exists to the left. Move `high = mid`.
3.  **Result:** When `low == high`, the pointers have converged on a peak element. Return `low`.

---

**Topics:** `Array` | `Binary Search`
