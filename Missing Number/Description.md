# [268. Missing Number](https://leetcode.com/problems/missing-number/)

## 🟢 Easy

---

### **Problem Statement**

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [3,0,1]`  
> **Output:** `2`  
> **Explanation:** $n = 3$ since there are 3 numbers. The range is `[0,3]`. The missing number is 2.

**Example 2:**
> **Input:** `nums = [0,1]`  
> **Output:** `2`  
> **Explanation:** $n = 2$. The range is `[0,2]`. The missing number is 2.

**Example 3:**
> **Input:** `nums = [9,6,4,2,3,5,7,0,1]`  
> **Output:** `8`

---

### **Constraints**

- $n == \text{nums.length}$
- $1 \le n \le 10^4$
- $0 \le \text{nums}[i] \le n$
- All the numbers of `nums` are **unique**.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the array once to calculate the sum or perform XOR operations.
* **Space Complexity:** $O(1)$  
  We only use a single variable to store the result, regardless of the input size.

---

### **Approach 1: Gauss's Summation Formula (Mathematical)**

The sum of the first $n$ natural numbers is given by the formula:
$$\text{Expected Sum} = \frac{n \times (n + 1)}{2}$$

1.  **Calculate** what the sum *should* be using the formula above.
2.  **Calculate** the actual sum of the elements currently in the array.
3.  **Subtract** the actual sum from the expected sum. The difference is your missing number.

### **Approach 2: Bit Manipulation (XOR)**



This approach leverages the property that $x \oplus x = 0$ and $x \oplus 0 = x$.

1.  **Initialize** a variable `res = n`.
2.  **Iterate** through the array and XOR each index and its corresponding value: `res ^= i ^ nums[i]`.
3.  **Result:** Every number that is present will appear twice (once as an index and once as a value) and cancel itself out. The missing number will only appear once (as an index) and remain in `res`.

---

**Topics:** `Array` | `Hash Table` | `Math` | `Binary Search` | `Bit Manipulation` | `Sorting`
