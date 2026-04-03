# [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)

## 🟢 Easy

---

### **Problem Statement**

Given two integer arrays `nums1` and `nums2`, return an array of their **intersection**. 

**Requirements:**
- Each element in the result must be **unique**.
- You may return the result in **any order**.

---

### **Examples**

**Example 1:**
> **Input:** `nums1 = [1,2,2,1], nums2 = [2,2]`  
> **Output:** `[2]`

**Example 2:**
> **Input:** `nums1 = [4,9,5], nums2 = [9,4,9,8,4]`  
> **Output:** `[9,4]`  
> **Explanation:** `[4,9]` is also accepted.

---

### **Constraints**

- $1 \le nums1.length, nums2.length \le 1000$
- $0 \le nums1[i], nums2[i] \le 1000$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n + m)$  
  Where $n$ and $m$ are the lengths of the two arrays. We iterate through `nums1` to build a set and then through `nums2` to check for intersections.
* **Space Complexity:** $O(min(n, m))$  
  In the worst case, we store the smaller array in a Hash Set.

---

### **Approach: Hash Set (Optimal for Uniqueness)**



Using a Hash Set is the most straightforward way to handle the "unique elements" requirement while maintaining linear time complexity.

#### **The Strategy:**
1.  **Create a Set:** Convert the first array (`nums1`) into a Hash Set. This automatically removes duplicates and allows for $O(1)$ average time complexity lookups.
2.  **Find Intersections:** Create a second set (or a list) to store the result. Iterate through the second array (`nums2`).
3.  **Check and Store:** For each element in `nums2`, check if it exists in the first set. If it does, add it to the result set.
4.  **Return:** Convert the result set back into an array.

#### **Alternative: Two Pointers (If Sorted)**
If the arrays were already sorted, you could use two pointers to find the intersection in $O(1)$ extra space (excluding the result). You would move the pointer of the smaller element forward and only add to the result when `nums1[i] == nums2[j]`, taking care to skip duplicates.

---

**Topics:** `Array` | `Hash Table` | `Two Pointers` | `Binary Search` | `Sorting`
