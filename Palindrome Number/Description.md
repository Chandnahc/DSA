# [9. Palindrome Number](https://leetcode.com/problems/palindrome-number/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.

An integer is a palindrome when it reads the same backward as forward. For example, `121` is a palindrome while `123` is not.

---

### **Examples**

**Example 1:**
> **Input:** `x = 121`  
> **Output:** `true`  
> **Explanation:** 121 reads as 121 from left to right and from right to left.

**Example 2:**
> **Input:** `x = -121`  
> **Output:** `false`  
> **Explanation:** From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

**Example 3:**
> **Input:** `x = 10`  
> **Output:** `false`  
> **Explanation:** Reads 01 from right to left. Therefore it is not a palindrome.

---

### **Constraints**

- `-2^31 <= x <= 2^31 - 1`

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log_{10}(n))$  
  We divide the input by 10 in every iteration.
* **Space Complexity:** $O(1)$  
  We only use a constant amount of extra space for the reversed number.

---

### **Approach: Reversing Half of the Number**



To avoid potential integer overflow and save time, we only need to reverse the **second half** of the number and compare it to the first half.

1.  **Handle Edge Cases:**
    * If `x < 0`, it cannot be a palindrome (the negative sign makes it different when reversed).
    * If `x > 0` and ends in `0`, it cannot be a palindrome (the first digit cannot be 0).
2.  **Reverse the Second Half:**
    * Use a variable `reversedNum = 0`.
    * In a loop, take the last digit of `x` (`x % 10`) and add it to `reversedNum` after shifting its digits (`reversedNum * 10`).
    * Divide `x` by 10.
    * **Stop** when `x <= reversedNum`. This means we've reached the middle.
3.  **Compare:**
    * For even-length numbers: `x == reversedNum`.
    * For odd-length numbers: `x == reversedNum / 10` (the middle digit doesn't matter).

---

**Topics:** `Math`
