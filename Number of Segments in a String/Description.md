# [434. Number of Segments in a String](https://leetcode.com/problems/number-of-segments-in-a-string/)

## 🟢 Easy

---

### **Problem Statement**

Given a string `s`, return the number of **segments** in the string.

A **segment** is defined to be a contiguous sequence of **non-space characters**.

---

### **Examples**

**Example 1:**
> **Input:** `s = "Hello, my name is John"`  
> **Output:** `5`  
> **Explanation:** The five segments are `["Hello,", "my", "name", "is", "John"]`.

**Example 2:**
> **Input:** `s = "Hello"`  
> **Output:** `1`

---

### **Constraints**

- $0 \le s.length \le 300$
- `s` consists of English letters, digits, or special characters: `!@#$%^&*()_+-=',.:`.
- The only space character in `s` is `' '`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the string exactly once to count the segments.
* **Space Complexity:** $O(1)$  
  We only use a single counter variable, regardless of the input size.

---

### **Approach: Single-Pass Counting (The "Start of Segment" Rule)**



The most efficient way to solve this without creating extra arrays (like `split()` does) is to count the instances where a new segment **begins**.

#### **The Logic:**
A character is the **start of a new segment** if:
1. It is **not** a space.
2. It is either at the **beginning of the string** (index 0) **OR** the character immediately **before it is a space**.

#### **The Strategy:**
1. Initialize `segmentCount = 0`.
2. Iterate through the string from `i = 0` to `s.length - 1`:
   * Check if `s[i]` is not a space (`s[i] != ' '`).
   * Check if `i == 0` OR `s[i - 1] == ' '`.
   * If both are true, increment `segmentCount`.
3. Return `segmentCount`.

#### **Why this is better than `.split()`:**
Built-in split functions often create a list of strings in memory, which takes $O(n)$ space. If you have a massive string, this manual count is much more memory-efficient ($O(1)$ space). It also handles cases like `"    "` (all spaces) or `"a b  c"` (multiple spaces) perfectly without needing complex Regex.

---

**Topics:** `String`
