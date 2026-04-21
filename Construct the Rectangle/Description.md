# [492. Construct the Rectangle](https://leetcode.com/problems/construct-the-rectangle/)

## 🟢 Easy

---

### **Problem Statement**

A web developer needs to design a rectangular page area. Given a specific `area`, you must determine a length `L` and a width `W` that satisfy these three requirements:

1. The area must be exactly equal to the target: $L \times W = \text{area}$.
2. The length must be greater than or equal to the width: $L \ge W$.
3. The difference between $L$ and $W$ should be as **small as possible**.

**Return:** An array `[L, W]`.

---

### **Examples**

**Example 1:**
> **Input:** `area = 4`  
> **Output:** `[2, 2]`  
> **Explanation:** Possible pairs are [4,1] and [2,2]. [2,2] has a smaller difference.

**Example 2:**
> **Input:** `area = 37`  
> **Output:** `[37, 1]`

**Example 3:**
> **Input:** `area = 122122`  
> **Output:** `[427, 286]`

---

### **Constraints**

- $1 \le \text{area} \le 10^7$

---

### **Complexity Analysis**

* **Time Complexity:** $O(\sqrt{\text{area}})$  
  In the worst case (a prime number), we iterate from the square root down to 1.
* **Space Complexity:** $O(1)$  
  We only use a few integer variables.

---

### **Approach: Square Root Search**

The "closest" factors of any number $N$ are found near $\sqrt{N}$. If we find a width $W$ that is a factor of the area and is less than or equal to $\sqrt{\text{area}}$, the corresponding $L$ will naturally be $\ge W$.

#### **The Strategy:**
1.  **Start at the Root:** Calculate the integer square root of the area: $W = \lfloor\sqrt{\text{area}}\rfloor$.
2.  **Step Downwards:** While `area % W != 0`:
    * Decrement $W$ by 1.
    * Since we started at the square root and are moving down, the first $W$ we find that divides the area evenly will automatically minimize the difference $L - W$.
3.  **Calculate Length:** $L = \text{area} / W$.
4.  **Return:** `[L, W]`.



#### **Why this works:**
As $W$ gets smaller, the gap between $W$ and $L$ gets larger. By starting $W$ at the largest possible value ($\sqrt{\text{area}}$) and moving down, we guarantee that the very first divisor we hit is the one that keeps $L$ and $W$ as close as possible.

---

**Topics:** `Math`
