# [3432. Count Partitions with Even Sum Difference](https://leetcode.com/problems/count-partitions-with-even-sum-difference/)

## 🟢 Easy

---

### **Problem Statement**

You are given an integer array `nums` of length `n`. A **partition** occurs at an index `i` ($0 \le i < n - 1$), splitting the array into two non-empty subarrays:
1. **Left subarray:** indices $[0, i]$
2. **Right subarray:** indices $[i + 1, n - 1]$

Return the number of partitions where the **difference** between the sum of the left subarray and the sum of the right subarray is **even**.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [10,10,3,7,6]`  
> **Output:** `4`  
> **Explanation:** 
> - Partition at index 0: $10 - 26 = -16$ (Even)
> - Partition at index 1: $20 - 16 = 4$ (Even)
> - Partition at index 2: $23 - 13 = 10$ (Even)
> - Partition at index 3: $30 - 6 = 24$ (Even)

**Example 2:**
> **Input:** `nums = [1,2,2]`  
> **Output:** `0`  
> **Explanation:** No partition results in an even difference.

**Example 3:**
> **Input:** `nums = [2,4,6,8]`  
> **Output:** `3`  
> **Explanation:** All 3 possible partitions result in an even difference.

---

### **Constraints**

- $2 \le n == \text{nums.length} \le 100$
- $1 \le \text{nums}[i] \le 100$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We calculate the total sum once ($O(n)$) and then iterate through the array once more to check each partition ($O(n)$).
* **Space Complexity:** $O(1)$  
  We only use a few integer variables to track the current left sum and the total sum.

---

### **Approach: Prefix Sum & Parity Logic**

The math property to remember here is: 
$$(Sum_{left} - Sum_{right}) \text{ is even } \iff (Sum_{left} \equiv Sum_{right} \pmod 2)$$

#### **The Strategy:**
1. **Calculate Total Sum:** Find the sum of all elements in the array.
2. **Iterate and Split:** Traverse the array from the first element up to the second-to-last element (since subarrays must be non-empty).
3. **Track Left Sum:** As you iterate, maintain a running `left_sum`. 
4. **Calculate Right Sum:** For any index `i`, the `right_sum` is simply `total_sum - left_sum`.
5. **Check Difference:** If `(left_sum - right_sum) % 2 == 0`, increment your count.
6. **Return Result.**

#### **A Mathematical Shortcut:**
The difference between two numbers is even if and only if their **sum** is also even. 
$$Sum_{left} - Sum_{right} \text{ is even } \iff Sum_{left} + Sum_{right} \text{ is even}$$
Since $Sum_{left} + Sum_{right}$ is just the `total_sum` of the array, this means:
- If the **total sum** is even, **every** possible partition will have an even difference.
- If the **total sum** is odd, **no** partition will ever have an even difference.

Wait, check the examples...
- Example 1: Total sum = 36 (Even). Total partitions = $n-1 = 4$. Output = 4.
- Example 2: Total sum = 5 (Odd). Output = 0.
- Example 3: Total sum = 20 (Even). Total partitions = $n-1 = 3$. Output = 3.

**Result:** The answer is always either `n - 1` (if the sum is even) or `0` (if the sum is odd).

---

**Topics:** `Array` | `Math` | `Prefix Sum`
