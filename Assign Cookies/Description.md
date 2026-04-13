# [455. Assign Cookies](https://leetcode.com/problems/assign-cookies/)

## 🟢 Easy

---

### **Problem Statement**

Assume you are an awesome parent wanting to give your children cookies. Each child $i$ has a **greed factor** $g[i]$, which is the minimum cookie size they will be content with. Each cookie $j$ has a **size** $s[j]$.

A child is content if $s[j] \ge g[i]$. Each child can receive at most one cookie. Your goal is to **maximize the number of content children**.

---

### **Examples**

**Example 1:**
> **Input:** `g = [1,2,3], s = [1,1]`  
> **Output:** `1`  
> **Explanation:** You have two cookies of size 1. Only the child with greed factor 1 can be satisfied.

**Example 2:**
> **Input:** `g = [1,2], s = [1,2,3]`  
> **Output:** `2`  
> **Explanation:** You can satisfy the child with greed factor 1 using the cookie of size 1, and the child with greed factor 2 using the cookie of size 2 or 3.

---

### **Constraints**

- $1 \le g.length \le 3 \times 10^4$
- $0 \le s.length \le 3 \times 10^4$
- $1 \le g[i], s[j] \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n \log n + m \log m)$  
  Where $n$ is the number of children and $m$ is the number of cookies. This is dominated by the time taken to sort both arrays.
* **Space Complexity:** $O(1)$ or $O(\log n + \log m)$  
  Depending on the implementation of the sorting algorithm used by the language.

---

### **Approach: Greedy + Two Pointers**



To maximize the number of content children, we should satisfy the children with the smallest greed factors first using the smallest possible cookies that meet their requirements.

#### **The Strategy:**
1.  **Sort:** Sort both the greed factors array `g` and the cookie sizes array `s` in ascending order.
2.  **Initialize:** Create two pointers: `child_i = 0` and `cookie_j = 0`.
3.  **Iterate:** While you still have children to satisfy and cookies to give:
    * If the current cookie is large enough for the current child (`s[cookie_j] >= g[child_i]`):
        * The child is content! Move to the next child (`child_i++`).
    * Regardless of whether the child was satisfied, move to the next cookie (`cookie_j++`) because the current cookie is either used up or too small for any subsequent (greedier) children.
4.  **Result:** The value of `child_i` represents the total number of content children.

#### **Why this works:**
Sorting allows us to make locally optimal decisions. By using the smallest effective cookie for the least greedy child, we preserve larger cookies for potentially greedier children later in the arrays.

---

**Topics:** `Array` | `Greedy` | `Two Pointers` | `Sorting`
