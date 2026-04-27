# [146. LRU Cache](https://leetcode.com/problems/lru-cache/)

## 🟡 Medium

---

### **Problem Statement**

Design a data structure that follows the constraints of a **Least Recently Used (LRU) cache**.

Implement the `LRUCache` class:
- `LRUCache(int capacity)`: Initialize the cache with a positive size.
- `int get(int key)`: Return the value of the key if it exists, otherwise return `-1`.
- `void put(int key, int value)`: Update the value if the key exists, or add the key-value pair. If the cache exceeds `capacity`, **evict** the least recently used key.

**Requirement:** Both `get` and `put` must run in **$O(1)$ average time complexity**.

---

### **Example Walkthrough**

**Input:** `capacity = 2`
1. `put(1, 1)`: Cache: `[1]`.
2. `put(2, 2)`: Cache: `[2, 1]` (2 is most recent).
3. `get(1)`: Returns 1. Cache: `[1, 2]` (1 becomes most recent).
4. `put(3, 3)`: Evicts key 2 (LRU). Cache: `[3, 1]`.
5. `get(2)`: Returns -1.

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$ for both `get` and `put`.  
  Hash Map provides $O(1)$ lookup, and Doubly Linked List provides $O(1)$ removal and insertion of nodes.
* **Space Complexity:** $O(\text{capacity})$  
  We store at most `capacity` number of nodes in the list and entries in the hash map.

---

### **Approach: Hash Map + Doubly Linked List**



To satisfy the $O(1)$ requirement:
1. **Hash Map:** Stores `key -> Node`. This allows us to find any element in the cache instantly.
2. **Doubly Linked List (DLL):** Stores the actual values in order of use.
    - **Head (Most Recent):** Newly added or accessed items are moved here.
    - **Tail (Least Recent):** Items at the end are the first to be evicted.

#### **The Strategy:**
- **`get(key)`:** 1. Check if the key exists in the Hash Map.
    2. If it doesn't, return `-1`.
    3. If it does, "refresh" the node: remove it from its current position in the DLL and move it to the **Head**.
- **`put(key, value)`:**
    1. If the key exists, update its value and move the node to the **Head**.
    2. If it's a new key:
        - If the cache is full, remove the node at the **Tail** and delete it from the Hash Map.
        - Create a new node, add it to the Hash Map, and insert it at the **Head**.



#### **Implementation Tip: Dummy Nodes**
Using "Dummy Head" and "Dummy Tail" nodes is a pro-tier move. It prevents you from having to check for `null` pointers whenever the list is empty or when you're removing the very last element, making your code much cleaner and less error-prone.

---

**Topics:** `Hash Table` | `Linked List` | `Design` | `Doubly-Linked List`
