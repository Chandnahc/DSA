# [367. Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/)

## 🟢 Easy

---

### **Problem Statement**

Given a positive integer `num`, return `true` if `num` is a perfect square or `false` otherwise.

A **perfect square** is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

**Note:** You must **not** use any built-in library functions, such as `sqrt`.

---

### **Examples**

**Example 1:**
> **Input:** `num = 16`  
> **Output:** `true`  
> **Explanation:** $4 \times 4 = 16$, and 4 is an integer.

**Example 2:**
> **Input:** `num = 14`  
> **Output:** `false`  
> **Explanation:** $3.742 \times 3.742 = 14$, and 3.742 is not an integer.

---

### **Constraints**

- $1 \le \text{num} \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log n)$  
  We use binary search to narrow down the potential square root, halving the search space in each step.
* **Space Complexity:** $O(1)$  
  We only use a few variables to store the boundaries and the middle point.

---

### **Approach 1: Binary Search**



Since the square root of `num` is guaranteed to be between $1$ and `num`, we can perform a binary search in this range.

#### **The Strategy:**
1.  **Initialize Pointers:** `left = 1`, `right = num`.
2.  **Loop:** While `left <= right`:
    * Calculate `mid = left + (right - left) / 2`.
    * Calculate `square = mid * mid`.
    * **Check:**
        * If `square == num`, return `true`.
        * If `square < num`, the root must be larger; move `left = mid + 1`.
        * If `square > num`, the root must be smaller; move `right = mid - 1`.
3.  **Result:** If the loop finishes without finding a match, return `false`.

**Pro Tip:** To prevent integer overflow during `mid * mid` in languages like Java or C++, use a `long` type for the square calculation.

### **Approach 2: Newton's Method (Mathematical)**



Newton's method is an iterative process to find the root of a function (in this case, $f(x) = x^2 - \text{num}$). It converges very quickly.

1.  Start with a guess $x = \text{num}$.
2.  While $x \cdot x > \text{num}$:
    * Update $x = (x + \text{num} / x) / 2$.
3.  Return $x \cdot x == \text{num}$.

---

**Topics:** `Math` | `Binary Search`
