# Longest SubArray with given Sum K(positives)
Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

## Naive Approach
```
import java.util.*;
public class tUF{
public static int getLongestSubarray(int[] a,long k)
{
int n =a.length;
int len=0;
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
int s=0;
for(int k=i;k<=j;k++)
{
s+=a[k];
}
if(s==k)
 len=Math.max(len,j-i+1);
}
}
return len;
}
 public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
```
Time complexity:O(n^3)
Space Complexity :O(1)


# optimising naive approach
```
public class tUF{
public static int getLongestSubArray(int[] a,long k)
{
int n= a.length;
int len=0;
for(int i=0;i<n;i++)
{
long s=0;
for( int j=i;j<n;j++)
{
s+=a[j];
if(s==k)
  len=Math.max(len,j-i+1);
}
}
return len;
}
public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
```
Time complexity:O(n^2)
SPace Complexity:O(1)
<img width="571" alt="Screenshot 2024-09-11 at 7 09 53 PM" src="https://github.com/user-attachments/assets/e9d807e4-3f0b-483e-8b11-9b2dbe231635">

# Better Solution
```
import java.util.*;
public class tUF{
public staticint getLongestSubarray( int [] a,long k)
{
int n=a.length;
Map<Long,Integer>preSumMap= new HashMap<>();
long sum=0;
int maxLen=0;
for(int i=0;i<n;i++)
{
sum+=a[i];
if(sum==k)
{
maxLen=Math.max(maxLen,i+1);
}
long rem=sum-k;
if(preSumMap.containsKey(rem))
{
  int len= i-preSumMap.get(rem);
maxLen=Math.max(maxLen,len);
}
if(!preSumMap.containsKey(sum))
{
preSumMap.put(sum,i);
}
}
return maxLen;
}

public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}

```
Time Complexity:O(nlogn)
space complexity:O(n)

# Best Approach ( optimal 2 pointers)

```
import java.util.*;
public class Main{
public static int getLongestSubarray( int [] a,long k)
{
int n = a.length;
int left=right=0;
long sum=a[0];
int maxlen=0;
while(right<n)
{
while(left<=right && sum>k)
{
sum-=a[left];
left++;
}
if(sum==k)
{
maxlen=Math.max(maxlen,right-left+1);
}
right++;
if(right<n) sum+=a[right];
}
return maxlen;
}
public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}

```
time complexity: o(2*n)
space complexity:O(1)









