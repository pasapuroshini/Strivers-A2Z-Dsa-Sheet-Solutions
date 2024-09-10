# Find Number that appear once and other numbers twice
## Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

### Brute Force Approach
```
import java.util.*;
public class tUf{
public static int getSingleElement( int [] arr)
{
int n=arr.length;
for(int i=0;i<n;i++)
{
int num=arr[i];
int cnt=0;
for(int j=0;j<n;j++)
{
if(arr[j]== num)
 cnt++;
}
if(cnt==1) return num;
}
return -1;
}
public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}
```
Time complexity = $$O(n^2)$$
Space Complexity: $$O(1)$$

### Better Approach(Using Hashing)
```
import java.util.*;
public class tUf{
public static int getSingleElement( int [] arr)
{
int n=arr.length;
int maxi=arr[0];
for(int i=0;i<n;i++)
{
maxi=Math.max(maxi,arr[i]);
}

int [] hash= new int[maxi+1];
for(int i=0;i<n;i++)
{
hash[arr[i]]++;
}

 for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }
return -1;
}
public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}
```
Time Complexity: O(n)
Space complexity: O( maxElement +1)

# Hashing using map data Structure

```
import java.util.*;
public class tUf{
public static int getSingleElement( int [] arr)
{
int n=arr.length;
HashMap<Integer,Integer>mpp= new HashMap<>();
for(int i=0;i<n;i++)
{
int val= mpp.getOrDefault(arr[i],0);
mpp.put(arr[i],value+1);
}
for(Map.Entry<Integer,Integer> it: mpp.entrySet())
{
if(it.getValue()==1)
{
return it.getKey();
}
}
return -1;
}

return -1;
}
public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}
```
Time Complexity: O(N*logM) + O(M), where M = size of the map i.e. M = (N/2)+1. N = size of the array.
Space Complexity: O(M) 


### xorr approach (Optimal)

```



import java.util.*;

public class tUf {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}


```
Time Complexity: O(N)
Space Complexity: O(1) 
