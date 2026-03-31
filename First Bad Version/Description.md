# [278. First Bad Version](https://leetcode.com/problems/first-bad-version/)

## 🟢 Easy

---

### **Problem Statement**

You are a product manager leading a team to develop a new product. Unfortunately, the latest version fails the quality check. Since each version is developed based on the previous version, all versions after a bad version are also bad.

Suppose you have `n` versions `[1, 2, ..., n]` and you want to find out the first bad one. You are given an API `bool isBadVersion(version)` which returns whether `version` is bad. 

**Goal:** Implement a function to find the first bad version while **minimizing** the number of calls to the API.

---

### **Examples**

**Example 1:**
> **Input:** `n = 5, bad = 4`  
> **Output:** `4`  
> **Explanation:** > `isBadVersion(3)` -> `false`  
> `isBadVersion(5)` -> `true`  
> `isBadVersion(4)` -> `true`  
> The first bad version is 4.

**Example 2:**
> **Input:** `n = 1, bad = 1`  
> **Output:** `1`

---

### **Constraints**

- $1 \le \text{bad} \le n \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log n)$  
  Since we discard half of the search space in each step using binary search.
* **Space Complexity:** $O(1)$  
  We only use a few variables for the pointers.

---

### **Approach: Binary Search**



Since the versions are "sorted" by their failure status (all `false` followed by all `true`), we can find the first `true` using binary search.

#### **The Strategy:**
1.  **Initialize Pointers:** `left = 1`, `right = n`.
2.  **Loop:** While `left < right`:
    * Calculate `mid`. Use `mid = left + (right - left) / 2` to avoid integer overflow.
    * **Check API:** * If `isBadVersion(mid)` is `true`: The first bad version is either `mid` or somewhere to the **left**. So, move the boundary: `right = mid`.
        * If `isBadVersion(mid)` is `false`: The first bad version must be to the **right** of `mid`. So, `left = mid + 1`.
3.  **Result:** When the loop ends, `left` and `right` will meet at the first bad version.

#### **Why `right = mid` instead of `mid - 1`?**
When `isBadVersion(mid)` is true, `mid` itself could be the first bad version. If we set `right = mid - 1`, we might skip the answer. By keeping `mid` within the search space, we ensure we converge on the correct index.

---

**Topics:** `Binary Search` | `Interactive`
