# [283. Move Zeroes](https://leetcode.com/problems/move-zeroes/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Note:** You must do this **in-place** without making a copy of the array.

---

### **Examples**

**Example 1:**
> **Input:** `nums = [0,1,0,3,12]`  
> **Output:** `[1,3,12,0,0]`

**Example 2:**
> **Input:** `nums = [0]`  
> **Output:** `[0]`

---

### **Constraints**

- $1 \le \text{nums.length} \le 10^4$
- $-2^{31} \le \text{nums}[i] \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the array once. Each element is visited at most twice (once by the fast pointer, once by the slow pointer).
* **Space Complexity:** $O(1)$  
  No extra space is used as we modify the input array directly.

---

### **Approach: Two-Pointer (Read/Write Heads)**



To solve this efficiently, we maintain two pointers: one to track the current element we are inspecting (`fast`) and one to track the position where the next non-zero element should be placed (`slow`).

#### **The Strategy:**
1.  **Initialize:** Set `slow = 0`.
2.  **Iterate:** Use a `fast` pointer to loop through the array from `0` to `n-1`.
3.  **Find Non-Zeroes:** Whenever `nums[fast]` is **not** zero:
    * **Swap:** Swap `nums[slow]` with `nums[fast]`.
    * **Advance:** Increment `slow`.
4.  **Result:** By the time `fast` reaches the end, all non-zero elements have been "pushed" to the front in their original order, and all zeroes are naturally shifted to the back.

#### **Why Swap?**
While you could just overwrite `nums[slow]` with `nums[fast]` and then fill the remainder with zeroes at the end, **swapping** is often preferred in interviews because it handles the "move" in a single pass and is slightly more elegant.

---

**Topics:** `Array` | `Two Pointers`
