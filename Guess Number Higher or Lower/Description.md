# [374. Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/)

## 🟢 Easy

---

### **Problem Statement**

We are playing the Guess Game. The game is as follows:
1. I pick a number from `1` to `n`. 
2. You have to guess which number I picked.
3. Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API `int guess(int num)`, which returns three possible results:
- `-1`: Your guess is higher than the number I picked (`num > pick`).
- `1`: Your guess is lower than the number I picked (`num < pick`).
- `0`: Your guess is equal to the number I picked (`num == pick`).

**Goal:** Return the number that was picked.

---

### **Examples**

**Example 1:**
> **Input:** `n = 10, pick = 6`  
> **Output:** `6`

**Example 2:**
> **Input:** `n = 1, pick = 1`  
> **Output:** `1`

---

### **Constraints**

- $1 \le n \le 2^{31} - 1$
- $1 \le \text{pick} \le n$

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log n)$  
  Standard binary search complexity, as we reduce the search range by half in each iteration.
* **Space Complexity:** $O(1)$  
  We only use a few variables to maintain the search boundaries.

---

### **Approach: Binary Search**



Since the numbers are in a contiguous sorted range from $1$ to $n$, binary search is the optimal way to find the "target" (the picked number).

#### **The Strategy:**
1.  **Initialize Pointers:** Set `low = 1` and `high = n`.
2.  **Loop:** While `low <= high`:
    * Calculate the middle point: `mid = low + (high - low) / 2`.
    * **Call the API:** `result = guess(mid)`.
    * **Analyze Result:**
        * If `result == 0`: You found it! Return `mid`.
        * If `result == -1`: Your guess was too high. Move the upper bound: `high = mid - 1`.
        * If `result == 1`: Your guess was too low. Move the lower bound: `low = mid + 1`.

#### **Implementation Detail:**
Always use `mid = low + (high - low) / 2` instead of `(low + high) / 2`. Given the constraint $n \le 2^{31} - 1$, adding `low` and `high` together could easily cause an **integer overflow** in languages like Java or C++.

---

**Topics:** `Binary Search` | `Interactive`
