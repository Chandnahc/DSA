# [345. Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)

## 🟢 Easy

---

### **Problem Statement**

Given a string `s`, reverse only all the vowels in the string and return it.

The vowels are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`, and they can appear in both lower and upper cases, more than once.

---

### **Examples**

**Example 1:**
> **Input:** `s = "IceCreAm"`  
> **Output:** `"AceCreIm"`  
> **Explanation:** The vowels in `s` are `['I', 'e', 'e', 'A']`. Reversing them gives `['A', 'e', 'e', 'I']`.

**Example 2:**
> **Input:** `s = "leetcode"`  
> **Output:** `"leotcede"`

---

### **Constraints**

- $1 \le s.length \le 3 \times 10^5$
- `s` consists of printable ASCII characters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the string once with two pointers. Even though we have nested `while` loops to skip consonants, each character is visited at most once.
* **Space Complexity:** $O(n)$  
  In many languages (like Java or Python), strings are immutable, so we must convert the string into a character array or list to perform the swaps.

---

### **Approach: Two Pointers with Conditional Skipping**



We use a "converging" two-pointer approach, similar to reversing a whole string, but we only "stop" and swap when both pointers find a vowel.

#### **The Strategy:**
1.  **Define Vowels:** Create a set or string containing all vowels (`aeiouAEIOU`) for $O(1)$ lookup.
2.  **Initialize Pointers:** `left = 0`, `right = s.length - 1`.
3.  **Iterate:** While `left < right`:
    * **Move Left:** While `left < right` and `s[left]` is **not** a vowel, increment `left`.
    * **Move Right:** While `left < right` and `s[right]` is **not** a vowel, decrement `right`.
    * **Swap:** Once both pointers are at vowels, swap `s[left]` and `s[right]`.
    * **Advance:** Increment `left` and decrement `right` to continue searching.
4.  **Return:** Convert the character array back into a string and return.

#### **Key Detail:**
The inner `while` loops must also include the `left < right` condition to prevent the pointers from crossing each other or going out of bounds while searching for the next vowel.

---

**Topics:** `Two Pointers` | `String`
