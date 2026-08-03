# 3014. Minimum Number of Pushes to Type Word I

**Difficulty:** Easy  
**Topics:** Math, String, Greedy  

---

## Problem Description

You are given a string `word` containing **distinct** lowercase English letters.

Telephone keypads have keys mapped with distinct collections of lowercase English letters, which can be used to form words by pushing them. For example, the key `2` is mapped with `["a","b","c"]`, we need to push the key one time to type `"a"`, two times to type `"b"`, and three times to type `"c"`.

It is allowed to remap the keys numbered `2` to `9` to distinct collections of letters. The keys can be remapped to any amount of letters, but each letter must be mapped to exactly one key. You need to find the minimum number of times the keys will be pushed to type the string `word`.

Return *the minimum number of pushes needed to type `word` after remapping the keys*.

![image](https://assets.leetcode.com/uploads/2023/12/26/keypaddesc.png)

---

## Examples

### Example 1

![example_1](https://assets.leetcode.com/uploads/2023/12/26/keypadv1e1.png)

**Input:** `word = "abcde"`  
**Output:** `5`  
**Explanation:**  
* `"a"` $\rightarrow$ one push on key 2  
* `"b"` $\rightarrow$ one push on key 3  
* `"c"` $\rightarrow$ one push on key 4  
* `"d"` $\rightarrow$ one push on key 5  
* `"e"` $\rightarrow$ one push on key 6  
Total cost is `1 + 1 + 1 + 1 + 1 = 5`.  
It can be shown that no other mapping can provide a lower cost.

### Example 2

![example_2](https://assets.leetcode.com/uploads/2023/12/26/keypadv1e2.png)

**Input:** `word = "xycdefghij"`  
**Output:** `12`  
**Explanation:**  
* `"x"` $\rightarrow$ one push on key 2  
* `"y"` $\rightarrow$ two pushes on key 2  
* `"c"` $\rightarrow$ one push on key 3  
* `"d"` $\rightarrow$ two pushes on key 3  
* `"e"` $\rightarrow$ one push on key 4  
* `"f"` $\rightarrow$ one push on key 5  
* `"g"` $\rightarrow$ one push on key 6  
* `"h"` $\rightarrow$ one push on key 7  
* `"i"` $\rightarrow$ one push on key 8  
* `"j"` $\rightarrow$ one push on key 9  
Total cost is `1 + 2 + 1 + 2 + 1 + 1 + 1 + 1 + 1 + 1 = 12`.  
It can be shown that no other mapping can provide a lower cost.

---

## Constraints

* `1 <= word.length <= 26`
* `word` consists of lowercase English letters.
* All letters in `word` are **distinct**.
