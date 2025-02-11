
# Pre Order

<img width="671" alt="Screenshot 2025-02-11 at 7 03 37 PM" src="https://github.com/user-attachments/assets/2000094e-d708-45a5-b1cf-74bd1c7b4de8" />

**Root → Left → Right**

#### **Steps in the Code:**

1.  **TreeNode Class (Predefined in LeetCode-style format)**
    
    *   Represents a binary tree node with attributes:
        
        *   val (integer value)
            
        *   left (left child node)
            
        *   right (right child node)
            
    *   Constructors are provided to initialize nodes.
        
2.  **Recursive Preorder Traversal (preorder function)**
    
    *   **Base Case:** If the current node is null, return (end recursion).
        
    *   **Process the Root:** Add the value of the current node to the list.
        
    *   **Traverse Left Subtree:** Recursively call preorder(root.left, li).
        
    *   **Traverse Right Subtree:** Recursively call preorder(root.right, li).
        
3.  **Wrapper Function (preorderTraversal)**
    
    *   Initializes an empty list li to store traversal results.
        
    *   Calls the preorder function to perform traversal.
        
    *   Returns the final list of visited node values.
        

### **Time and Space Complexity Analysis:**

#### **Time Complexity:**

*   **O(N)**, where N is the number of nodes in the binary tree.
    
*   Each node is **visited exactly once**, so the number of operations is proportional to the number of nodes.
    

#### **Space Complexity:**

*   **Best Case (Balanced Tree - O(log N))**:
    
    *   The recursive call stack stores O(log N) function calls in a balanced tree (height log N).
        
*   **Worst Case (Skewed Tree - O(N))**:
    
    *   In the worst case (a completely skewed tree), the recursive calls can go up to O(N), leading to O(N) space complexity due to the recursion stack.
        
*   **Auxiliary Space:** The list storing the traversal result also takes **O(N)** extra space.
