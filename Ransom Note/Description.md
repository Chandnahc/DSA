# [383. Ransom Note](https://leetcode.com/problems/ransom-note/)

## 🟢 Easy

---

### **Problem Statement**

Given two strings `ransomNote` and `magazine`, return `true` if `ransomNote` can be constructed by using the letters from `magazine` and `false` otherwise.

Each letter in `magazine` can only be used **once** in `ransomNote`.

---

### **Examples**

**Example 1:**
> **Input:** `ransomNote = "a", magazine = "b"`  
> **Output:** `false`

**Example 2:**
> **Input:** `ransomNote = "aa", magazine = "ab"`  
> **Output:** `false`  
> **Explanation:** The magazine only has one 'a', but the note requires two.

**Example 3:**
> **Input:** `ransomNote = "aa", magazine = "aab"`  
> **Output:** `true`

---

### **Constraints**

- $1 \le \text{ransomNote.length, magazine.length} \le 10^5$
- `ransomNote` and `magazine` consist of lowercase English letters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(m)$  
  Where $m$ is the length of the `magazine`. We iterate through the magazine to count characters and then through the ransom note to validate.
* **Space Complexity:** $O(1)$  
  Since the input only contains lowercase English letters, a frequency array of size 26 is used, which is constant space regardless of input size.

---

### **Approach: Frequency Array (Hash Map)**



To determine if we have enough "ink" in the magazine to write the note, we need to keep track of the availability of each character.

#### **The Strategy:**
1.  **Count Magazine Letters:** Create an integer array of size 26 (to represent 'a' through 'z'). Iterate through `magazine` and increment the count for each character found.
2.  **Validate Ransom Note:** Iterate through `ransomNote`. For each character:
    * Decrement its count in the frequency array.
    * **Check Availability:** If the count drops below zero, it means the `magazine` did not have enough of that specific character. Return `false`.
3.  **Result:** If you finish iterating through the `ransomNote` without any counts going negative, return `true`.

#### **Why not use two Hash Maps?**
While you could count both and compare, doing it in a single array and "consuming" the counts as you go is more memory-efficient and allows for an **early exit** the moment a character is missing.

---

**Topics:** `Hash Table` | `String` | `Counting`
