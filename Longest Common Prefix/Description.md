# [14. Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

## 🟢 Easy

---

### **Problem Statement**

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

---

### **Examples**

**Example 1:**
> **Input:** `strs = ["flower","flow","flight"]`  
> **Output:** `"fl"`

**Example 2:**
> **Input:** `strs = ["dog","racecar","car"]`  
> **Output:** `""`  
> **Explanation:** There is no common prefix among the input strings.

---

### **Constraints**

- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of only lowercase English letters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(S)$  
  Where $S$ is the sum of all characters in all strings. In the worst case, we compare every character.
* **Space Complexity:** $O(1)$  
  We only use a small amount of extra space for the prefix string (excluding the output).

---

### **Approach: Vertical Scanning**



Instead of comparing the first string with the second, then the result with the third, we can compare characters at the same index across all strings:

1.  **Iterate** through the characters of the first string (`strs[0]`).
2.  For each character at index `i`, **check** that same index in all other strings in the array.
3.  **Stop and Return:** * If the index `i` is equal to the length of any string (meaning we reached the end of a string).
    * If the character at index `i` in any string does not match the character in the first string.
4.  If the loop completes for an index `i`, that character is part of the common prefix.

---

**Topics:** `String` | `Trie`
