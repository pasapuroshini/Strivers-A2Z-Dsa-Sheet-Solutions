# Maximum Path Sum



<img width="517" alt="Screenshot 2025-02-22 at 1 36 54 PM" src="https://github.com/user-attachments/assets/10fdac0d-8a0a-430b-b194-74d50fc0c697" />

You're wondering why we update maxi\[0\] and **still return another value**. Let me explain step by step in a **simple way**.

**Breaking It Down Simply**
---------------------------

We have two tasks:

1️⃣ **Find the maximum path sum passing through each node** and update maxi\[0\] globally.

2️⃣ **Return the max single-path sum** to its parent node for further calculations.


<img width="539" alt="Screenshot 2025-02-22 at 1 38 39 PM" src="https://github.com/user-attachments/assets/951e1329-698b-4674-b063-8debda3386ea" />


### **What Each Part Does**

🔹 maxi\[0\] **stores the global maximum path sum seen so far** across the entire tree.

🔹 returnValue **is what we return to the parent node** (either left or right path sum + current node).


**Complexity Analysis**

**Time Complexity: O(N)** where N is the number of nodes in the Binary Tree. This complexity arises from visiting each node exactly once during the recursive traversal.

**Space Complexity: O(1)** as no additional space or data structures is created that is proportional to the input size of the tree. O(H) Recursive Stack Auxiliary Space : The recursion stack space is determined by the maximum depth of the recursion, which is the height of the binary tree denoted as H. In the balanced case it is log2N and in the worst case its N.
