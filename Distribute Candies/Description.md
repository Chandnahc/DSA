# [575. Distribute Candies](https://leetcode.com/problems/distribute-candies/)

## 🟢 Easy

---

### **Problem Statement**

Alice has $n$ candies, where the $i^{th}$ candy is of type `candyType[i]`. Alice's doctor advised her to only eat **$n / 2$** of the candies she has ($n$ is always even). 

Alice wants to eat the **maximum number of different types** of candies while still following the doctor's advice.

**Goal:** Given the integer array `candyType`, return the maximum number of different types of candies she can eat.

---

### **Examples**

**Example 1:**
> **Input:** `candyType = [1,1,2,2,3,3]`  
> **Output:** `3`  
> **Explanation:** Alice can eat $6 / 2 = 3$ candies. There are 3 types ($1, 2, 3$). She can eat one of each.

**Example 2:**
> **Input:** `candyType = [1,1,2,3]`  
> **Output:** `2`  
> **Explanation:** Alice can eat $4 / 2 = 2$ candies. Even though there are 3 types ($1, 2, 3$), she is limited by the doctor's limit of 2.

**Example 3:**
> **Input:** `candyType = [6,6,6,6]`  
> **Output:** `1`  
> **Explanation:** Alice can eat $4 / 2 = 2$ candies. However, she only has 1 type of candy available.

---

### **Constraints**

- $n == \text{candyType.length}$
- $2 \le n \le 10^4$
- $n$ is even.
- $-10^5 \le \text{candyType}[i] \le 10^5$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We need to iterate through the array once to count the unique types (usually by inserting them into a Hash Set).
* **Space Complexity:** $O(n)$  
  In the worst case, every candy is a unique type, requiring $O(n)$ space in our Set.

---

### **Approach: Greedy Logic with Hash Set**

The maximum number of types Alice can eat is limited by two values:
1.  **The Variety Limit:** The total number of unique candy types available.
2.  **The Stomach Limit:** $n / 2$.

#### **The Strategy:**
1.  **Find Unique Types:** Use a **Set** data structure to store the `candyType` values. Since Sets do not allow duplicates, the size of the set will give us the number of unique types.
2.  **Compare:** 
    * If the number of unique types is *greater* than $n/2$, she can only eat $n/2$ types (limited by the doctor).
    * If the number of unique types is *less* than $n/2$, she can eat all the unique types she has (limited by variety).
3.  **Result:** Return $\min(\text{unique types}, n / 2)$.



#### **The "One-Liner" (Python):**
```python
return min(len(set(candyType)), len(candyType) // 2)
