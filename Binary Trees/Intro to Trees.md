### **Important Points on Binary Trees**

#### **1\. Introduction to Binary Trees**

*   Binary Trees allow hierarchical data organization.
    
*   Unlike linear structures (arrays, linked lists, stacks, queues), trees branch in a non-linear fashion.
    
*   Similar to a file system: root → folders → subfolders/files.
    

#### **2\. Basic Concepts**

*   **Node**: Contains data and references to child nodes.
    
*   **Root Node**: The topmost node of the tree.
    
*   **Children Nodes**: Nodes directly connected to a parent.
    
*   **Leaf Nodes**: Nodes without children (endpoints of the tree).
    
*   **Ancestors**: Nodes on the path from a given node to the root.
    

#### **3\. Types of Binary Trees**

##### **a) Full Binary Tree**

*   Every node has either **0 or 2 children**.
    
*   No node has exactly one child.
    
*   Ensures a more predictable and efficient structure.
    

##### **b) Complete Binary Tree**

*   **All levels except the last are completely filled**.
    
*   The last level is filled **from left to right**.
    
*   Used in **heaps** for efficient data access.
    

##### **c) Perfect Binary Tree**

*   **All leaf nodes are at the same level**.
    
*   **Every non-leaf node has exactly 2 children**.
    
*   Highly balanced and optimal for searching and sorting.
    

##### **d) Balanced Binary Tree**

*   Height difference between left and right subtrees of any node is **at most 1**.
    
*   Ensures a maximum tree height of **log₂(N)**, where **N** is the number of nodes.
    
*   Prevents **skewing**, maintaining efficiency.
    

##### **e) Degenerate (Skewed) Tree**

*   Nodes arranged in **a single path** (like a linked list).
    
*   Height = **N** (number of nodes), causing inefficient searches.
    
*   Occurs when insertions happen in a specific order.
    

#### **4\. Summary**

*   **Binary Trees** organize data hierarchically.
    
*   **Full Binary Trees** have nodes with 0 or 2 children.
    
*   **Complete Binary Trees** ensure left-filled structure.
    
*   **Perfect Binary Trees** have all leaves at the same level.
    
*   **Balanced Binary Trees** maintain height balance.
    
*   **Degenerate Trees** resemble linked lists, leading to inefficiency.
