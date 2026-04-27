# [520. Detect Capital](https://leetcode.com/problems/detect-capital/)

## 🟢 Easy

---

### **Problem Statement**

We define the usage of capitals in a word to be correct if it matches one of these three cases:
1.  **All letters** are capitals (e.g., `"USA"`).
2.  **All letters** are lowercase (e.g., `"leetcode"`).
3.  **Only the first letter** is capital (e.g., `"Google"`).

**Goal:** Given a string `word`, return `true` if the capitalization usage is correct.

---

### **Examples**

**Example 1:**
> **Input:** `word = "USA"`  
> **Output:** `true`

**Example 2:**
> **Input:** `word = "FlaG"`  
> **Output:** `false`  
> **Explanation:** The 'F' and 'G' are uppercase, but 'l' and 'a' are lowercase. This doesn't fit any of the three rules.

---

### **Constraints**

- $1 \le \text{word.length} \le 100$
- `word` consists of lowercase and uppercase English letters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We need to scan the string to check the casing of the characters.
* **Space Complexity:** $O(1)$  
  We only store a few boolean flags or integer counters.

---

### **Approach: Case Analysis**



There are two common ways to solve this: the **built-in method** approach and the **manual counting** approach.

#### **Method 1: Built-in String Methods**
This is the most readable way. A word is valid if:
- `word.isupper()` is true.
- `word.islower()` is true.
- `word.istitle()` is true (meaning only the first char is uppercase).

#### **Method 2: Manual Counting (Character Scan)**
If you want to avoid multiple passes or built-in functions:
1.  **Count the Capitals:** Iterate through the string and count how many characters are uppercase.
2.  **Apply Logic:**
    * If `count == word.length`, return `true` (All caps).
    * If `count == 0`, return `true` (All lowercase).
    * If `count == 1` **AND** the first character is uppercase, return `true` (First letter only).
    * Otherwise, return `false`.

#### **Method 3: Regex**
For those who like patterns, the regex `^[A-Z]*$|^[a-z]*$|^[A-Z][a-z]*$` covers all three valid cases perfectly.

---

**Topics:** `String`
