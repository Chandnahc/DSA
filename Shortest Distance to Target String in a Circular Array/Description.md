# [2515. Shortest Distance to Target String in a Circular Array](https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/)

## 🟢 Easy

---

### **Problem Statement**

You are given a **0-indexed circular** string array `words` and a string `target`. You start at `startIndex`. 

In a circular array, the "next" element after the last one is the first one, and the "previous" element before the first one is the last one. You can move one step at a time to the left or right.

**Goal:** Return the **shortest distance** to reach the `target`. If `target` does not exist in `words`, return `-1`.

---

### **Examples**

**Example 1:**
> **Input:** `words = ["hello","i","am","leetcode","hello"], target = "hello", startIndex = 1`  
> **Output:** `1`  
> **Explanation:** Starting at index 1 ('i'), the closest "hello" is at index 0, which is just 1 step to the left.

**Example 2:**
> **Input:** `words = ["a","b","leetcode"], target = "leetcode", startIndex = 0`  
> **Output:** `1`  
> **Explanation:** From index 0, moving left once wraps around to index 2, where "leetcode" is located.

---

### **Constraints**

- $1 \le words.length \le 100$
- $0 \le startIndex < words.length$
- `target` may or may not exist in the array.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the array once to find all matches of the target string.
* **Space Complexity:** $O(1)$  
  We only store the minimum distance found so far.

---

### **Approach: Circular Distance Calculation**



In a circular array of length $n$, the distance between two indices $i$ and $j$ can be measured in two directions:
1.  **Linear Distance:** $d_{linear} = abs(i - j)$
2.  **Wrap-around Distance:** $d_{wrap} = n - abs(i - j)$

The shortest distance between those two points is simply $\min(d_{linear}, d_{wrap})$.

#### **The Strategy:**
1.  **Initialize:** Let `ans = n` (or any value larger than the max possible distance).
2.  **Iterate:** Loop through every index `i` from `0` to `n - 1`:
    * If `words[i] == target`:
        * Calculate linear distance: `dist = abs(i - startIndex)`.
        * Update `ans = min(ans, dist, n - dist)`.
3.  **Check Result:** If `ans` was never updated, the target was never found. Return `-1`. Otherwise, return `ans`.

#### **Why $n - dist$?**
If you have 5 elements and you are at index 1 trying to get to index 4, the linear distance is $4 - 1 = 3$. The circular path (going the "other way" through the wrap-around) is $5 - 3 = 2$. By checking both, you always find the shortcut.

---

**Topics:** `Array` | `String`
