# [387. First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)

## 🟢 Easy

---

### **Problem Statement**

Given a string `s`, find the **first non-repeating character** in it and return its index. If it does not exist, return `-1`.

---

### **Examples**

**Example 1:**
> **Input:** `s = "leetcode"`  
> **Output:** `0`  
> **Explanation:** 'l' is the first character that appears only once.

**Example 2:**
> **Input:** `s = "loveleetcode"`  
> **Output:** `2`  
> **Explanation:** 'l' and 'o' repeat later, but 'v' at index 2 is the first unique one.

**Example 3:**
> **Input:** `s = "aabb"`  
> **Output:** `-1`

---

### **Constraints**

- $1 \le s.length \le 10^5$
- `s` consists of only lowercase English letters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the string twice: once to count frequencies and once to find the first index with a count of 1.
* **Space Complexity:** $O(1)$  
  Since the input only contains 26 lowercase English letters, the frequency array size remains constant regardless of the input string length.

---

### **Approach: Two-Pass Frequency Array**



To find the first unique character, we need to know the global count of every character before we can decide if the character at index 0 is truly unique.

#### **The Strategy:**
1.  **First Pass (Counting):** Create an integer array of size 26. Iterate through the string and increment the count for each character (e.g., `count[s[i] - 'a']++`).
2.  **Second Pass (Discovery):** Iterate through the string a second time from left to right. For each character, check its count in the frequency array.
3.  **Check and Return:** The first character you encounter with a count of exactly **1** is your answer. Return its current index.
4.  **Default:** If you finish the second pass without finding a unique character, return `-1`.

#### **Why Two Passes?**
You cannot determine if a character is unique until you've seen the *entire* string. By using a second pass over the original string (rather than the frequency map), you naturally respect the "first" requirement because you are checking indices in increasing order ($0, 1, 2...$).

---

**Topics:** `Hash Table` | `String` | `Queue` | `Counting`
