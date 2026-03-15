# [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)

## 🟢 Easy

---

### **Problem Statement**

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with **$O(\log n)$** runtime complexity.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [1,3,5,6], target = 5`  
> **Output:** `2`

**Example 2:**
> **Input:** `nums = [1,3,5,6], target = 2`  
> **Output:** `1`

**Example 3:**
> **Input:** `nums = [1,3,5,6], target = 7`  
> **Output:** `4`

---

### **Constraints**

- `1 <= nums.length <= 10^4`
- `-10^4 <= nums[i] <= 10^4`
- `nums` contains **distinct** values sorted in **ascending** order.
- `-10^4 <= target <= 10^4`

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log n)$  
  We use Binary Search to halve the search space in each iteration.
* **Space Complexity:** $O(1)$  
  We only use a constant amount of extra space for pointers.

---

### **Approach: Binary Search**



To achieve the required $O(\log n)$ time complexity, we implement a standard binary search:

1.  **Initialize** two pointers: `left = 0` and `right = nums.length - 1`.
2.  **While** `left <= right`:
    * Calculate the middle index: `mid = left + (right - left) / 2`.
    * If `nums[mid] == target`, we found the value! Return `mid`.
    * If `nums[mid] < target`, the target must be in the right half. Set `left = mid + 1`.
    * If `nums[mid] > target`, the target must be in the left half. Set `right = mid - 1`.
3.  **Return `left`:** If the loop finishes without finding the target, the `left` pointer will be at the correct insertion index.

---

**Topics:** `Array` | `Binary Search`
