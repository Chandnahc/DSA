# [190. Reverse Bits](https://leetcode.com/problems/reverse-bits/)

## 🟢 Easy

---

### **Problem Statement**

Reverse bits of a given 32 bits unsigned integer.

**Note:** In some languages, such as Java, there is no unsigned integer type. In this case, both input and output will be given as a signed integer type. They should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.

---

### **Examples**

**Example 1:**
> **Input:** `n = 00000010100101000001111010011100` (43261596)  
> **Output:** `964176192` (00111001011110000010100101000000)  
> **Explanation:** The input binary string is reversed to the output binary string.

**Example 2:**
> **Input:** `n = 11111111111111111111111111111101` (4294967293)  
> **Output:** `3221225471` (10111111111111111111111111111111)

---

### **Constraints**

- The input must be a **binary string** of length `32`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$  
  Though we iterate 32 times, since the number of bits is fixed (32), the time complexity is technically constant.
* **Space Complexity:** $O(1)$  
  We use a single integer variable to build the result.

---

### **Approach: Bit-by-Bit Shifting**



The logic is similar to reversing the digits of a decimal number, but instead of using modulo 10 and multiplying by 10, we use bitwise operators.

1.  **Initialize** a result variable `res = 0`.
2.  **Loop** 32 times (once for each bit):
    * **Shift the result** to the left by 1 (`res << 1`) to make room for the next bit.
    * **Extract the last bit** of the input `n` using the AND operator (`n & 1`).
    * **Add that bit** to the end of our result (`res | (n & 1)`).
    * **Shift the input** to the right by 1 (`n >> 1`) to prepare the next bit for processing.
3.  **Return** the result.

#### **Visualizing one step:**
If `n = 1011` and `res = 0000`:
- Step 1: `res` becomes `0001`, `n` becomes `101`
- Step 2: `res` becomes `0011`, `n` becomes `10`
- Step 3: `res` becomes `0110`, `n` becomes `1`
- Step 4: `res` becomes `1101`, `n` becomes `0`

---

**Topics:** `Divide and Conquer` | `Bit Manipulation`
