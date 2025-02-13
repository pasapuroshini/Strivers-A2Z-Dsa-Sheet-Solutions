# Majority Element 

## Brute Force Approach:
### **Approach:**

1.  Iterate through the array and check if the element is already in the answer list.
    
2.  Count the occurrences of the element in the array.
    
3.  If its frequency is greater than n/3, add it to the list.
    
4.  Stop once the list contains two elements since there can be at most two majority elements.


<img width="547" alt="Screenshot 2025-02-13 at 6 28 08 PM" src="https://github.com/user-attachments/assets/f1650716-f8c7-48cb-b889-20d5a1e51775" />

**Time Complexity:** O(N^2), where N = size of the given array.**Reason:** For every element of the array the inner loop runs for N times. And there are N elements in the array. So, the total time complexity is O(N2).

**Space Complexity:** O(1) as we are using a list that stores a maximum of 2 elements. The space used is so small that it can be considered constant.


### Better Approach:

*   **Use HashMap for Frequency Count:**
    
      Store the count of each element in a HashMap.
        
*   **Determine Majority Threshold:**
    
       Any element appearing more than n/3 times qualifies as a majority element.
        
*   **Add Majority Elements to Result:**
    
       If an element reaches the threshold, add it to the result list.
        
*   **Stop Early if Needed:**
    
       Since there can be at most **two majority elements**, stop once the list has two elements.
    


    <img width="612" alt="Screenshot 2025-02-13 at 6 32 07 PM" src="https://github.com/user-attachments/assets/bafb9146-ff45-4b91-a10c-3c5bd9f24e4a" />




    **Space Complexity:** O(N) as we are using a map data structure

**Time Complexity:** O(N\*logN), where N = size of the given array.logN time is to insert in  an hashmap.



#### Extended Boyer Moore Voting Algorithm

<img width="575" alt="Screenshot 2025-02-13 at 6 33 37 PM" src="https://github.com/user-attachments/assets/50057785-8e91-4b67-8706-cceba690715b" />














1.  **Use Extended Boyer-Moore Voting Algorithm:**
    
    *   Maintain two potential candidates (el1, el2) and their respective counts (cnt1, cnt2).
        
2.  **First Pass - Find Potential Candidates:**
    
    *   Traverse the array and update candidates and counts using voting principles.
        
3.  **Second Pass - Validate Candidates:**
    
    *   Count actual occurrences of el1 and el2 to confirm they appear more than n/3 times.
        
4.  **Return Valid Majority Elements:**
    
    *   Add the validated candidates to the result list and return it.











<img width="483" alt="Screenshot 2025-02-13 at 6 35 18 PM" src="https://github.com/user-attachments/assets/2c488527-7b9d-4741-8633-2344cf3c0e4d" />







**Time Complexity:** O(N) + O(N), where N = size of the given array.**Reason:** The first O(N) is to calculate the counts and find the expected majority elements. The second one is to check if the calculated elements are the majority ones or not.

**Space Complexity:** O(1) as we are only using a list that stores a maximum of 2 elements. The space used is so small that it can be considered constant.
