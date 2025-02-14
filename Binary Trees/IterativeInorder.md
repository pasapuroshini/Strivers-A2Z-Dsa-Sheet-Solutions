# Iterative Inorder
<img width="433" alt="Screenshot 2025-02-14 at 11 32 12 AM" src="https://github.com/user-attachments/assets/c26da2ad-a37d-4067-a8f2-a34223a27f4f" />

1.  **Time Complexity: O(N)**
    
    *   Each node in the binary tree is visited exactly once, leading to a linear time complexity of **O(N)**, where **N** is the number of nodes in the tree.
        
2.  **Space Complexity (Worst Case): O(N)**
    
    *   In the worst case (a skewed tree), the stack stores **N** nodes, leading to **O(N)** space complexity.
        
3.  **Space Complexity (Best Case - Balanced Tree): O(log N)**
    
    *   In a balanced binary tree, the height is **O(log N)**, so the maximum depth of the recursion stack is **O(log N)**.
