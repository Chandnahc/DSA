# [66. Plus One](https://leetcode.com/problems/plus-one/)

## 🟢 Easy

---

### **Problem Statement**

You are given a **large integer** represented as an integer array `digits`, where each `digits[i]` is the $i^{th}$ digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading `0`'s.

**Increment** the large integer by one and return the resulting array of digits.

---

### **Examples**

**Example 1:**
> **Input:** `digits = [1,2,3]`  
> **Output:** `[1,2,4]`  
> **Explanation:** The array represents the integer 123. Incrementing by one gives $123 + 1 = 124$.

**Example 2:**
> **Input:** `digits = [4,3,2,1]`  
> **Output:** `[4,3,2,2]`  
> **Explanation:** The array represents the integer 4321. Incrementing by one gives $4321 + 1 = 4322$.

**Example 3:**
> **Input:** `digits = [9]`  
> **Output:** `[1,0]`  
> **Explanation:** The array represents the integer 9. Incrementing by one gives $9 + 1 = 10$.

---

### **Constraints**

- `1 <= digits.length <= 100`
- `0 <= digits[i] <= 9`
- `digits` does not contain any leading `0`'s.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  In the worst case (e.g., `[9,9,9]`), we traverse the entire array once.
* **Space Complexity:** $O(n)$  
  Usually $O(1)$ if we modify in-place, but $O(n)$ if we need to create a new array to handle a carry that increases the number of digits (e.g., `99` becomes `100`).

---

### **Approach: Right-to-Left Traversal**



The most efficient way is to process the array from the **last element** (the least significant digit):

1.  **Iterate** from the end of the array to the beginning:
    * If the current digit is **less than 9**, just increment it by 1 and return the array immediately (no more carries).
    * If the current digit is **9**, it becomes **0**, and we continue to the next iteration (carrying over the 1).
2.  **Handle the Edge Case:** If the loop finishes and we haven't returned, it means all digits were 9 (e.g., `999`). 
    * Create a new array of size $n+1$.
    * Set the first element to **1** (the remaining carry) and the rest will be **0**.

---

**Topics:** `Array` | `Math`
