# [551. Student Attendance Record I](https://leetcode.com/problems/student-attendance-record-i/)

## 🟢 Easy

---

### **Problem Statement**

You are given a string `s` representing a student's attendance record. Characters can be:
- `'A'`: Absent
- `'L'`: Late
- `'P'`: Present

The student is eligible for an award **only if** they meet both criteria:
1.  **Absences:** Fewer than 2 `'A'`s in total.
2.  **Lateness:** Never late for 3 or more **consecutive** days (i.e., `"LLL"` is not allowed).

**Goal:** Return `true` if the student is eligible, otherwise `false`.

---

### **Examples**

**Example 1:**
> **Input:** `s = "PPALLP"`  
> **Output:** `true`  
> **Explanation:** Total 'A's = 1. No "LLL" found. Eligible!

**Example 2:**
> **Input:** `s = "PPALLL"`  
> **Output:** `false`  
> **Explanation:** While there is only one 'A', there are 3 consecutive 'L's at the end. Not eligible.

---

### **Constraints**

- $1 \le s.length \le 1000$
- `s[i]` is either `'A'`, `'L'`, or `'P'`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We scan the string once to count absences and check for the "LLL" pattern.
* **Space Complexity:** $O(1)$  
  We only use a few variables for counting or pattern matching.

---

### **Approach: Single-Pass Scan**

The most direct way to solve this is to iterate through the string once and keep track of our "bad" behaviors.

#### **The Strategy:**
1.  **Count Absences:** Maintain a counter for `'A'`. If it hits 2, return `false` immediately.
2.  **Check Lateness:** * If the current character is `'L'`, check if the *next two* characters are also `'L'`.
    * Alternatively, maintain a `consecutiveL` counter that increments on `'L'` and resets to `0` on any other character. If the counter hits 3, return `false`.
3.  **Return:** If the loop finishes without failing either rule, return `true`.



#### **The "Cheat Sheet" Way (Python/Java/JavaScript):**
In most languages, you can solve this in one line of logic using built-in methods:
- Check if the count of `'A'` is less than 2.
- Check if the substring `"LLL"` is **not** in `s`.

```python
return s.count('A') < 2 and "LLL" not in s
