# [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

## 🟢 Easy

---

### **Problem Statement**

Given two strings `s` and `t`, return `true` if `t` is an **anagram** of `s`, and `false` otherwise.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

---

### **Examples**

**Example 1:**
> **Input:** `s = "anagram", t = "nagaram"`  
> **Output:** `true`

**Example 2:**
> **Input:** `s = "rat", t = "car"`  
> **Output:** `false`

---

### **Constraints**

- $1 \le s.length, t.length \le 5 \times 10^4$
- `s` and `t` consist of lowercase English letters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the strings to count character frequencies. $n$ is the length of the strings.
* **Space Complexity:** $O(1)$  
  Since the input only contains lowercase English letters, our frequency table size is fixed at 26, which is constant space.

---

### **Approach: Frequency Counter (Hash Map / Array)**



The core idea of an anagram is that both strings must have the exact same characters with the exact same frequencies.

#### **Step-by-Step Logic:**
1.  **Length Check:** If the lengths of `s` and `t` are different, they cannot be anagrams. Return `false` immediately.
2.  **Initialize Counter:** Create an array of size 26 (for 'a' through 'z') initialized to zeros.
3.  **Count Frequencies:** Iterate through the strings:
    * For each character in `s`, increment its corresponding position in the array.
    * For each character in `t`, decrement its corresponding position in the array.
4.  **Verify:** After the loop, check the array. If all values are zero, the strings are anagrams. If any value is non-zero, it means there was a mismatch in character counts.

#### **Alternative: Sorting**
Sorting both strings ($O(n \log n)$) and comparing them is a valid $O(1)$ space solution if you are allowed to modify the input strings, but it is technically slower than the frequency counter.

---

**Topics:** `Hash Table` | `String` | `Sorting`
