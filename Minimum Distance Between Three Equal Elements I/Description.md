# [3740. Minimum Distance Between Three Equal Elements I](https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/)

## 🟢 Easy

---

### **Problem Statement**

You are given an integer array `nums`. A tuple `(i, j, k)` of 3 **distinct** indices is **good** if `nums[i] == nums[j] == nums[k]`.

The **distance** of a good tuple is defined as:
$$abs(i - j) + abs(j - k) + abs(k - i)$$

**Goal:** Return the **minimum** possible distance of a good tuple. If no good tuples exist, return `-1`.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [1,2,1,1,3]`  
> **Output:** `6`  
> **Explanation:** Good tuple at indices `(0, 2, 3)` where `nums[0]=nums[2]=nums[3]=1`.  
> Distance: $abs(0-2) + abs(2-3) + abs(3-0) = 2 + 1 + 3 = 6$.

**Example 2:**
> **Input:** `nums = [1,1,2,3,2,1,2]`  
> **Output:** `8`  
> **Explanation:** The minimum distance is achieved by indices `(2, 4, 6)` for the value `2`.  
> Distance: $2 + 2 + 4 = 8$.

---

### **Constraints**

- $1 \le n == \text{nums.length} \le 100$
- $1 \le \text{nums}[i] \le n$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the array once to group indices and then check adjacent triplets.
* **Space Complexity:** $O(n)$  
  We store the indices of each number in a Hash Map or an array of lists.

---

### **Approach: Sliding Window over Indices**



The core observation is that for any three indices sorted as $i < j < k$, the distance formula $abs(i - j) + abs(j - k) + abs(k - i)$ is equivalent to:
$$(j - i) + (k - j) + (k - i) = 2 \cdot (k - i)$$

To minimize $2 \cdot (k - i)$, we simply need to minimize the gap between the first and third element of a triplet of the same value.

#### **The Strategy:**
1.  **Group Indices:** Use a Hash Map to store a list of indices for each unique number in `nums`.  
    *Example:* `[1, 2, 1, 1]` becomes `{1: [0, 2, 3], 2: [1]}`.
2.  **Check Triplets:** For each list of indices in the map:
    * If a list has fewer than 3 indices, it cannot form a good tuple.
    * If it has 3 or more, iterate through the list using a window of size 3 (indices at `p`, `p+1`, `p+2`).
    * Calculate the distance: $2 \cdot (\text{indices}[p+2] - \text{indices}[p])$.
3.  **Track Minimum:** Keep a global minimum variable initialized to infinity.
4.  **Result:** Return the minimum distance found, or `-1` if no triplets were processed.

---

**Topics:** `Array` | `Hash Table` | `Sliding Window`
