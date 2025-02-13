# Iterative Preorder using Stack in   Binary tree

<img width="427" alt="Screenshot 2025-02-13 at 7 25 55 PM" src="https://github.com/user-attachments/assets/f2f182e8-7009-407c-836f-86d9f117ed64" />


1.Check if the tree is empty; if not, initialize a stack and push the root.

2.Iteratively process nodes: pop a node, add its value to the result, then push its right and left children (in that order).

3.Return the list of node values collected in preorder.

****Time Complexity: O(N) where N is the number of nodes in the binary tree. Every node of the binary tree is visited exactly once, and for each node, , the operations performed (pushing and popping from the stack, accessing node values, etc.) are constant time operations.****
**Space Complexity: O(N) where N is the number of nodes in the binary tree. This is because the stack can potentially hold all nodes in the tree when dealing with a skewed tree (all nodes have only one child), consuming space proportional to the number of nodes.**
