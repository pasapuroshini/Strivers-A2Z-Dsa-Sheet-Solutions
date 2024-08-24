# Insertion Sort Algorithm
Select an element in each iteration from unsorted array(using a loop)
Place it in its corresponding position in sorted part and shift the remaining elements accordingly
theinner loop basically shifts the elements using swapping.

```java
import java.util.*;
public class Main{
static void insertionsort( int[] arr,int n)
{
for(int i=0;i<=n-1;i++)
{
int j=i;
while( j>0 && arr[j-1]>arr[j])
{
int temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
j--;
}
}
  System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionsort(arr, n);
    }

}
```
Time complexity:O(n^2)
Space Complexity:O(1);
