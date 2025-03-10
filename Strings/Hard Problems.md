

# Minimum Add to make Parameters Valid

(Click Here)[https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/]

### **Understanding the Problem**

We need to determine the **minimum number of moves** required to make a given **parentheses string** s valid. A **valid parentheses string** satisfies:

1.  It is **empty**.
    
2.  It can be written as AB, where A and B are both valid.
    
3.  It can be written as (A), where A is valid.
    

A **move** consists of inserting either '(' or ')' at any position in s.

### **Observations**

A string is valid if:

*   Every opening parenthesis '(' has a corresponding closing parenthesis ')'.
    
*   At any point while traversing the string, the number of closing parentheses should not exceed the number of opening parentheses.
    

### **Approach**

We will use a **stack simulation** approach to track unmatched parentheses:

1.  **Use a counter (open\_needed)** to track how many **( are missing** (we need extra ( to balance excess )).
    
2.  **Use another counter (close\_needed)** to track how many **) are missing** (we need extra ) to balance excess ().
    

#### **Steps**

1.  Initialize open\_needed = 0 (tracks unmatched () and close\_needed = 0 (tracks unmatched )).
    
2.  Iterate through the string:
    
    *   If we encounter '(', increment close\_needed (we expect a ) to match it).
        
    *   If we encounter ')':
        
        *   If close\_needed > 0, decrement it (since we found a matching )).
            
        *   Otherwise, increment open\_needed (indicating a missing ( for this )).
            
3.  The answer is open\_needed + close\_needed (total insertions required).






<img width="686" alt="Screenshot 2025-03-10 at 3 35 41 PM" src="https://github.com/user-attachments/assets/1d64df9d-f17f-49d8-9eac-7770207c9ef9" />



### **Time & Space Complexity**

*   **Time Complexity:** O(n)^2 → We iterate through the string once.
    
*   **Space Complexity:** O(1)→ We use only two counters (open, close).
