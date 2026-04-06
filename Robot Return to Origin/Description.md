# [657. Robot Return to Origin](https://leetcode.com/problems/robot-return-to-origin/)

## 🟢 Easy

---

### **Problem Statement**

There is a robot starting at the position $(0, 0)$ on a 2D plane. Given a sequence of moves, judge if the robot ends up back at $(0, 0)$ after completing all moves.

The moves are represented by a string where:
- `'U'`: Up (increases Y-axis)
- `'D'`: Down (decreases Y-axis)
- `'L'`: Left (decreases X-axis)
- `'R'`: Right (increases X-axis)

**Return:** `true` if the robot returns to the origin, `false` otherwise.

---

### **Examples**

**Example 1:**
> **Input:** `moves = "UD"`  
> **Output:** `true`  
> **Explanation:** One step up, one step down. Net change is zero.

**Example 2:**
> **Input:** `moves = "LL"`  
> **Output:** `false`  
> **Explanation:** Two steps left. The robot is at $(-2, 0)$.

---

### **Constraints**

- $1 \le \text{moves.length} \le 2 \times 10^4$
- `moves` contains only the characters `'U'`, `'D'`, `'L'`, and `'R'`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the string `moves` exactly once.
* **Space Complexity:** $O(1)$  
  We only store two integer variables to track the coordinates.

---

### **Approach: Coordinate Simulation**



We can model the robot's position using two variables: `x` for horizontal position and `y` for vertical position.

#### **The Strategy:**
1.  **Initialize:** Set `x = 0` and `y = 0`.
2.  **Iterate:** Loop through every character in the `moves` string:
    * If move is `'U'`, increment `y`.
    * If move is `'D'`, decrement `y`.
    * If move is `'L'`, decrement `x`.
    * If move is `'R'`, increment `x`.
3.  **Check Origin:** After the loop, the robot is back at the origin if and only if both `x == 0` and `y == 0`.

#### **Optimization Tip:**
You don't actually need to track the coordinates if you just count the occurrences of each character. The robot returns to the origin if:
- `Count('U') == Count('D')`
- `Count('L') == Count('R')`

---

**Topics:** `String` | `Simulation`
