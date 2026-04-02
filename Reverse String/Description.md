# [344. Reverse String](https://leetcode.com/problems/reverse-string/)

## 🟢 Easy

---

### **Problem Statement**

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by **modifying the input array in-place** with $O(1)$ extra memory.

---

### **Examples**

**Example 1:**
> **Input:** `s = ["h","e","l","l","o"]`  
> **Output:** `["o","l","l","e","h"]`

**Example 2:**
> **Input:** `s = ["H","a","n","n","a","h"]`  
> **Output:** `["h","a","n","n","a","H"]`

---

### **Constraints**

- $1 \le s.length \le 10^5$
- `s[i]` is a printable ASCII character.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We perform $n/2$ swaps, which is linear relative to the size of the string.
* **Space Complexity:** $O(1)$  
  We perform the reversal in-place, using only a constant amount of extra space for pointers and temporary variables.

---

### **Approach: Two Pointers**



The most efficient way to reverse an array is to use two pointers starting at opposite ends and moving toward the center.

#### **The Strategy:**
1.  **Initialize Pointers:** Set `left = 0` and `right = s.length - 1`.
2.  **Iterate:** While `left < right`:
    * **Swap:** Swap the characters at `s[left]` and `s[right]`.
    * **Move:** Increment `left` and decrement `right`.
3.  **Stop:** When the pointers meet or cross, the entire string has been reversed.

#### **Implementation Tip:**
In languages like Python, you can perform the swap in a single line:  
`s[left], s[right] = s[right], s[left]`  
In other languages like Java or C++, you will need a temporary variable `char temp = s[left]` to facilitate the swap.

---

**Topics:** `Two Pointers` | `String`
