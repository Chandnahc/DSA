# [3741. Minimum Distance Between Three Equal Elements II](https://leetcode.com/problems/minimum-distance-between-three-equal-elements-ii/)

## 🟡 Medium

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

**Example 2:**
> **Input:** `nums = [1,1,2,3,2,1,2]`  
> **Output:** `8`

---

### **Constraints**

- $1 \le n == \text{nums.length} \le 10^5$
- $1 \le \text{nums}[i] \le n$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We perform a single pass to group indices and a single pass through those groups to find the minimum distance.
* **Space Complexity:** $O(n)$  
  In the worst case (all elements unique), we store $n$ keys in a Hash Map.

---

### **Approach: Mathematical Simplification + Frequency Tracking**



The "Medium" version of this problem relies on the same mathematical insight as the "Easy" version, but requires strict $O(n)$ efficiency due to the larger input size.

#### **1. Simplify the Formula**
For any three indices sorted such that $i < j < k$:
- $abs(i - j) = j - i$
- $abs(j - k) = k - j$
- $abs(k - i) = k - i$

Adding these together: $(j - i) + (k - j) + (k - i) = \mathbf{2 \cdot (k - i)}$.
To minimize the distance, we simply need to find the smallest possible gap between the **first** and **third** occurrence of any number.

#### **2. The Strategy:**
1.  **Group Indices:** Iterate through the array once. Use a Hash Map (or an array of lists since `nums[i] <= n`) to record the indices where each number appears.
    * *Example:* `nums = [1, 1, 2, 1]` $\rightarrow$ `{1: [0, 1, 3], 2: [2]}`.
2.  **Iterate Through Groups:** For each number that appeared at least 3 times:
    * Use a **Sliding Window** of size 3 over its list of indices.
    * If indices are $idx[p], idx[p+1], idx[p+2]$, the distance is $2 \cdot (idx[p+2] - idx[p])$.
3.  **Find the Global Minimum:** Compare all calculated distances and return the smallest. If no number appeared 3 times, return `-1`.

#### **Why not $O(n^3)$?**
With $n = 10^5$, $n^3$ would be $10^{15}$ operations, which would take days to process. The Hash Map approach processes each element exactly twice (once to store, once to check), making it $O(n)$.

---

**Topics:** `Array` | `Hash Table` | `Math` | `Sliding Window`
