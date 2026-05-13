# [605. Can Place Flowers](https://leetcode.com/problems/can-place-flowers/)

## 🟢 Easy

---

### **Problem Statement**

You have a long flowerbed in which some of the plots are planted (`1`) and some are not (`0`). Flowers cannot be planted in **adjacent** plots.

Given an integer array `flowerbed` and an integer `n`, return `true` if `n` new flowers can be planted without violating the no-adjacent-flowers rule, and `false` otherwise.

---

### **Examples**

**Example 1:**
> **Input:** `flowerbed = [1,0,0,0,1]`, `n = 1`  
> **Output:** `true`  
> **Explanation:** You can plant one flower at index 2.

**Example 2:**
> **Input:** `flowerbed = [1,0,0,0,1]`, `n = 2`  
> **Output:** `false`  
> **Explanation:** Only one flower can be planted without violating the rule.

---

### **Constraints**

- $1 \le \text{flowerbed.length} \le 2 \times 10^4$
- `flowerbed[i]` is `0` or `1`.
- There are no two adjacent flowers in the initial `flowerbed`.
- $0 \le n \le \text{flowerbed.length}$

---

### **Complexity Analysis**

* **Time Complexity:** $O(m)$  
  Where $m$ is the length of the flowerbed. We traverse the array once.
* **Space Complexity:** $O(1)$  
  We perform the check in-place without using extra data structures.

---

### **Approach: Greedy Linear Scan**

The most efficient way to solve this is to iterate through the flowerbed and plant a flower whenever we encounter a valid spot. A spot is valid if:
1. The current plot is empty (`0`).
2. The previous plot is empty or it is the start of the bed.
3. The next plot is empty or it is the end of the bed.

#### **Implementation Steps**
1. Iterate through the `flowerbed` array.
2. For each element, check if it is `0`.
3. Check the left neighbor: `(i == 0 || flowerbed[i-1] == 0)`.
4. Check the right neighbor: `(i == flowerbed.length - 1 || flowerbed[i+1] == 0)`.
5. If all conditions are met:
   - "Plant" a flower by setting `flowerbed[i] = 1`.
   - Decrement `n`.
6. If `n` reaches 0 at any point, return `true`.
7. After the loop, return `n <= 0`.

---

**Topics:** `Array` | `Greedy`
