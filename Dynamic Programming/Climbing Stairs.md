### **Climbing Stairs (Dynamic Programming Approach)**

#### **Problem Statement**

You are given n stairs, and you can take **one or two steps** at a time. Find the number of ways to reach the top.

### **Step 1: Identify the Problem as a DP Problem**

The problem satisfies **two key properties of Dynamic Programming (DP)**:

1.  **Overlapping Subproblems** – The number of ways to reach step n depends on the ways to reach steps n-1 and n-2.
    
2.  **Optimal Substructure** – The solution to n stairs is built from solutions of n-1 and n-2.
    

Since the problem asks for the **total number of ways**, it falls under **counting problems**, which DP handles efficiently.

### **Approach 1: Recursive Approach (Brute Force)**

At any step, you have **two choices**:

*   Take **one step** → Move from n to n-1
    
*   Take **two steps** → Move from n to n-2

  
  <img width="606" alt="Screenshot 2025-02-12 at 5 52 38 PM" src="https://github.com/user-attachments/assets/889840aa-0162-48c4-a4ea-70042a01c7c1" />


#### **Time Complexity: O(2^N)** (Exponential)

*   Recursion leads to **repeated calculations** (same subproblems are solved multiple times).
    


#### **Approach 2: Memoization (Top-Down)**

We use an **array dp\[\]** to store previously computed values.



<img width="425" alt="Screenshot 2025-02-12 at 5 54 09 PM" src="https://github.com/user-attachments/assets/b51f82fb-f263-4645-97ff-6605481eac29" />


**Time Complexity: O(N)**

Reason: We are running a simple iterative loop

**Space Complexity: O(N)**

Reason: We are using an external array of size ‘n+1’.

### **Approach 3: Space Optimization**

Since dp\[i\] only depends on dp\[i-1\] and dp\[i-2\], we can store only **two previous values** instead of an entire array.


<img width="557" alt="Screenshot 2025-02-12 at 5 55 29 PM" src="https://github.com/user-attachments/assets/9aacf32a-7af6-4121-acba-ddb953b8c66d" />
