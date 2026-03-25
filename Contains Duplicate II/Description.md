# [219. Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer array `nums` and an integer `k`, return `true` if there are two **distinct indices** `i` and `j` in the array such that `nums[i] == nums[j]` and `abs(i - j) <= k`.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [1,2,3,1], k = 3`  
> **Output:** `true`  
> **Explanation:** `nums[0] == nums[3]` and `abs(0 - 3) <= 3`.

**Example 2:**
> **Input:** `nums = [1,0,1,1], k = 1`  
> **Output:** `true`  
> **Explanation:** `nums[2] == nums[3]` and `abs(2 - 3) <= 1`.

**Example 3:**
> **Input:** `nums = [1,2,3,1,2,3], k = 2`  
> **Output:** `false`  
> **Explanation:** While there are duplicates, the distance between any two identical numbers is at least 3.

---

### **Constraints**

- $1 \le \text{nums.length} \le 10^5$
- $-10^9 \le \text{nums}[i] \le 10^9$
- $0 \le k \le 10^5$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the array once. Hash map operations (insert/lookup) are $O(1)$ on average.
* **Space Complexity:** $O(\min(n, k))$  
  In the sliding window approach, the set only stores at most $k$ elements. In the hash map approach, it could store up to $n$ elements.

---

### **Approach: Sliding Window with Hash Set**



A very efficient way to visualize this is as a **sliding window** of size $k$. We only care about duplicates that exist within the current window of length $k$.

1.  **Initialize** an empty Hash Set.
2.  **Iterate** through the array using index `i`:
    * **Check:** If `nums[i]` is already in the set, we found a duplicate within distance $k$. Return `true`.
    * **Add:** Add `nums[i]` to the set.
    * **Maintain Window:** If the size of the set exceeds $k$, remove the element that is now "out of range" (`nums[i - k]`).
3.  **Result:** If the loop finishes, return `false`.

#### **Alternative: Hash Map (Value -> Index)**
You can also use a Hash Map to store the **most recent index** of each value. When you encounter a value that is already in the map, check if `current_index - last_index <= k`. If so, return `true`; otherwise, update the map with the new index.

---

**Topics:** `Array` | `Hash Table` | `Sliding Window`
