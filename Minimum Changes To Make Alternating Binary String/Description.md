# [1758. Minimum Changes To Make Alternating Binary String](https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/)

## 🟢 Easy

---

### **Problem Statement**

You are given a string `s` consisting only of the characters `'0'` and `'1'`. In one operation, you can change any `'0'` to `'1'` or vice versa.

The string is called **alternating** if no two adjacent characters are equal. For example, the string `"010"` is alternating, while the string `"0100"` is not.

Return the **minimum** number of operations needed to make `s` alternating.

---

### **Examples**

**Example 1:**
> **Input:** `s = "0100"`  
> **Output:** `1`  
> **Explanation:** If you change the last character to '1', s will be "0101", which is alternating.

**Example 2:**
> **Input:** `s = "10"`  
> **Output:** `0`  
> **Explanation:** s is already alternating.

**Example 3:**
> **Input:** `s = "1111"`  
> **Output:** `2`  
> **Explanation:** You need two operations to reach "0101" or "1010".

---

### **Constraints**

- `1 <= s.length <= 10^4`
- `s[i]` is either `'0'` or `'1'`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the string once to count the mismatches for one of the two possible patterns.
* **Space Complexity:** $O(1)$  
  We only use a few integer variables to store the mismatch counts.

---

### **Approach: Dual Pattern Comparison**



There are only two possible alternating strings of length $n$:
1.  Pattern A: Starts with `0` (`010101...`)
2.  Pattern B: Starts with `1` (`101010...`)

**The Key Insight:**
If it takes $k$ operations to turn `s` into Pattern A, it will take $n - k$ operations to turn `s` into Pattern B. This is because every character that *matches* Pattern A will *mismatch* Pattern B.

1.  **Count Mismatches for Pattern A:** Iterate through the string. For each index `i`:
    * If `i` is even, we expect `'0'`.
    * If `i` is odd, we expect `'1'`.
    * Increment a counter `count0` if the character doesn't match this expectation.
2.  **Calculate for Pattern B:** The cost for Pattern B is simply `s.length() - count0`.
3.  **Return the Minimum:** `min(count0, s.length() - count0)`.

---

**Topics:** `String` | `Greedy`
