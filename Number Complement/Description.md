# [476. Number Complement](https://leetcode.com/problems/number-complement/)

## 🟢 Easy

---

### **Problem Statement**

The **complement** of an integer is the integer you get when you flip all the `0`'s to `1`'s and all the `1`'s to `0`'s in its binary representation.

**Note:** The complement is calculated based on the number's binary representation without leading zeros.

---

### **Examples**

**Example 1:**
> **Input:** `num = 5`  
> **Output:** `2`  
> **Explanation:** 5 in binary is `101`. Flipping the bits gives `010`, which is 2.

**Example 2:**
> **Input:** `num = 1`  
> **Output:** `0`  
> **Explanation:** 1 in binary is `1`. Flipping it gives `0`.

---

### **Constraints**

- $1 \le num < 2^{31}$

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$  
  Since the input is a 32-bit integer, finding the bit length or creating a mask takes at most 31 iterations, which is a constant time operation.
* **Space Complexity:** $O(1)$  
  We only use a few integer variables.

---

### **Approach: The Bitmask XOR**



To flip bits without affecting leading zeros, we need a **mask**. A mask is a number of the same bit-length as `num`, consisting entirely of `1`s.

#### **The Strategy:**
1.  **Find the bit length:** Determine how many bits are required to represent `num`. 
    * For `5` (`101`), the length is 3.
2.  **Create the Mask:** Generate a number with that many `1`s. 
    * For a length of 3, the mask is `111` (which is 7).
    * *Formula:* If length is $L$, the mask is $(1 \ll L) - 1$.
3.  **XOR to Flip:** Perform `num ^ mask`.
    * `101 ^ 111 = 010` (which is 2).

#### **Why not use standard NOT (`~`)?**
If you apply `~5` in a 32-bit system:
- `5` is `000...000101`
- `~5` becomes `111...111010`
This results in a very large (or negative) number because all those leading zeros turned into ones. Using a mask ensures we only "touch" the relevant bits.

---

**Topics:** `Bit Manipulation`
