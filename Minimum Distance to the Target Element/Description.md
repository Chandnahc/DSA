# [1848. Minimum Distance to the Target Element](https://leetcode.com/problems/minimum-distance-to-target-element/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer array `nums` (0-indexed) and two integers `target` and `start`, find an index `i` such that:
1. `nums[i] == target`
2. `abs(i - start)` is **minimized**.

**Return:** The minimum value of `abs(i - start)`.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [1,2,3,4,5], target = 5, start = 3`  
> **Output:** `1`  
> **Explanation:** `nums[4]` is the target. Distance: `abs(4 - 3) = 1`.

**Example 2:**
> **Input:** `nums = [1,1,1], target = 1, start = 0`  
> **Output:** `0`  
> **Explanation:** `nums[0]` is the target. Distance: `abs(0 - 0) = 0`.

---

### **Constraints**

- $1 \le nums.length \le 1000$
- $1 \le nums[i] \le 10^4$
- $0 \le start < nums.length$
- `target` is guaranteed to exist in `nums`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We may need to traverse the entire array to find all occurrences of the target.
* **Space Complexity:** $O(1)$  
  We only store a single variable to track the minimum distance found.

---

### **Approach: Linear Scan**



Since we need the minimum absolute difference, we can simply iterate through the entire array, check if the current element matches the target, and update our minimum distance.

#### **The Strategy:**
1.  **Initialize:** Create a variable `min_dist` and set it to a very large number (or the length of the array).
2.  **Iterate:** Loop through the array from `i = 0` to `n - 1`:
    * If `nums[i] == target`:
        * Calculate the current distance: `current_dist = abs(i - start)`.
        * Update `min_dist = min(min_dist, current_dist)`.
    * **Optimization:** If you find a distance of `0`, you can return immediately, as it’s impossible to get smaller than that.
3.  **Return:** `min_dist`.

#### **Alternative (Bidirectional Search):**
To potentially find the answer faster, you could start at the `start` index and move outwards in both directions simultaneously. The first time you hit the `target`, that index is guaranteed to have the minimum `abs(i - start)`.

---

**Topics:** `Array`
