# [58. Length of Last Word](https://leetcode.com/problems/length-of-last-word/)

## 🟢 Easy

---

### **Problem Statement**

Given a string `s` consisting of words and spaces, return the length of the **last word** in the string.

A **word** is a maximal substring consisting of non-space characters only.

---

### **Examples**

**Example 1:**
> **Input:** `s = "Hello World"`  
> **Output:** `5`  
> **Explanation:** The last word is "World" with length 5.

**Example 2:**
> **Input:** `s = "   fly me   to   the moon  "`  
> **Output:** `4`  
> **Explanation:** The last word is "moon" with length 4.

**Example 3:**
> **Input:** `s = "luffy is still joyboy"`  
> **Output:** `6`  
> **Explanation:** The last word is "joyboy" with length 6.

---

### **Constraints**

- `1 <= s.length <= 10^4`
- `s` consists of only English letters and spaces `' '`.
- There will be at least one word in `s`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  In the worst case, we might traverse the entire string once.
* **Space Complexity:** $O(1)$  
  We only use a few integer variables to keep track of the length.

---

### **Approach: Reverse Traversal**



To find the length of the last word efficiently, we should start from the **end** of the string:

1.  **Skip Trailing Spaces:** Start from the last character and move backwards until you hit a non-space character.
2.  **Count Characters:** Once you find the start of the last word, continue moving backwards and increment a counter for every non-space character.
3.  **Stop at Space:** Stop counting as soon as you hit another space or the beginning of the string.
4.  **Return** the counter.

---

**Topics:** `String`
