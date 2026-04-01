# [292. Nim Game](https://leetcode.com/problems/nim-game/)

## 🟢 Easy

---

### **Problem Statement**

You are playing the following Nim Game with your friend:
- Initially, there is a heap of stones on the table.
- You and your friend alternate turns, and **you go first**.
- On each turn, you can remove **1 to 3 stones** from the heap.
- The person who removes the last stone is the winner.

Given `n`, the number of stones, return `true` if you can win the game assuming both players play optimally, otherwise return `false`.

---

### **Examples**

**Example 1:**
> **Input:** `n = 4`  
> **Output:** `false`  
> **Explanation:** If you take 1, 2, or 3 stones, your friend can always take the remaining stones to reach 4 and win. You are stuck in a losing position.

**Example 2:**
> **Input:** `n = 1`  
> **Output:** `true`

**Example 3:**
> **Input:** `n = 2`  
> **Output:** `true`

---

### **Constraints**

- $1 \le n \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$  
  The result is determined by a single modulo operation.
* **Space Complexity:** $O(1)$  
  No extra space is required.

---

### **Approach: Mathematical Induction (The Multiple of 4 Rule)**



To win, you want to leave your opponent with a number of stones that guarantees they cannot win on their next turn, eventually forcing them into a position where no matter what they take, you can finish the heap.

#### **The Pattern:**
1.  **$n = 1, 2, 3$:** You win immediately by taking all stones.
2.  **$n = 4$:** You lose. If you take 1, friend takes 3. If you take 2, friend takes 2. If you take 3, friend takes 1.
3.  **$n = 5, 6, 7$:** You can win by taking enough stones to leave your friend with exactly 4. 
    * If $n=5$, take 1 $\to$ Friend gets 4 (Losing position).
    * If $n=6$, take 2 $\to$ Friend gets 4.
4.  **$n = 8$:** You lose. Whatever you take (1, 2, or 3), your friend will be left with 5, 6, or 7 stones, allowing them to force you back to the 4-stone losing position.

#### **Conclusion:**
You will lose if and only if the number of stones is a **multiple of 4**. In any other case, you can always make a move that leaves your opponent with a multiple of 4.

**Condition:** `return n % 4 != 0;`

---

**Topics:** `Math` | `Brainteaser` | `Game Theory`
