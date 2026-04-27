# [460. LFU Cache](https://leetcode.com/problems/lfu-cache/)

## 🔴 Hard

---

### **Problem Statement**

Design and implement a data structure for a **Least Frequently Used (LFU)** cache.

**Operations:**
- `get(key)`: Get the value if the key exists, increment its use counter.
- `put(key, value)`: Update/insert the value and increment its use counter.
- **Eviction Policy:** When the cache is full, remove the key with the **lowest frequency**. If there is a tie (multiple keys with the same lowest frequency), remove the **Least Recently Used (LRU)** key among them.

**Constraint:** `get` and `put` must both run in **$O(1)$** average time complexity.

---

### **Example Walkthrough**

**Input:** `capacity = 2`
1. `put(1, 1)`, `put(2, 2)`: Both keys have `freq = 1`.
2. `get(1)`: Key 1 now has `freq = 2`.
3. `put(3, 3)`: Lowest frequency is 1. Key 2 is the only one with `freq = 1`. **Evict 2**.
4. `get(3)`: Key 3 now has `freq = 2`.
5. `put(4, 4)`: Keys 1 and 3 both have `freq = 2`. Key 1 was used less recently than 3. **Evict 1**.

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$ for both `get` and `put`.  
  By using a combination of Hash Maps and Doubly Linked Lists, we avoid any $O(N)$ or $O(\log N)$ searching.
* **Space Complexity:** $O(\text{capacity})$  
  We store each key-value pair in a node, mapped by multiple pointers and hash tables.

---

### **Approach: Double Hash Map + Doubly Linked Lists**



To maintain $O(1)$ access and $O(1)$ frequency updates, we use:
1. **`key_map`**: Maps `key -> Node`. This gives us instant access to the data and its current frequency.
2. **`freq_map`**: Maps `frequency -> Doubly Linked List`. Every node with the same frequency lives in the same list. 
3. **`min_freq`**: An integer tracking the current lowest frequency in the entire cache to know where to evict from.

#### **The Strategy:**
- **`get(key)` / Updating a Key:**
    1. Find the node in `key_map`.
    2. Remove the node from its current `freq_map[f]` list.
    3. If that list becomes empty and `f == min_freq`, increment `min_freq`.
    4. Move the node to the `freq_map[f + 1]` list (at the head to maintain LRU order within that frequency).
- **`put(key, value)`:**
    1. If the key exists, update the value and call the "update frequency" logic above.
    2. If it's a new key:
        - If at capacity, go to `freq_map[min_freq]`, remove the **tail** node (the LRU element of the LFU group), and delete it from `key_map`.
        - Add the new node to `key_map` and `freq_map[1]`.
        - Set `min_freq = 1`.



#### **Key Intuition:**
Each frequency bucket is essentially its own mini-LRU cache. When an element's frequency increases, it "graduates" from one LRU list to the next one up. This structure allows us to find the least frequent items instantly via `min_freq` and the oldest item within that group via the tail of the list.

---

**Topics:** `Hash Table` | `Linked List` | `Design` | `Doubly-Linked List`
