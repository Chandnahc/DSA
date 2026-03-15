# [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

## 🟢 Easy

---

### **Problem Statement**

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` if it is a **palindrome**, or `false` otherwise.

---

### **Example 1**

> **Input:** `s = "A man, a plan, a canal: Panama"`  
> **Output:** `true`  
> **Explanation:** After processing, the string becomes `"amanaplanacanalpanama"`, which reads the same forward and backward.

### **Example 2**

> **Input:** `s = "race a car"`  
> **Output:** `false`  
> **Explanation:** After processing, the string becomes `"raceacar"`, which is not a palindrome.

### **Example 3**

> **Input:** `s = " "`  
> **Output:** `true`  
> **Explanation:** `s` is an empty string `""` after removing non-alphanumeric characters. Since an empty string reads the same forward and backward, it is a palindrome.

---

### **Constraints**

- `1 <= s.length <= 2 * 10^5`
- `s` consists only of printable ASCII characters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$ where $n$ is the length of the string. We traverse the string at most once.
* **Space Complexity:** $O(1)$ if using the two-pointer approach, as we only store pointer indices.

---

### **Approach: Two Pointers**



1.  **Initialize** two pointers: `left` at the start and `right` at the end of the string.
2.  **Move** the pointers toward the center:
    * Skip characters that are not alphanumeric.
    * Compare the characters at `left` and `right` (convert to lowercase for comparison).
3.  **Return** `false` if a mismatch is found; otherwise, return `true` after the pointers meet.

---

**Topics:** `Two Pointers` | `String`
