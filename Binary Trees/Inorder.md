# Inorder Traversal


<img width="702" alt="Screenshot 2025-02-11 at 6 58 48 PM" src="https://github.com/user-attachments/assets/9198027e-5468-45c4-acca-c0e14c5000c4" />


### Approach Explanation:

1.  **Tree Representation:**
    
    *   The binary tree is created using a Node class with data, left, and right attributes.
        
    *   Nodes are initialized using the constructor, which assigns values and sets left and right children to null.
        
2.  **Inorder Traversal (Left → Root → Right):**
    
    *   The inorder function is recursively called for the left subtree.
        
    *   The current node’s value is added to the list.
        
    *   The function is recursively called for the right subtree.
        
3.  **Function to Trigger Traversal:**
    
    *   inOrder(root) initializes an empty list and calls inorder(root, list).
        
    *   The final list containing inorder traversal values is returned.
        
4.  **Main Method Execution:**
    
    *   A sample binary tree is created.
        
    *   The inOrder function is called to retrieve the traversal result.
        
    *   The result is printed to the console.
        

This approach ensures that the tree is traversed in the correct order recursively, following the **Left → Root → Right** pattern.

## Time complexity : $$O(n)$$
## Space Complexity : $$O(n)$$
