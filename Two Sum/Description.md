# [1. Two Sum](https://leetcode.com/problems/two-sum/)

## 🟢 Easy

---

### **Problem Statement**

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [2,7,11,15], target = 9`  
> **Output:** `[0,1]`  
> **Explanation:** Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

**Example 2:**
> **Input:** `nums = [3,2,4], target = 6`  
> **Output:** `[1,2]`

**Example 3:**
> **Input:** `nums = [3,3], target = 6`  
> **Output:** `[0,1]`

---

### **Constraints**

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- **Only one valid answer exists.**

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the list containing $n$ elements only once. Each lookup in the table costs only $O(1)$ time.
* **Space Complexity:** $O(n)$  
  The extra space required depends on the number of items stored in the hash table, which stores at most $n$ elements.

---

### **Approach: One-Pass Hash Table**



Instead of using nested loops to find the pair, we can use a Hash Map to store the numbers we have already seen and their corresponding indices.

1.  **Initialize** an empty Hash Map (dictionary).
2.  **Iterate** through the array using index `i` and value `num`.
3.  **Calculate Complement:** `complement = target - num`.
4.  **Check Map:** * If the `complement` exists in the map, we have found the two numbers. Return `[map[complement], i]`.
    * If the `complement` does not exist, add the current number and its index to the map: `map[num] = i`.
5.  **Return:** Since the problem guarantees one solution, the loop will always return the result.

---

**Topics:** `Array` | `Hash Table`
