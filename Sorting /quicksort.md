# QuickSort
->Divide and conquer algorithm
->Does not use extra array for sorting(uses auxiliary stack space)
-->using recursion
Approach:
pick a pivot element and place it in its correct place in sorted array.
shift smaller elements (<pivot) on left of pivot and larger ones to the right
pivot can be (first element ,last element, median ,any random element)of array


The algorithm steps are the following for the quickSort() function:
Initially, the low points to the first index and the high points to the last index(as the range is n i.e. the size of the array). 
After that, we will get the index(where the pivot should be placed after sorting) while shifting the smaller elements on the left and the larger ones on the right using a partition() function discussed later.
Now, this index can be called the partition index as it creates a partition between the left and the right unsorted subarrays.
After placing the pivot in the partition index(within the partition() function specified), we need to call the function quickSort() for the left and the right subarray recursively. So, the range of the left subarray will be [low to (partition index - 1)] and the range of the right subarray will be [(partition index + 1) to high]. 



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






