
# Greedy Algorithm to find minimum number of coins
# Minimum Number of Coins

## Problem Statement
Given a value `V` and a set of available coin denominations, find the **minimum number of coins** needed to make the amount `V`.

## Approach in 5 Steps

1. **Initialize Variables:**  
   - Define an array of available coin denominations.
   - Set the target amount `V`.

2. **Sort Coins in Descending Order:**  
   Start from the largest denomination to minimize the number of coins.

3. **Pick the Largest Coin Possible:**  
   Subtract the largest possible coin from `V` while it is smaller than or equal to `V`.

4. **Continue Until `V = 0`:**  
   Repeat the process until `V` becomes zero.

5. **Return the Result:**  
   Print the total number of coins and the denominations used.
   
   <img width="354" alt="Screenshot 2025-01-30 at 4 34 58 PM" src="https://github.com/user-attachments/assets/6b40373a-ee58-4204-ad80-c96a4eae27c2" />


## Complexity Analysis
- **Time Complexity:** `O(n)` (Iterates through the coin denominations)
- **Space Complexity:** `O(n)` (Stores the list of selected coins)

## Example
```java
Input: V = 49
Output:
The minimum number of coins is 4
The coins are 20 20 5 2 2

