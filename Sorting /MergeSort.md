# Merge Sort algorithm
It is a divide and conquer algorithm,it divides given array into equal parts and then merges the 2 sorted parts.
there are 2 main functions:
merge(): This function is used to merge 2 halves of array( sorted and merged)
mergeSort():This function divides array into 2 parts (low to mid,mid+1 to high)
assume arr[] is a 1d array,
low= arr[first index]
high= arr[last index]
mid=arr[middle index]
We recursively split the array and go from top-down until all subarrays size becomes 1.
```java
import java.util.*;
class Solution{
private static void merge(int[] arr,int low,int mid, int high)
{
ArrayList<Integer>temp= new ArrayList<>();
int left=low;
int  right=mid+1;
while(left<=mid && right<=high)
{
if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }


public static void mergeSort(int[] arr,int low,int high)
{
if(low>=high) return;
int mid=(low+high)/2;
mergeSort(arr,low,mid);
mergeSort(arr,mid+1,high);
merge(arr,low,mid,high);
}


public class Ansh{
public statuc void main(String args[])
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int[] arr= new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println();
Solution.mergeSort(arr,0,n-1);
System.out.println( "After sorting array:");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+"");
}
System.out.println();
}
}

```
Time Complexity:O(nlogn)
Space Complexity: O(n)




