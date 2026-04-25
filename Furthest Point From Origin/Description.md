# [2833. Furthest Point From Origin](https://leetcode.com/problems/furthest-point-from-origin/)

## 🟢 Easy

---

### **Problem Statement**

You are given a string `moves` consisting of 'L', 'R', and '_'. You start at position `0` on a number line.
- 'L': Move 1 unit left (-1).
- 'R': Move 1 unit right (+1).
- '_': Move either 1 unit left **or** 1 unit right.

**Goal:** Return the **maximum absolute distance** from the origin you can reach after performing all $n$ moves.

---

### **Examples**

**Example 1:**
> **Input:** `moves = "L_RL__R"`  
> **Output:** `3`  
> **Explanation:** We have 2 'L's, 2 'R's, and 3 '_'s. By treating all '_' as 'L', we get 5 'L's and 2 'R's. Final position: -3. Absolute distance: 3.

**Example 2:**
> **Input:** `moves = "_R__LL_"`  
> **Output:** `5`

---

### **Constraints**

- $1 \le \text{moves.length} \le 50$
- `moves` consists only of 'L', 'R', and '_'.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We perform a single pass to count the occurrences of each character.
* **Space Complexity:** $O(1)$  
  We only store three integer counters.

---

### **Approach: Greedy Maximization**



To reach the furthest point, you want to be as far left or as far right as possible. The underscores should always "help" the direction that already has the most moves.

#### **The Strategy:**
1.  **Count frequencies:** Count the number of 'L's, 'R's, and '_' (blanks).
2.  **Calculate Net Displacement:** * Find the difference between 'L' and 'R': `abs(countL - countR)`. 
    * This represents your "fixed" distance from the origin after the 'L's and 'R's cancel each other out.
3.  **Add the Wildcards:** Since underscores can go in either direction, simply add the count of underscores to your fixed distance. 
    * `Result = abs(countL - countR) + count_blanks`.
4.  **Return:** The result.

#### **Why this works:**
Imagine you have 5 'L's and 2 'R's. You are currently at -3. You have 10 underscores.
- If you turn the underscores into 'L's, you move 10 more units left (Total: -13, Distance: 13).
- If you turn them into 'R's, you move 10 units right (Total: +7, Distance: 7).
To maximize the distance, you always pick the direction that aligns with the existing majority.

---

**Topics:** `Array` | `Counting` | `String`
