# [228. Summary Ranges](https://leetcode.com/problems/summary-ranges/)

## 🟢 Easy

---

### **Problem Statement**

You are given a **sorted unique** integer array `nums`.

A **range** `[a,b]` is the set of all integers from `a` to `b` (inclusive). Return the **smallest sorted** list of ranges that cover all the numbers in the array exactly.

Each range `[a,b]` in the list should be output as:
- `"a->b"` if `a != b`
- `"a"` if `a == b`

---

### **Examples**

**Example 1:**
> **Input:** `nums = [0,1,2,4,5,7]`  
> **Output:** `["0->2","4->5","7"]`  
> **Explanation:** The ranges are:  
> [0,2] --> "0->2"  
> [4,5] --> "4->5"  
> [7,7] --> "7"

**Example 2:**
> **Input:** `nums = [0,2,3,4,6,8,9]`  
> **Output:** `["0","2->4","6","8->9"]`  
> **Explanation:** The ranges are:  
> [0,0] --> "0"  
> [2,4] --> "2->4"  
> [6,6] --> "6"  
> [8,9] --> "8->9"

---

### **Constraints**

- $0 \le \text{nums.length} \le 20$
- $-2^{31} \le \text{nums}[i] \le 2^{31} - 1$
- All the values of `nums` are **unique**.
- `nums` is sorted in ascending order.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the array once using a single loop or two pointers.
* **Space Complexity:** $O(1)$  
  (Excluding the output list) We only use a few variables to track the start and end of the current range.

---

### **Approach: Single Pass (Linear Scan)**



Since the array is sorted, any consecutive integers will be adjacent. We can identify the start of a range and then look for the end by checking if the next number is exactly `current + 1`.

#### **The Strategy:**
1.  **Initialize:** Start an empty list for results. Iterate through `nums` using a pointer `i`.
2.  **Identify Start:** For each `i`, set `start = nums[i]`.
3.  **Find End:** While the next element `nums[i + 1]` is exactly `nums[i] + 1`, increment `i`.
4.  **Format Range:**
    * If `start == nums[i]`, add `"start"` to the result.
    * If `start != nums[i]`, add `"start->nums[i]"` to the result.
5.  **Repeat:** Continue until the end of the array.

#### **Key Edge Case:**
Pay attention to the end of the array. The `while` loop condition must ensure it doesn't go out of bounds (`i + 1 < nums.length`).

---

**Topics:** `Array`
