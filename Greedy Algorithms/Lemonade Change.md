# Lemonade Change Problem

## Problem Statement
Given a queue of customers with `$5`, `$10`, or `$20` bills, determine if we can provide correct change while serving each customer in order.

## Approach in 5 Steps

1. **Initialize Counters:**  
   Maintain two counters, `five` and `ten`, to track the number of `$5` and `$10` bills available.

2. **Iterate Through Customers:**  
   Process each customer's bill sequentially.

3. **Handle Different Bills:**  
   - If the bill is `$5`, increase the `five` counter.  
   - If the bill is `$10`, give `$5` change if available, then increase `ten`.  
   - If the bill is `$20`, prioritize giving one `$10` and one `$5` if possible; otherwise, give three `$5` bills.

4. **Check Change Availability:**  
   If at any point the required change cannot be given, return `false`.

5. **Return Final Result:**  
   If all customers are served correctly, return `true`.


<img width="341" alt="Screenshot 2025-01-30 at 4 31 51 PM" src="https://github.com/user-attachments/assets/4b06839b-5dc4-4db4-8c3a-9a36bd931a03" />












## Complexity Analysis
- **Time Complexity:** `O(n)` (Iterate through the list once)
- **Space Complexity:** `O(1)` (Only two integer variables are used)

## Example
```java
Input: [5, 5, 5, 10, 20]
Output: true
```





