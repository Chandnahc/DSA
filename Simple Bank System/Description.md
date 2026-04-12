# [2043. Simple Bank System](https://leetcode.com/problems/simple-bank-system/)

## 🟡 Medium

---

### **Problem Statement**

Implement a `Bank` class that automates transactions for $n$ accounts numbered from $1$ to $n$. You need to support three types of transactions: **Transfer**, **Deposit**, and **Withdraw**.

**A transaction is valid ONLY if:**
1. The account number(s) exist (between $1$ and $n$).
2. For withdrawals and transfers, the source account has enough money.

---

### **Operations to Implement**

* `Bank(long[] balance)`: Initializes the bank with the given account balances.
* `boolean transfer(int account1, int account2, long money)`: Moves money from `account1` to `account2`.
* `boolean deposit(int account, long money)`: Adds money to the specified `account`.
* `boolean withdraw(int account, long money)`: Removes money from the specified `account`.

---

### **Complexity Analysis**

* **Time Complexity:** * **Initialization:** $O(n)$ to store the initial balances.
    * **Transactions:** $O(1)$ per operation. Each check and update is a direct array access.
* **Space Complexity:** $O(n)$ to store the balances of $n$ accounts.

---

### **Approach: Array-Based State Management**



Since the accounts are numbered $1$ to $n$, the most efficient storage is a **0-indexed array** where `account x` is stored at `balance[x - 1]`.

#### **The Strategy:**
1.  **Validation Helper:** Create a private method `isValid(int account)` to check if the account number is between $1$ and $n$. This keeps your code DRY (Don't Repeat Yourself).
2.  **Deposit Logic:** * Check if the account is valid.
    * If yes, add money and return `true`. Else, return `false`.
3.  **Withdraw Logic:** * Check if the account is valid AND if `balance[account-1] >= money`.
    * If both are true, subtract money and return `true`. Else, return `false`.
4.  **Transfer Logic:**
    * Check if **both** accounts are valid.
    * Check if `account1` has enough balance.
    * If all checks pass, subtract from `account1` and add to `account2`. Return `true`.

#### **Implementation Tip:**
Always perform **all** checks before modifying any data. In the `transfer` method, if you withdraw money from `account1` before checking if `account2` is valid, you might accidentally lose money if the second check fails!

---

**Topics:** `Array` | `Hash Table` | `Design` | `Simulation`
