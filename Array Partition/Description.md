# [561. Array Partition](https://leetcode.com/problems/array-partition/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer array `nums` of $2n$ integers, group these integers into $n$ pairs $(a_1, b_1), (a_2, b_2), \dots, (a_n, b_n)$ such that the sum of $\min(a_i, b_i)$ for all $i$ is **maximized**.

**Goal:** Return the maximum possible sum.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [1,4,3,2]`  
> **Output:** `4`  
> **Explanation:** Optimal pairing is (1, 2) and (3, 4). $\min(1, 2) + \min(3, 4) = 1 + 3 = 4$.

**Example 2:**
> **Input:** `nums = [6,2,6,5,1,2]`  
> **Output:** `9`  
> **Explanation:** Optimal pairing is (1, 2), (2, 5), (6, 6). $\min(1, 2) + \min(2, 5) + \min(6, 6) = 1 + 2 + 6 = 9$.

---

### **Constraints**

- $1 \le n \le 10^4$
- `nums.length == 2 * n`
- $-10^4 \le \text{nums}[i] \le 10^4$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n \log n)$  
  The bottleneck is the sorting step. The subsequent pass through the array is $O(n)$.
* **Space Complexity:** $O(1)$ or $O(n)$  
  Depends on the space complexity of the sorting algorithm used by the language.

---

### **Approach: Sorting (Greedy Strategy)**

To maximize the sum, we need to pair the largest available numbers together so that the "sacrifice" (the larger number in the pair) is as small as possible.

#### **The Strategy:**
1.  **Sort the Array:** Arrange the numbers in non-decreasing order.
2.  **Pick Every Other Element:** Once sorted, the optimal pairs are adjacent elements $(nums[0], nums[1]), (nums[2], nums[3]), \dots$.
3.  **Sum the Minimums:** In every adjacent pair $(nums[i], nums[i+1])$, the minimum is always the first element ($nums[i]$).
4.  **Calculate:** Simply sum up the elements at every even index ($0, 2, 4, \dots$).

#### **Why this works:**
Consider `[1, 100, 2, 101]`. 
- If you pair `(1, 101)` and `(2, 100)`, you get $1 + 2 = 3$. You wasted both 100 and 101.
- If you pair `(1, 2)` and `(100, 101)`, you get $1 + 100 = 101$. You "sacrificed" 101, but you "saved" 100.
Sorting ensures that for every pair, the value you "lose" is the smallest possible increment over the value you "keep."

---

**Topics:** `Array` | `Greedy` | `Sorting`
