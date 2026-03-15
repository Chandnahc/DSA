# [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

## 🟢 Easy

---

### **Problem Statement**

You are given two integer arrays `nums1` and `nums2`, sorted in **non-decreasing order**, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

**Merge** `nums1` and `nums2` into a single array sorted in **non-decreasing order**.

The final sorted array should not be returned by the function, but instead be **stored inside the array `nums1`**. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `nums2` has a length of `n`.

---

### **Examples**

**Example 1:**
> **Input:** `nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3`  
> **Output:** `[1,2,2,3,5,6]`  
> **Explanation:** The arrays we are merging are `[1,2,3]` and `[2,5,6]`. The result of the merge is `[1,2,2,3,5,6]`.

**Example 2:**
> **Input:** `nums1 = [1], m = 1, nums2 = [], n = 0`  
> **Output:** `[1]`  
> **Explanation:** The arrays we are merging are `[1]` and `[]`.

**Example 3:**
> **Input:** `nums1 = [0], m = 0, nums2 = [1], n = 1`  
> **Output:** `[1]`  
> **Explanation:** The arrays we are merging are `[]` and `[1]`. Note that because `m = 0`, there are no elements in `nums1`. The `0` is only there to ensure the merge result can fit in `nums1`.

---

### **Constraints**

- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`
- `-10^9 <= nums1[i], nums2[j] <= 10^9`

---

### **Complexity Analysis**

* **Time Complexity:** $O(m + n)$  
  We traverse both arrays once from back to front.
* **Space Complexity:** $O(1)$  
  The merge is done in-place within `nums1`.

---

### **Approach: Three Pointers (Back-to-Front)**



Instead of starting from the beginning (which would require shifting elements), we start from the **end** of both arrays where `nums1` has empty space (the zeros).

1.  **Initialize** three pointers:
    - `i` pointing to the last valid element in `nums1` ($m - 1$).
    - `j` pointing to the last element in `nums2` ($n - 1$).
    - `k` pointing to the very last position in `nums1` ($m + n - 1$).
2.  **Compare** `nums1[i]` and `nums2[j]`:
    - Place the larger value at `nums1[k]` and decrement the corresponding pointers.
3.  **Handle Remaining Elements:** If any elements remain in `nums2`, copy them over. (Elements remaining in `nums1` are already in their correct place).

---

**Topics:** `Array` | `Two Pointers` | `Sorting`
