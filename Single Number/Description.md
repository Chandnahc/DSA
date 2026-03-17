# [136. Single Number](https://leetcode.com/problems/single-number/)

## 🟢 Easy

---

### **Problem Statement**

Given a **non-empty** array of integers `nums`, every element appears **twice** except for one. Find that single one.

You must implement a solution with a linear runtime complexity ($O(n)$) and use **only constant** extra space ($O(1)$).

---

### **Examples**

**Example 1:**
> **Input:** `nums = [2,2,1]`  
> **Output:** `1`

**Example 2:**
> **Input:** `nums = [4,1,2,1,2]`  
> **Output:** `4`

**Example 3:**
> **Input:** `nums = [1]`  
> **Output:** `1`

---

### **Constraints**

- `1 <= nums.length <= 3 * 10^4`
- `-3 * 10^4 <= nums[i] <= 3 * 10^4`
- Each element in the array appears twice except for one element which appears only once.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the array exactly once.
* **Space Complexity:** $O(1)$  
  We use only one integer variable to store the XOR result.

---

### **Approach: Bit Manipulation (XOR)**



The XOR ($\oplus$) operator has three specific properties that make it perfect for this problem:
1.  **Commutative:** $a \oplus b = b \oplus a$
2.  **Associative:** $a \oplus (b \oplus c) = (a \oplus b) \oplus c$
3.  **Self-Inverse:** $a \oplus a = 0$
4.  **Identity:** $a \oplus 0 = a$

#### **Logic:**
If we XOR all the numbers in the array together, the numbers that appear twice will cancel each other out ($a \oplus a = 0$). Since $0 \oplus \text{single\_number} = \text{single\_number}$, the final result will be the unique element.

**Visual Trace (Example 2):** `[4, 1, 2, 1, 2]`  
$4 \oplus 1 \oplus 2 \oplus 1 \oplus 2$  
$= 4 \oplus (1 \oplus 1) \oplus (2 \oplus 2)$  
$= 4 \oplus 0 \oplus 0$  
$= 4$

---

**Topics:** `Array` | `Bit Manipulation`
