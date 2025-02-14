# Iterative Post Order using 2 stack


<img width="448" alt="Screenshot 2025-02-14 at 11 39 19 AM" src="https://github.com/user-attachments/assets/5d50f0f7-7502-4b77-9b39-581271793ec7" />

1.  **Initialization:**
    
    *   Two stacks (st1 and st2) are used.
        
    *   A postOrder list stores the final traversal result.
        
    *   If the tree is empty (root == null), return an empty list.
        
2.  **First Stack Processing (st1):**
    
    *   Push the root node into st1.
        
    *   Pop nodes from st1, push them into st2, and push their **left child first, then right child** into st1.
        
    *   This ensures that when reversed, the nodes are processed in **left-right-root** order.
        
3.  **Second Stack Processing (st2):**
    
    *   Pop nodes from st2 and store their values in postOrder.
        
    *   This reversal ensures correct postorder traversal (Left → Right → Root).
        
4.  **Time Complexity:**
    
    *   Each node is pushed and popped exactly twice → **O(N)**.
        
5.  **Space Complexity:**
    
    *   Uses two stacks → **O(N)** in the worst case (skewed tree).
