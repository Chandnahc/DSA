# [290. Word Pattern](https://leetcode.com/problems/word-pattern/)

## 🟢 Easy

---

### **Problem Statement**

Given a `pattern` and a string `s`, find if `s` follows the same pattern.

A **full match** means there is a **bijection** between a letter in `pattern` and a non-empty word in `s`. Specifically:
1. Each letter in `pattern` maps to exactly one unique word in `s`.
2. Each unique word in `s` maps to exactly one letter in `pattern`.
3. No two letters map to the same word, and no two words map to the same letter.

---

### **Examples**

**Example 1:**
> **Input:** `pattern = "abba", s = "dog cat cat dog"`  
> **Output:** `true`  
> **Explanation:** 'a' maps to "dog" and 'b' maps to "cat".

**Example 2:**
> **Input:** `pattern = "abba", s = "dog cat cat fish"`  
> **Output:** `false`  
> **Explanation:** 'a' mapped to "dog" initially, but the second 'a' at the end encounters "fish".

**Example 3:**
> **Input:** `pattern = "aaaa", s = "dog cat cat dog"`  
> **Output:** `false`

---

### **Constraints**

- $1 \le \text{pattern.length} \le 300$
- `pattern` contains only lower-case English letters.
- $1 \le s.length \le 3000$
- `s` contains only lowercase English letters and spaces.
- All words in `s` are separated by a single space.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n + m)$  
  Where $n$ is the number of characters in the pattern and $m$ is the number of characters in string $s$. We process each string once.
* **Space Complexity:** $O(w)$  
  Where $w$ is the number of unique words in $s$. We store these in hash maps to verify the bijection.

---

### **Approach: Double Hash Map (Bijective Mapping)**



To ensure a true bijection, we must verify the relationship from both sides: **Pattern $\to$ Word** and **Word $\to$ Pattern**.

#### **The Strategy:**
1.  **Split the String:** Convert the string `s` into an array of words by splitting at the spaces.
2.  **Length Check:** If the number of characters in `pattern` is not equal to the number of words in `s`, return `false` immediately.
3.  **Two-Way Tracking:** Use two Hash Maps:
    * `charToWord`: Maps a character (e.g., 'a') to a word (e.g., "dog").
    * `wordToChar`: Maps a word (e.g., "dog") back to a character (e.g., 'a').
4.  **Iterate and Validate:**
    * If the character or word is already in its respective map, check if it still matches the current pair.
    * If it doesn't match, return `false`.
    * If it’s a new entry, add it to both maps.
5.  **Result:** If you finish the loop without conflicts, return `true`.

#### **Why Two Maps?**
If you only use one map (e.g., `charToWord`), you might fail a test case like `pattern = "abba", s = "dog dog dog dog"`. In this case, 'a' and 'b' would both map to "dog," which violates the "unique" requirement of a bijection.

---

**Topics:** `Hash Table` | `String`
