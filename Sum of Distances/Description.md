# [2615. Sum of Distances](https://leetcode.com/problems/sum-of-distances/)

## 🟡 Medium

---

### **Problem Statement**

You are given an integer array `nums`. You need to create an array `arr` where `arr[i]` is the sum of $|i - j|$ for all indices $j$ such that `nums[j] == nums[i]` and $i \neq j$.

If no such $j$ exists, `arr[i] = 0`.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [1,3,1,1,2]`  
> **Output:** `[5,0,3,4,0]`  
> **Explanation:** > For `i=0` (value 1): indices are 0, 2, 3. Sum = $|0-2| + |0-3| = 5$.  
> For `i=2` (value 1): indices are 0, 2, 3. Sum = $|2-0| + |2-3| = 3$.

**Example 3:**
> **Input:** `nums = [0,5,3]`  
> **Output:** `[0,0,0]`

---

### **Constraints**

- $1 \le \text{nums.length} \le 10^5$
- $0 \le \text{nums}[i] \le 10^9$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We iterate through the array to group indices and then iterate through each group once using a prefix sum logic.
* **Space Complexity:** $O(n)$  
  To store the indices of each unique number in a Hash Map.

---

### **Approach: Prefix Sums on Indices**



Calculating distances for every pair manually is too slow. However, for a sorted list of indices $[p_0, p_1, \dots, p_k]$ belonging to the same value, we can calculate the distance sum for $p_i$ in constant time using previously computed sums.

#### **The Mathematical Trick:**
For an index $p_i$ in a sorted list of length $k$:
1.  **Left Distances:** The sum of distances to indices before $p_i$ is:  
    $(p_i - p_0) + (p_i - p_1) + \dots + (p_i - p_{i-1}) = \mathbf{(i \cdot p_i) - (\text{prefix\_sum}[i-1])}$
2.  **Right Distances:** The sum of distances to indices after $p_i$ is:  
    $(p_{i+1} - p_i) + \dots + (p_k - p_i) = \mathbf{(\text{suffix\_sum}[i+1]) - ((k - 1 - i) \cdot p_i)}$

#### **The Strategy:**
1.  **Group Indices:** Use a Hash Map to map each number to a list of its indices.
2.  **Process Each Group:** For each list of indices:
    * Calculate the **Total Sum** of all indices in that group.
    * Maintain a **Left Sum** (initially 0).
    * Iterate through the indices one by one. For the current index $p_i$ at position $i$ in the group:
        * Calculate `Left Distance Sum`: `(i * p_i) - left_sum`.
        * Calculate `Right Distance Sum`: `(total_sum - left_sum - p_i) - (count - 1 - i) * p_i`.
        * Store the total in `arr[p_i]`.
        * Add $p_i$ to `left_sum` before moving to the next index.

---

**Topics:** `Array` | `Hash Table` | `Prefix Sum`
