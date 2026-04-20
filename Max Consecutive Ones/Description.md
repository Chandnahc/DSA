# [485. Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/)

## 🟢 Easy

---

### **Problem Statement**

Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [1,1,0,1,1,1]`  
> **Output:** `3`  
> **Explanation:** The first two digits are consecutive 1s. The last three digits are consecutive 1s. The maximum is 3.

**Example 2:**
> **Input:** `nums = [1,0,1,1,0,1]`  
> **Output:** `2`

---

### **Constraints**

- $1 \le nums.length \le 10^5$
- `nums[i]` is either `0` or `1`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the array exactly once.
* **Space Complexity:** $O(1)$  
  We only use two integer variables (`count` and `maxCount`) regardless of array size.

---

### **Approach: Single-Pass Iteration**



The goal is to maintain a "running tally" of ones and reset it whenever we encounter a zero.

#### **The Strategy:**
1.  **Initialize:** * `current_streak = 0` (to count the ones we are currently seeing).
    * `max_streak = 0` (to remember the longest streak seen so far).
2.  **Iterate:** For each `num` in `nums`:
    * **If it's a 1:** Increment `current_streak`.
    * **If it's a 0:** * Update `max_streak` if `current_streak` is larger.
        * Reset `current_streak = 0`.
3.  **Final Check:** After the loop ends, update `max_streak` one last time (this handles cases where the array ends with a streak of ones).
4.  **Return:** `max_streak`.

#### **Implementation Tip:**
While it’s common to update `max_streak` only when you hit a `0`, it is often cleaner to update it on every `1`:
```python
for num in nums:
    if num == 1:
        current_streak += 1
        max_streak = max(max_streak, current_streak)
    else:
        current_streak = 0
