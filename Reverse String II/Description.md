# [541. Reverse String II](https://leetcode.com/problems/reverse-string-ii/)

## 🟢 Easy

---

### **Problem Statement**

Given a string `s` and an integer `k`, reverse the first `k` characters for every `2k` characters counting from the start of the string.

**The Rules:**
1. For every block of `2k` characters: reverse the first `k`, leave the next `k` alone.
2. If fewer than `k` characters remain at the end: reverse all of them.
3. If between `k` and `2k` characters remain: reverse the first `k` and leave the rest as original.

---

### **Examples**

**Example 1:**
> **Input:** `s = "abcdefg", k = 2`  
> **Output:** `"bacdfeg"`  
> **Explanation:** > - First 2k (4) chars: "abcd". Reverse first 2 -> "ba", leave "cd" -> "bacd"
> - Remaining chars: "efg". Reverse first 2 -> "fe", leave "g" -> "feg"
> - Total: "bacdfeg"

**Example 2:**
> **Input:** `s = "abcd", k = 2`  
> **Output:** `"bacd"`

---

### **Constraints**

- $1 \le s.length \le 10^4$
- `s` consists of only lowercase English letters.
- $1 \le k \le 10^4$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We visit every character in the string at most twice (once for the jump and once if it's being reversed).
* **Space Complexity:** $O(n)$  
  Strings are immutable in many languages (like Python/Java), so we need $O(n)$ space to convert the string into a mutable array or list to perform the swap.

---

### **Approach: Jump and Swap**



The most efficient way to solve this is to iterate through the string with a step size of $2k$.

#### **The Strategy:**
1.  **Convert to Array:** Convert the string to a character array/list so you can modify it in place.
2.  **The Loop:** Iterate through the array using `for (int i = 0; i < s.length(); i += 2 * k)`.
3.  **Define Boundaries:** * The start of the reversal is `i`.
    * The end of the reversal is `min(i + k - 1, s.length() - 1)`. Using `min` automatically handles the case where there are fewer than `k` characters left.
4.  **Reverse:** Use a standard two-pointer swap (left and right) to reverse the characters within those boundaries.
5.  **Join:** Convert the array back into a string and return.

#### **Why the step size $2k$?**
By jumping $2k$ at a time, we land exactly at the start of every segment that needs reversing. We don't need to track the "skipped" $k$ characters because the loop index simply jumps over them.

---

**Topics:** `Two Pointers` | `String`
