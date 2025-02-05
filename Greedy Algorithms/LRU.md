# Page fault in Least Recently Used 
[Click here](https://www.geeksforgeeks.org/problems/page-faults-in-lru5603/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=page-faults-in-lru)



<img width="640" alt="Screenshot 2025-02-05 at 11 25 41 PM" src="https://github.com/user-attachments/assets/78c608d9-c7b7-44a1-a40c-cb247444a2c6" />


**Time Complexity**:`(N logN + N) `where N is the length of the jobs array. We sort the jobs array giving complexity O(N log N) and to calculate the waiting time we iterate through the sorted array taking O(N) complexity.

**Space Complexity**: `O(1)` as the algorithm uses only a constant amount of extra space regardless of the size of the input array. It does not require any additional data structures that scale with the input size.
