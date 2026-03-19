# [164. Maximum Gap](https://leetcode.com/problems/maximum-gap/)

## 🟡 Medium

---

### **Problem Statement**

Given an integer array `nums`, return the **maximum difference** between two successive elements in its sorted form. If the array contains less than two elements, return `0`.

You must write an algorithm that runs in **linear time** ($O(n)$) and uses **linear extra space** ($O(n)$).

---

### **Examples**

**Example 1:**
> **Input:** `nums = [3,6,9,1]`  
> **Output:** `3`  
> **Explanation:** The sorted form of the array is `[1,3,6,9]`. The differences are $(3-1)=2$, $(6-3)=3$, and $(9-6)=3$. The maximum is 3.

**Example 2:**
> **Input:** `nums = [10]`  
> **Output:** `0`  
> **Explanation:** The array contains less than 2 elements, therefore return 0.

---

### **Constraints**

- `1 <= nums.length <= 10^5`
- `0 <= nums[i] <= 10^9`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the array a constant number of times to find min/max, fill buckets, and scan buckets.
* **Space Complexity:** $O(n)$  
  We use extra space to store the min and max values for each bucket.

---

### **Approach: The Bucket Sort (Pigeonhole Principle)**



The "naive" approach is to sort the array ($O(n \log n)$), but the constraints demand $O(n)$. We use the fact that the maximum gap must be at least $\lceil (max - min) / (n - 1) \rceil$.

1.  **Find the Range:** Locate the `globalMin` and `globalMax` in the array.
2.  **Calculate Bucket Size:** Define `gap = max(1, (globalMax - globalMin) / (n - 1))`. 
3.  **Create Buckets:** Create $n$ buckets. Each bucket will only store two values: the **minimum** and **maximum** element that falls into its range.
4.  **Fill Buckets:** For each number in `nums`, calculate its bucket index: `index = (num - globalMin) / gap`. Update that bucket's min and max.
5.  **Calculate Max Gap:** The maximum gap will **not** occur within a bucket (because the bucket size is smaller than the average gap). It must occur **between** the maximum of one non-empty bucket and the minimum of the next non-empty bucket.
6.  **Iterate:** Scan the buckets and track the difference between `currentBucket.min` and `previousBucket.max`.

---

**Topics:** `Array` | `Sorting` | `Bucket Sort` | `Radix Sort`
