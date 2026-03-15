# [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

## 🟡 Medium

---

### **Problem Statement**

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the $i^{th}$ line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the **maximum amount of water** a container can store.

**Notice:** You may not slant the container.

---

### **Example 1**

![Container With Most Water Visualization](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)

> **Input:** `height = [1,8,6,2,5,4,8,3,7]`  
> **Output:** `49`  
> **Explanation:** The vertical lines are represented by the array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water the container can contain is 49 (between index 1 and index 8).

### **Example 2**

> **Input:** `height = [1,1]`  
> **Output:** `1`

---

### **Constraints**

- `n == height.length`
- `2 <= n <= 10^5`
- `0 <= height[i] <= 10^4`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We use a single pass with two pointers, moving from the outside in.
* **Space Complexity:** $O(1)$  
  We only use a few variables to track the pointers and the maximum area.

---

### **Approach: Two Pointers (Greedy Strategy)**

The area of the container is always limited by the **shorter line**:  
$$\text{Area} = \text{distance between lines} \times \min(\text{height1}, \text{height2})$$

1.  **Initialize** two pointers: `left` at the beginning (0) and `right` at the end (`n - 1`).
2.  **Calculate Area:** In each step, calculate the area formed by the two pointers and update the `maxArea` if the current area is larger.
3.  **Move the Pointers:** * To find a potentially larger area, we must move the pointer pointing to the **shorter line**. 
    * Moving the pointer of the longer line wouldn't help because the area is bottlenecked by the shorter one, and the width is already decreasing.
4.  **Repeat** until the `left` and `right` pointers meet.

---

**Topics:** `Array` | `Two Pointers` | `Greedy`
