# 1662. Check If Two String Arrays are Equivalent

**Difficulty:** Easy  
**Topics:** Array, String  

---

## Problem Description

Given two string arrays `word1` and `word2`, return *`true` if the two arrays represent the same string, and `false` otherwise*.

A string is represented by an array if the array elements concatenated in order forms the string.

---

## Examples

### Example 1
**Input:** `word1 = ["ab", "c"]`, `word2 = ["a", "bc"]`  
**Output:** `true`  
**Explanation:**  
* `word1` represents string `"ab" + "c" -> "abc"`
* `word2` represents string `"a" + "bc" -> "abc"`

The strings are the same, so return `true`.

### Example 2
**Input:** `word1 = ["a", "cb"]`, `word2 = ["ab", "c"]`  
**Output:** `false`

### Example 3
**Input:** `word1 = ["abc", "d", "defg"]`, `word2 = ["abcddefg"]`  
**Output:** `true`

---

## Constraints

* $1 \le \text{word1.length}, \text{word2.length} \le 10^3$
* $1 \le \text{word1}[i].\text{length}, \text{word2}[i].\text{length} \le 10^3$
* $1 \le \sum \text{word1}[i].\text{length}, \sum \text{word2}[i].\text{length} \le 10^3$
* `word1[i]` and `word2[i]` consist of lowercase letters.
