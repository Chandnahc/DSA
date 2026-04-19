# [482. License Key Formatting](https://leetcode.com/problems/license-key-formatting/)

## 🟢 Easy

---

### **Problem Statement**

You are given a license key string `s` (alphanumeric characters and dashes) and an integer `k`. 

**Goal:** Reformat the string so that:
1. Each group contains exactly `k` characters, **except for the first group**, which can be shorter (but must have at least one character).
2. Groups are separated by dashes.
3. All lowercase letters are converted to **uppercase**.

---

### **Examples**

**Example 1:**
> **Input:** `s = "5F3Z-2e-9-w", k = 4`  
> **Output:** `"5F3Z-2E9W"`  
> **Explanation:** The string has 8 alphanumeric characters. Split into two groups of 4.

**Example 2:**
> **Input:** `s = "2-5g-3-J", k = 2`  
> **Output:** `"2-5G-3J"`  
> **Explanation:** The string has 5 alphanumeric characters. We get one group of 1, and two groups of 2.

---

### **Constraints**

- $1 \le s.length \le 10^5$
- `s` consists of English letters, digits, and dashes `'-'`.
- $1 \le k \le 10^4$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the string once to filter out dashes and once more to build the result.
* **Space Complexity:** $O(n)$  
  We need space to store the reformatted string.

---

### **Approach: Reverse Processing**



Processing from the front is tricky because the first group's size depends on the total count of characters. Processing from the **back** is straightforward: every $k$ characters, you add a dash.

#### **The Strategy:**
1.  **Clean the String:** Remove all existing dashes and convert all characters to uppercase.
2.  **Iterate Backwards:** Start from the end of the cleaned string.
3.  **Group by K:** * Add characters to a result builder.
    * Maintain a counter. Every time the counter reaches `k`, add a dash (unless you are at the very beginning of the string).
4.  **Reverse and Return:** Since we built the string from back to front, reverse the final result before returning it.

#### **Implementation Tip:**
Using a `StringBuilder` (Java/C#) or a list that you `join` (Python) is significantly more efficient than string concatenation, especially given the $10^5$ constraint. 

---

**Topics:** `String` | `Simulation`
