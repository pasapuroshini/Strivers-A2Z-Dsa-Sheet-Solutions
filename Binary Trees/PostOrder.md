# Post Order

<img width="560" alt="Screenshot 2025-02-11 at 7 07 04 PM" src="https://github.com/user-attachments/assets/428026dc-ba57-4f78-abcc-df408b30a5a3" />

**Left → Right → Root**

### **Code Breakdown**

#### **1\. TreeNode Class (Predefined in LeetCode-style format)**

*   Represents a binary tree node with:
    
    *   val → stores the integer value of the node.
        
    *   left → reference to the left child node.
        
    *   right → reference to the right child node.
        
*   Constructors are available to initialize nodes.
    

#### **2\. postorderTraversal Function**

*   This function initializes an empty ArrayList ans to store the traversal result.
    
*   Calls the recursive postorder function to perform the traversal.
    
*   Returns the final list containing the nodes in **postorder sequence**.
    

#### **3\. Recursive postorder Function**

*   **Base Case:** If the current node is null, return (terminate recursion).
    
*   **Recursive Traversal:**
    
    *   Call postorder(node.left, ans) → Traverse the left subtree.
        
    *   Call postorder(node.right, ans) → Traverse the right subtree.
        
    *   **Add the current node's value** to the list after visiting both subtrees.
