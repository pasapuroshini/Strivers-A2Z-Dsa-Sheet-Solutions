QuickSort
=========

Overview
--------

*   **Divide and conquer algorithm**
    
*   **Does not use extra array for sorting** (uses auxiliary stack space)
    
*   Uses **recursion**
    

Approach
--------

1.  Pick a **pivot** element and place it in its correct position in the sorted array.
    
2.  Shift **smaller elements (< pivot)** to the left of the pivot and **larger ones** to the right.
    
3.  The pivot can be:
    
    *   First element
        
    *   Last element
        
    *   Median
        
    *   Any random element
        

Algorithm Steps
---------------

1.  Initially, **low** points to the first index and **high** points to the last index.
    
2.  The **partition()** function finds the index where the pivot should be placed while shifting the smaller elements to the left and the larger ones to the right.
    
3.  The pivot's position is called the **partition index**, which separates the left and right subarrays.
    
4.  Recursively call **quickSort()** on:
    
    *   Left subarray → **low to (partition index - 1)**
        
    *   Right subarray → **(partition index + 1) to high**

```
import java.util.*;
class Solution{
static int partition(List<Integer> arr,int low,int high)
{

int pivot=arr.get(low);
int i=low;
int j=high;
while(i<j)
{
while(arr.get(i)<=pivot && i<=high-1){
i++;

}
while(arr.get(j)>pivot && j>=low+1)
{
j--;
}
if(i<j)
{
int temp=arr.get(i);
arr.set(i,arr.get(j));
arr.set(j,temp);
}
}

 int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }



}
static void qs(List<Integer>arr,int low,int high)
{
if(low<high)
{
int p= partition(arr,low,high);
}
qs(arr,low,p-1);
qs(arr,p+1,high);
}

}
```




<img width="681" alt="Screenshot 2025-02-01 at 12 20 03 PM" src="https://github.com/user-attachments/assets/feee9b8b-a605-42e9-8663-8c6a0e159ba0" />





