# [496. Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/)

## 🟢 Easy

---

### **Problem Statement**

The **next greater element** of an element $x$ in an array is the first element to its right that is larger than $x$.

You are given two arrays, `nums1` and `nums2`, where `nums1` is a **subset** of `nums2`. For every element in `nums1`, find its corresponding next greater element in `nums2`.

**Goal:** Return an array of the results. If no greater element exists, use `-1`.

---

### **Examples**

**Example 1:**
> **Input:** `nums1 = [4,1,2], nums2 = [1,3,4,2]`  
> **Output:** `[-1,3,-1]`  
> **Explanation:** > - For 4: No larger element to its right in `nums2`. -> `-1`
> - For 1: Next larger is 3. -> `3`
> - For 2: No larger element to its right. -> `-1`

**Example 2:**
> **Input:** `nums1 = [2,4], nums2 = [1,2,3,4]`  
> **Output:** `[3,-1]`

---

### **Constraints**

- $1 \le \text{nums1.length} \le \text{nums2.length} \le 1000$
- $0 \le \text{nums1}[i], \text{nums2}[i] \le 10^4$
- All integers in both arrays are **unique**.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n + m)$  
  We traverse `nums2` once to build the map using a stack, and then `nums1` once to retrieve results.
* **Space Complexity:** $O(m)$  
  We use a Hash Map and a Stack to store elements of `nums2`.

---

### **Approach: Monotonic Stack + Hash Map**



To avoid searching `nums2` repeatedly for every element in `nums1`, we can pre-calculate the "Next Greater" for **every** element in `nums2` using a stack.

#### **The Strategy:**
1.  **Build the Map:** Iterate through `nums2`.
    * Use a **Stack** to keep track of elements whose "next greater" hasn't been found yet.
    * While the current element is **larger** than the element at the top of the stack:
        * The current element is the "Next Greater" for the top element.
        * Pop the top element and store the pair `{element: next_greater}` in a **Hash Map**.
    * Push the current element onto the stack.
2.  **Handle Remaining Elements:** Any elements left in the stack at the end have no greater element to their right. You can map them to `-1` (or handle it as a default during lookup).
3.  **Retrieve Results:** Iterate through `nums1` and simply look up each value in your Hash Map.

#### **Why a Stack?**
The stack maintains elements in a **decreasing** order. When we see a larger number, it "resolves" all the smaller numbers currently waiting in the stack, starting from the most recent one.

---

**Topics:** `Array` | `Hash Table` | `Stack` | `Monotonic Stack`
