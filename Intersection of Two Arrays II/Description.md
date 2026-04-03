# [350. Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)

## 🟢 Easy

---

### **Problem Statement**

Given two integer arrays `nums1` and `nums2`, return an array of their **intersection**. 

**Requirements:**
- Each element in the result must appear as many times as it shows in **both** arrays.
- You may return the result in **any order**.

---

### **Examples**

**Example 1:**
> **Input:** `nums1 = [1,2,2,1], nums2 = [2,2]`  
> **Output:** `[2,2]`

**Example 2:**
> **Input:** `nums1 = [4,9,5], nums2 = [9,4,9,8,4]`  
> **Output:** `[4,9]`  
> **Explanation:** `[9,4]` is also accepted.

---

### **Constraints**

- $1 \le nums1.length, nums2.length \le 1000$
- $0 \le nums1[i], nums2[i] \le 1000$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n + m)$  
  Where $n$ and $m$ are the lengths of the two arrays. We iterate through `nums1` to build a frequency map and then through `nums2` to find matches.
* **Space Complexity:** $O(\min(n, m))$  
  We store the frequency counts of the smaller array in a Hash Map to save space.

---

### **Approach: Hash Map (Frequency Counter)**



To account for duplicates, we need to know exactly how many "coupons" we have for each number in the first array before we "spend" them while looking at the second array.

#### **The Strategy:**
1.  **Count Frequencies:** Iterate through `nums1` (preferably the smaller array) and store the count of each element in a Hash Map.
2.  **Find Matches:** Iterate through `nums2`. For every element:
    * Check if it exists in the Hash Map with a count greater than 0.
    * If it does, add the element to your result list and **decrement** its count in the Hash Map.
3.  **Return:** Convert the result list into an array.

#### **Alternative: Sorting + Two Pointers**
If the arrays are already sorted, or if space is at a premium, you can use two pointers:
- If `nums1[i] == nums2[j]`, add to result and increment both pointers.
- If `nums1[i] < nums2[j]`, increment `i`.
- If `nums1[i] > nums2[j]`, increment `j`.
This approach takes $O(1)$ extra space (excluding the result array).

---

**Topics:** `Array` | `Hash Table` | `Two Pointers` | `Binary Search` | `Sorting`
