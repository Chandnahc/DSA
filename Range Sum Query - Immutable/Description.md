# [303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer array `nums`, handle multiple queries of the following type:
- Calculate the **sum** of the elements of `nums` between indices `left` and `right` inclusive where `left <= right`.

Implement the `NumArray` class:
- `NumArray(int[] nums)`: Initializes the object with the integer array `nums`.
- `int sumRange(int left, int right)`: Returns the sum of the elements of `nums` between indices `left` and `right` inclusive.

---

### **Example 1**

**Input:**
`["NumArray", "sumRange", "sumRange", "sumRange"]`
`[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]`

**Output:**
`[null, 1, -1, -3]`

**Explanation:**
- `numArray.sumRange(0, 2)` -> $(-2) + 0 + 3 = 1$
- `numArray.sumRange(2, 5)` -> $3 + (-5) + 2 + (-1) = -1$
- `numArray.sumRange(0, 5)` -> $(-2) + 0 + 3 + (-5) + 2 + (-1) = -3$

---

### **Constraints**

- $1 \le \text{nums.length} \le 10^4$
- $-10^5 \le \text{nums}[i] \le 10^5$
- $0 \le \text{left} \le \text{right} < \text{nums.length}$
- At most $10^4$ calls will be made to `sumRange`.

---

### **Complexity Analysis**

* **Precomputation Time:** $O(n)$  
  We iterate through the array once to build the prefix sum array.
* **Query Time:** $O(1)$  
  Each `sumRange` call is a simple subtraction.
* **Space Complexity:** $O(n)$  
  We store an additional array of size $n+1$ to keep track of the prefix sums.

---

### **Approach: Prefix Sum**



If we precalculate the cumulative sum of all elements from the start of the array up to each index, we can find the sum of any subarray by subtracting two values.

#### **The Logic:**
1.  **Define Prefix Sum:** Let `prefix[i]` be the sum of all elements from `nums[0]` to `nums[i-1]`. 
2.  **The Formula:** The sum of the range `[left, right]` is:
    $$\text{Sum}(left, right) = \text{prefix}[right + 1] - \text{prefix}[left]$$
3.  **Why $n+1$?** By making the prefix array one element longer than the original array (with `prefix[0] = 0`), we handle the case where `left = 0` without needing extra `if` statements.

#### **Example Visualization:**
- `nums`: `[-2, 0, 3, -5]`
- `prefix`: `[0, -2, -2, 1, -4]`
- `sumRange(1, 2)`: `prefix[3] - prefix[1]` $\to$ `1 - (-2) = 3`.

---

**Topics:** `Array` | `Design` | `Prefix Sum`
