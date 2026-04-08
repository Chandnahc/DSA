# [409. Longest Palindrome](https://leetcode.com/problems/longest-palindrome/)

## 🟢 Easy

---

### **Problem Statement**

Given a string `s` which consists of lowercase or uppercase letters, return the length of the **longest palindrome** that can be built with those letters.

**Note:** Letters are **case sensitive**. For example, `"Aa"` is not considered a palindrome because `'A'` and `'a'` are distinct characters.

---

### **Examples**

**Example 1:**
> **Input:** `s = "abccccdd"`  
> **Output:** `7`  
> **Explanation:** One longest palindrome that can be built is `"dccaccd"`, which has a length of 7.

**Example 2:**
> **Input:** `s = "a"`  
> **Output:** `1`

---

### **Constraints**

- $1 \le s.length \le 2000$
- `s` consists of lowercase and/or uppercase English letters only.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the string once to count the frequencies of each character.
* **Space Complexity:** $O(k)$  
  Where $k$ is the number of unique characters. Since the input is limited to English letters (lowercase and uppercase), the space is technically $O(1)$ as it will not exceed a fixed size (e.g., a frequency array of 52 or 128).

---

### **Approach: Greedy Counting**



A palindrome consists of pairs of characters, and optionally, **one** single character in the very middle.

#### **The Strategy:**
1.  **Count Frequencies:** Use a Hash Map or a frequency array to count how many times each character appears in `s`.
2.  **Form Pairs:** For every character count, see how many pairs you can make. 
    * If a character appears 4 times, you can use all 4 ($4 // 2 * 2 = 4$).
    * If a character appears 5 times, you can use 4 of them in pairs and have 1 left over ($5 // 2 * 2 = 4$).
3.  **The "Middle" Character:** After adding up all the pairs, if there is **any** character left over (i.e., the total length calculated so far is less than the original string length), you can take exactly one of those leftover characters and place it in the center.
4.  **The Formula:** * $\text{Length} = \sum (\text{count} / 2 * 2)$
    * If $\text{Length} < s.length$, then $\text{Length} = \text{Length} + 1$.

#### **Alternative (Set-based) Logic:**
You can also use a `Set`. Iterate through the string: if a character is already in the set, remove it and add 2 to your result (you found a pair). If it's not in the set, add it. At the end, if the set is not empty, add 1 to the result for the center character.

---

**Topics:** `Hash Table` | `String` | `Greedy`
