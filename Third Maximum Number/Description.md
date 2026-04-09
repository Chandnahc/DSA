# [414. Third Maximum Number](https://leetcode.com/problems/third-maximum-number/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer array `nums`, return the **third distinct maximum** number in this array. 

- If the third maximum does not exist, return the **maximum** number.
- "Distinct" means that if the number `2` appears twice, it only counts as one of the top three positions.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [3,2,1]`  
> **Output:** `1`

**Example 2:**
> **Input:** `nums = [1,2]`  
> **Output:** `2`  
> **Explanation:** The third maximum does not exist, so the maximum (2) is returned.

**Example 3:**
> **Input:** `nums = [2,2,3,1]`  
> **Output:** `1`  
> **Explanation:** The first distinct max is 3, the second is 2, and the third is 1.

---

### **Constraints**

- $1 \le \text{nums.length} \le 10^4$
- $-2^{31} \le \text{nums}[i] \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the array once to maintain our top three variables.
* **Space Complexity:** $O(1)$  
  We only use three variables (or a fixed-size set) regardless of the input size.

---

### **Approach: Three-Pointer Tracking (Leaderboard)**



The most efficient way to solve this is to maintain three variables representing the 1st, 2nd, and 3rd largest values found so far.

#### **The Strategy:**
1.  **Initialize:** Create three variables, `first`, `second`, and `third`, initialized to a value smaller than any possible input (or use `null`/Optional types).
2.  **Iterate:** For every number `n` in `nums`:
    * **Skip Duplicates:** If `n` is already equal to `first`, `second`, or `third`, ignore it.
    * **Update First:** If `n > first`, move `second` to `third`, `first` to `second`, and set `first = n`.
    * **Update Second:** Else if `n > second`, move `second` to `third` and set `second = n`.
    * **Update Third:** Else if `n > third`, set `third = n`.
3.  **Result:** Check if `third` was ever updated. 
    * If `third` is still the initial "empty" value, return `first`.
    * Otherwise, return `third`.

#### **Alternative: Using a Set**
You can maintain a `Set` of size 3. For every number, add it to the set. If the set size exceeds 3, remove the minimum element. At the end, if the set has 3 elements, return the minimum; otherwise, return the maximum.

---

**Topics:** `Array` | `Sorting`
