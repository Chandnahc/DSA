# [557. Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/)

## 🟢 Easy

---

### **Problem Statement**

Given a string `s`, reverse the order of characters in each word within a sentence while still preserving whitespace and the initial word order.

---

### **Examples**

**Example 1:**
> **Input:** `s = "Let's take LeetCode contest"`  
> **Output:** `"s'teL ekat edoCteeL tsetnoc"`  
> **Explanation:** Each individual word is reversed in place.

**Example 2:**
> **Input:** `s = "Mr Ding"`  
> **Output:** `"rM gniD"`

---

### **Constraints**

- $1 \le s.length \le 5 \times 10^4$
- `s` contains printable ASCII characters.
- `s` does not contain leading or trailing spaces.
- All words are separated by a single space.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the string to find spaces and reverse each character once.
* **Space Complexity:** $O(n)$  
  Since strings are immutable in many languages, we need $O(n)$ space to store the characters in a mutable format (like an array or string builder) to perform the reversal.

---

### **Approach: Two-Pointer Word Reversal**



To solve this efficiently in one pass without using heavy built-in "split" functions, we can use a two-pointer approach.

#### **The Strategy:**
1.  **Convert to Array:** Start by converting the string into a mutable character array.
2.  **Locate Word Boundaries:** Iterate through the array with a pointer `i`. When `i` marks the start of a word:
    * Use a second pointer `j` to find the end of the word (the character before the next space or the end of the string).
3.  **Reverse the Word:** Use a standard two-pointer swap (left and right) between `i` and `j` to reverse that specific segment of the array.
4.  **Continue:** Move `i` to the position after the space and repeat until the end of the string.

#### **The "Split and Join" Alternative:**
In languages like Python or JavaScript, you can achieve this in a single line:
1.  **Split** the string by spaces into a list of words.
2.  **Reverse** each word in the list.
3.  **Join** the words back together with a single space.

```python
return " ".join(word[::-1] for word in s.split())
