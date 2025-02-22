# Check Two Trees are identical or not.



<img width="488" alt="Screenshot 2025-02-22 at 1 45 37 PM" src="https://github.com/user-attachments/assets/158e3259-b168-4702-b1a2-68fbd14e327b" />


##### **Explanation:**

1.  **Base Case:**
    
    *   If both nodes are null, return true (both trees are empty).
        
    *   If only one node is null, return false (one tree is missing a node).
        
2.  **Recursive Check:**
    
    *   Compare the **data values** of the current nodes.
        
    *   Recursively check the **left subtrees**.
        
    *   Recursively check the **right subtrees**.
        
    *   If all three conditions are true, return true.
  


  **Complexity Analysis**

**Time Complexity: O(N+M)** where N is the number of nodes in the first Binary Tree and M is the number of nodes in the second Binary Tree. This complexity arises from visiting each node of the two binary nodes during their comparison.

**Space Complexity: O(1)** as no additional space or data structures is created that is proportional to the input size of the tree. O(H) Recursive Stack Auxiliary Space : The recursion stack space is determined by the maximum depth of the recursion, which is the height of the binary tree denoted as H. In the balanced case it is log2N and in the worst case (its N).
