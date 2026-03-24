# [205. Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)

## 🟢 Easy

---

### **Problem Statement**

Given two strings `s` and `t`, determine if they are **isomorphic**.

Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

---

### **Examples**

**Example 1:**
> **Input:** `s = "egg", t = "add"`  
> **Output:** `true`  
> **Explanation:** 'e' maps to 'a', and 'g' maps to 'd'.

**Example 2:**
> **Input:** `s = "foo", t = "bar"`  
> **Output:** `false`  
> **Explanation:** 'o' would have to map to both 'a' and 'r', which is not allowed.

**Example 3:**
> **Input:** `s = "paper", t = "title"`  
> **Output:** `true`

---

### **Constraints**

- `1 <= s.length <= 5 * 10^4`
- `t.length == s.length`
- `s` and `t` consist of any valid ASCII character.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the strings exactly once, where $n$ is the length of the strings.
* **Space Complexity:** $O(k)$  
  Where $k$ is the size of the character set (e.g., 256 for ASCII). In the worst case, we store mappings for all unique characters.

---

### **Approach: Dual Hash Maps (Bijective Mapping)**

To confirm two strings are isomorphic, we must ensure a unique relationship between characters of `s` and `t`. 



#### **The Strategy:**
1.  **Two Maps:** Use two hash maps (or arrays of size 256 for ASCII):
    * `mapS2T`: Stores which character in `t` is mapped to by a character in `s`.
    * `mapT2S`: Stores which character in `s` is mapped to by a character in `t`.
2.  **Iterate:** Loop through both strings simultaneously:
    * Check if `s[i]` already has a mapping in `mapS2T`. If it does, and it doesn't match `t[i]`, return `false`.
    * Check if `t[i]` already has a mapping in `mapT2S`. If it does, and it doesn't match `s[i]`, return `false`.
    * If no mappings exist, create them in both maps.
3.  **Result:** If you reach the end of the loop without conflicts, return `true`.

#### **Alternative Trick:**
You can also solve this using a single pass by recording the **last seen index** of each character. If `lastSeenS[s[i]] != lastSeenT[t[i]]`, the strings are not isomorphic because the characters are not appearing in the same relative pattern.

---

**Topics:** `Hash Table` | `String`
