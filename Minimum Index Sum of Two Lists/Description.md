# [599. Minimum Index Sum of Two Lists](https://leetcode.com/problems/minimum-index-sum-of-two-lists/)

## 🟢 Easy

---

### **Problem Statement**

Given two arrays of strings `list1` and `list2`, find the **common strings with the least index sum**.

A **common string** is a string that appears in both lists. If a common string appears at `list1[i]` and `list2[j]`, its **index sum** is $i + j$. You need to find all common strings that share the absolute minimum index sum possible.

Return the result in **any order**.

---

### **Examples**

**Example 1:**
> **Input:** `list1 = ["Shogun","Tapioca Express","Burger King","KFC"]`, `list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]`  
> **Output:** `["Shogun"]`  
> **Explanation:** The only common string is "Shogun" with index sum $0 + 3 = 3$.

**Example 2:**
> **Input:** `list1 = ["Shogun","Tapioca Express","Burger King","KFC"]`, `list2 = ["KFC","Shogun","Burger King"]`  
> **Output:** `["Shogun"]`  
> **Explanation:** Common strings are "KFC" ($3+0=3$), "Shogun" ($0+1=1$), and "Burger King" ($2+2=4$). The minimum sum is $1$.

**Example 3:**
> **Input:** `list1 = ["happy","sad","good"]`, `list2 = ["sad","happy","good"]`  
> **Output:** `["sad","happy"]`  
> **Explanation:** "happy" sum is $0+1=1$, "sad" sum is $1+0=1$. Both are minimum.

---

### **Constraints**

- $1 \le \text{list1.length, list2.length} \le 1000$
- $1 \le \text{list1[i].length, list2[i].length} \le 30$
- Strings consist of spaces and English letters.
- All strings in `list1` are **unique**.
- All strings in `list2` are **unique**.
- There is at least one common string.

---

### **Complexity Analysis**

* **Time Complexity:** $O(L1 + L2)$  
  Where $L1$ and $L2$ are the lengths of the two lists. We traverse `list1` to build a hash map and then traverse `list2` once.
* **Space Complexity:** $O(L1 \times \text{avg\_string\_length})$  
  We store all elements of `list1` in a hash map to allow $O(1)$ lookups.

---

### **Approach: Hash Map Lookup**

To find the minimum index sum efficiently, we use a hash map to avoid nested loops.

#### **1. Map the First List**
Store every string in `list1` as a key in a hash map, with its index as the value:  
`{ "Shogun": 0, "Tapioca Express": 1, ... }`

#### **2. Iterate Through the Second List**
Traverse `list2` and for each string:
- Check if it exists in the hash map.
- If it does, calculate the current index sum: `sum = map[string] + current_index`.
- Compare this `sum` to the `min_sum` found so far:
    - **If `sum < min_sum`**: We found a new better minimum. Clear the result list, add the current string, and update `min_sum`.
    - **If `sum == min_sum`**: Add the current string to the result list.
    - **If `sum > min_sum`**: Ignore it.

---

**Topics:** `Array` | `Hash Table` | `String`
