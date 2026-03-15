# [4. Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

## 🔴 Hard

---

### **Problem Statement**

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the **median** of the two sorted arrays.

The overall run time complexity should be **$O(\log (m+n))$**.

---

### **Examples**

**Example 1:**
> **Input:** `nums1 = [1,3], nums2 = [2]`  
> **Output:** `2.00000`  
> **Explanation:** Merged array = `[1,2,3]` and median is 2.

**Example 2:**
> **Input:** `nums1 = [1,2], nums2 = [3,4]`  
> **Output:** `2.50000`  
> **Explanation:** Merged array = `[1,2,3,4]` and median is $(2 + 3) / 2 = 2.5$.

---

### **Constraints**

- `nums1.length == m`, `nums2.length == n`
- `0 <= m, n <= 1000`
- `1 <= m + n <= 2000`
- `-10^6 <= nums1[i], nums2[i] <= 10^6`

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log(\min(m, n)))$  
  We perform binary search on the smaller array to ensure the fastest possible runtime.
* **Space Complexity:** $O(1)$  
  We only use a few variables to store partition indices and maximum/minimum values.

---

### **Approach: Binary Search on Partitions**



The goal is to partition both arrays into two halves (left and right) such that:
1. The total number of elements in the left half equals the total number of elements in the right half.
2. Every element in the left half is less than or equal to every element in the right half.

#### **Steps:**
1. **Ensure `nums1` is the smaller array:** This minimizes the binary search range.
2. **Binary Search Range:** Set `low = 0` and `high = m`.
3. **Partition:**
    * `partitionX = (low + high) / 2`
    * `partitionY = (m + n + 1) / 2 - partitionX`
4. **Identify Boundary Values:**
    * `L1`: Max element on the left of `nums1`
    * `R1`: Min element on the right of `nums1`
    * `L2`: Max element on the left of `nums2`
    * `R2`: Min element on the right of `nums2`
5. **Check Validity:**
    * If `L1 <= R2` and `L2 <= R1`, we found the correct partition!
    * If `L1 > R2`, move the partition in `nums1` to the left (`high = partitionX - 1`).
    * If `L2 > R1`, move the partition in `nums1` to the right (`low = partitionX + 1`).
6. **Calculate Median:**
    * If $(m+n)$ is odd: $\max(L1, L2)$
    * If $(m+n)$ is even: $(\max(L1, L2) + \min(R1, R2)) / 2.0$

---

**Topics:** `Array` | `Binary Search` | `Divide and Conquer`
