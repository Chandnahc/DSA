# [15. 3Sum](https://leetcode.com/problems/3sum/)

## 🟡 Medium

---

### **Problem Statement**

Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain **duplicate triplets**.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [-1,0,1,2,-1,-4]`  
> **Output:** `[[-1,-1,2],[-1,0,1]]`  
> **Explanation:** > nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.  
> nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.  
> nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.  
> The distinct triplets are [-1,0,1] and [-1,-1,2].

**Example 2:**
> **Input:** `nums = [0,1,1]`  
> **Output:** `[]`

**Example 3:**
> **Input:** `nums = [0,0,0]`  
> **Output:** `[[0,0,0]]`

---

### **Constraints**

- `3 <= nums.length <= 3000`
- `-10^5 <= nums[i] <= 10^5`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n^2)$  
  Sorting takes $O(n \log n)$. The nested loops (one `for` loop and one `while` loop for two pointers) take $O(n^2)$.
* **Space Complexity:** $O(1)$ or $O(n)$  
  Depending on the sorting algorithm implementation, but we ignore the space required for the output list.

---

### **Approach: Sorting and Two Pointers**



To solve this efficiently and avoid duplicates, we first sort the array. This allows us to use a two-pointer approach similar to Two Sum II.

1.  **Sort the array:** This is crucial for the two-pointer logic and for skipping duplicates easily.
2.  **Iterate through the array:** Use a pointer `i` as the "fixed" element.
    * **Skip duplicates:** If `nums[i]` is the same as `nums[i-1]`, skip it to avoid duplicate triplets.
    * **Optimization:** If `nums[i] > 0`, break the loop (since the array is sorted, no three positive numbers can sum to zero).
3.  **Two Pointers:** For each `i`, set `left = i + 1` and `right = nums.length - 1`.
    * Calculate `sum = nums[i] + nums[left] + nums[right]`.
    * If `sum == 0`: 
        * Add the triplet to the result.
        * Move `left` and `right` pointers, skipping any identical values to avoid duplicates.
    * If `sum < 0`: Move `left` forward to increase the sum.
    * If `sum > 0`: Move `right` backward to decrease the sum.

---

**Topics:** `Array` | `Two Pointers` | `Sorting`
