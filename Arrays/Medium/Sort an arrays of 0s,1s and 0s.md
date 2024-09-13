# Sort an arrays of 0s,1s and 0s
Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)
 ## Better Approach:
 ```
import java.util.*;
public class Main{
public static void sortArray(ArrayList<Integer> arr,int n)
{
int cnt0=0,cnt1=0,cnt2=0;
for(int i=0;i<n;i++)
{
if(arr.get(i)==0) cnt0++;
else if(arr.get(i)==1)cnt1++;
else cnt2++;
}
for( int i=0;i<cnt0;i++)
{
arr.set(i,0);
}
for(int i=cnt0;i+cnt0+cnt1;i++)
{
arr.set(i,1);
}
for(int i=cnt0+cnt1;i<n;i++)
{
arr.set(i,2);
}
}
```
Time Complexity: O(N) + O(N), where N = size of the array. First O(N) for counting the number of 0’s, 1’s, 2’s, and second O(N) for placing them correctly in the original array.

Space Complexity: O(1) as we are not using any extra space.

### Optimal Approach (Dutch National flag Algorithm)



<img width="440" alt="Screenshot 2024-09-13 at 6 58 04 PM" src="https://github.com/user-attachments/assets/b94cfaeb-3bc4-4899-898d-cdf6bae574e7">

<img width="308" alt="Screenshot 2024-09-13 at 6 58 11 PM" src="https://github.com/user-attachments/assets/f742cbb0-9bf7-4a32-bc6d-4d8551aa90a1">



<img width="325" alt="Screenshot 2024-09-13 at 6 58 42 PM" src="https://github.com/user-attachments/assets/da539e88-9a73-418c-96b4-5c7bb27fae6c">


```
public class  Main{
public static void sortArray(ArrayList<Integer>arr,int n)
{
int low=0,mid=0,high=n-1;
while(mid<=high)
{
if(arr.get(mid)==0)
{
int temp=arr.get(low);
arr.set(low,arr.get(mid));
arr.set(mid,temp);
low++;
mid++;
}
else if(arr.get(mid)==1)
{
mid++;
}
else
{
int temp=arr.get(mid);
arr.set(mid,arr.set(high));
arr.set(high,temp);
high--;
}
}
}





```
Time Complexity: O(N), where N = size of the given array.
Reason: We are using a single loop that can run at most N times.

Space Complexity: O(1) as we are not using any extra space.









