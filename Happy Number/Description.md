# [202. Happy Number](https://leetcode.com/problems/happy-number/)

## 🟢 Easy

---

### **Problem Statement**

Write an algorithm to determine if a number `n` is **happy**.

A **happy number** is a number defined by the following process:
1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
2. Repeat the process until the number equals 1 (where it will stay), or it **loops endlessly in a cycle** which does not include 1.
3. Those numbers for which this process ends in 1 are happy.

Return `true` if `n` is a happy number, and `false` if not.

---

### **Examples**

**Example 1:**
> **Input:** `n = 19`  
> **Output:** `true`  
> **Explanation:** > $1^2 + 9^2 = 82$  
> $8^2 + 2^2 = 68$  
> $6^2 + 8^2 = 100$  
> $1^2 + 0^2 + 0^2 = 1$

**Example 2:**
> **Input:** `n = 2`  
> **Output:** `false`  
> **Explanation:** The sequence will eventually enter a loop like `4, 16, 37, 58, 89, 145, 42, 20, 4...` and never reach 1.

---

### **Constraints**

- $1 \le n \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log n)$  
  The number of digits in a number $n$ is $\log_{10} n$. The cost of calculating the sum of squares is proportional to the number of digits.
* **Space Complexity:** $O(1)$  
  If using Floyd's Cycle-Finding algorithm. (If using a Hash Set to track seen numbers, it would be $O(\log n)$).

---

### **Approach: Floyd's Cycle-Finding Algorithm (Tortoise and Hare)**



The process of squaring digits can only result in two outcomes:
1. The sequence reaches **1**.
2. The sequence enters a **cycle** (a loop of numbers that repeats infinitely).

#### **The Logic:**
Instead of storing every number we've seen in a Hash Set, we can use two pointers:
- **Slow Pointer:** Moves one step at a time (calculates the sum of squares once).
- **Fast Pointer:** Moves two steps at a time (calculates the sum of squares twice).

If the fast pointer reaches 1, the number is **Happy**. If the fast pointer eventually meets the slow pointer at any other number, we have detected a **Cycle**, meaning the number is **not Happy**.

---

**Topics:** `Hash Table` | `Math` | `Two Pointers`
