# [412. Fizz Buzz](https://leetcode.com/problems/fizz-buzz/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer `n`, return a string array `answer` (1-indexed) where:
- `answer[i] == "FizzBuzz"` if `i` is divisible by **3 and 5**.
- `answer[i] == "Fizz"` if `i` is divisible by **3**.
- `answer[i] == "Buzz"` if `i` is divisible by **5**.
- `answer[i] == i` (as a string) if none of the above conditions are true.

---

### **Examples**

**Example 1:**
> **Input:** `n = 3`  
> **Output:** `["1","2","Fizz"]`

**Example 2:**
> **Input:** `n = 5`  
> **Output:** `["1","2","Fizz","4","Buzz"]`

**Example 3:**
> **Input:** `n = 15`  
> **Output:** `["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]`

---

### **Constraints**

- $1 \le n \le 10^4$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through every number from $1$ to $n$ exactly once.
* **Space Complexity:** $O(1)$  
  (Excluding the output array). We only use a few temporary string variables during the iteration.

---

### **Approach: Conditional Simulation**



The most common way to solve this is through a simple loop with `if-else` statements. The order of the checks is the most important part of the logic.

#### **The Strategy:**
1.  **Initialize:** Create an empty list or array to store $n$ strings.
2.  **Iterate:** Loop from $i = 1$ to $n$:
    * **Check 15 (3 and 5):** Always check for divisibility by both first. If $i \pmod 3 == 0$ and $i \pmod 5 == 0$, add `"FizzBuzz"`.
    * **Check 3:** Else if $i \pmod 3 == 0$, add `"Fizz"`.
    * **Check 5:** Else if $i \pmod 5 == 0$, add `"Buzz"`.
    * **Fallback:** Otherwise, add the string representation of the number itself (`str(i)` or `String.valueOf(i)`).
3.  **Return:** The completed list.

#### **Alternative: String Concatenation (Scalable)**
If the problem had many more conditions (e.g., "7 is Jazz", "11 is Bazz"), the `if-else` chain would become messy. Instead, you can build a string:
- If divisible by 3, append "Fizz".
- If divisible by 5, append "Buzz".
- If the string is still empty, append the number.
This avoids checking $i \pmod{15}$ explicitly.

---

**Topics:** `Math` | `String` | `Simulation`
