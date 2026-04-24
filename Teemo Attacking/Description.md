# [495. Teemo Attacking](https://leetcode.com/problems/teemo-attacking/)

## 🟢 Easy

---

### **Problem Statement**

Teemo attacks an enemy at specific times. Each attack causes a poison effect that lasts for `duration` seconds. 

- An attack at time $t$ poisons the enemy during $[t, t + \text{duration} - 1]$.
- If a new attack occurs while the enemy is still poisoned, the timer **resets**. The poison effect is extended to end exactly `duration` seconds after the latest attack.

**Goal:** Given a sorted array `timeSeries` and an integer `duration`, return the **total number of seconds** the enemy is poisoned.

---

### **Examples**

**Example 1:**
> **Input:** `timeSeries = [1,4], duration = 2`  
> **Output:** `4`  
> **Explanation:** > - Attack at 1: Poisoned at {1, 2}.
> - Attack at 4: Poisoned at {4, 5}.
> - Total: 4 seconds.

**Example 2:**
> **Input:** `timeSeries = [1,2], duration = 2`  
> **Output:** `3`  
> **Explanation:** > - Attack at 1: Poisoned at {1, 2}.
> - Attack at 2: Resets timer. Poisoned at {2, 3}.
> - Total: {1, 2, 3} = 3 seconds.

---

### **Constraints**

- $1 \le \text{timeSeries.length} \le 10^4$
- $0 \le \text{timeSeries}[i], \text{duration} \le 10^7$
- `timeSeries` is sorted in non-decreasing order.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the `timeSeries` array exactly once.
* **Space Complexity:** $O(1)$  
  We only use a single variable to accumulate the total time.

---

### **Approach: Single-Pass Comparison**



Instead of tracking every single second (which would be impossible given the $10^7$ constraints), we simply compare the gap between the current attack and the next one.

#### **The Strategy:**
1.  **Initialize:** Create a variable `totalTime = 0`.
2.  **Iterate:** Loop through the array from the first attack to the second-to-last attack ($i = 0$ to $n-2$):
    * Calculate the gap: `gap = timeSeries[i+1] - timeSeries[i]`.
    * **If gap is smaller than duration:** The poison is cut short. Add the `gap` to `totalTime`.
    * **If gap is larger or equal to duration:** The poison runs its full course. Add `duration` to `totalTime`.
3.  **Last Attack:** The final attack in the array will *always* last for the full `duration` because there is no subsequent attack to reset it. Add `duration` to `totalTime` at the end.
4.  **Return:** `totalTime`.

#### **Why this works:**
By using `min(gap, duration)`, we automatically handle both scenarios: the poison being reset early or the poison ending naturally. This is a very efficient way to handle interval merging when the intervals are added in sorted order.

---

**Topics:** `Array` | `Simulation`
