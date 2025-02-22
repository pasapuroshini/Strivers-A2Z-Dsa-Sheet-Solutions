# Count Inversions

## Brute Force:


<img width="516" alt="Screenshot 2025-02-22 at 2 20 11 PM" src="https://github.com/user-attachments/assets/723e288e-1293-4f5c-aa84-f86788889c19" />


**Time Complexity:** O(N2), where N = size of the given array.**Reason:** We are using nested loops here and those two loops roughly run for N times.

**Space Complexity:** O(1) as we are not using any extra space to solve this problem.



## Optimal Approach:

**Application of Merge Sort**


<img width="356" alt="Screenshot 2025-02-22 at 2 21 24 PM" src="https://github.com/user-attachments/assets/f67db2f5-90ef-4f2e-92d7-ebe99f8a8259" />


**Time Complexity:** O(N\*logN), where N = size of the given array.**Reason:** We are not changing the merge sort algorithm except by adding a variable to it. So, the time complexity is as same as the merge sort.

**Space Complexity:** O(N), as in the merge sort We use a temporary array to store elements in sorted order.
