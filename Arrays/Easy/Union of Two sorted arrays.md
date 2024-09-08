# Union of two sorted Arrays  

# Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.

we are not using hash map or hash set here because we require elements of the union to be in ascending order, using them is not preferable.

## Using map
Using Hashmap we count frequency of the each element and aa unique elements and common elements in the arraylist.
```
public class Solution{
static ArrayList<Integer>findUnion(int arr1[], int arr2[], int n,int m)
{
HashMap<Integer,Integer> freq= new HashMap<>();
ArrayList<Integer> Union = new ArrayList<>();
for(int i=0;i<n;i++)
{
freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
}
for(int i=0;i<m;i++)
{
freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
}
for( int it:freq.keySet())
{
Union.add(it);
}
return Union;
}
}
```
Time complexity : Inserting a key in the map takes,logN times
So , Time complexity will be $$O(m+n)log(m+n))
Space Complexity:
O(m+n){If Space of Union ArrayList is considered} 

## Using Set
```
public class Solution{
static ArrayList<Integer>findUnion(int arr1[], int arr2[], int n,int m)
{
HashSet<Integer> s= new HashMap<>();
ArrayList<Integer> Union = new ArrayList<>();
for(int i=0;i<n;i++)
{
s.add(arr1[i]);
}
for(int i=0;i<m;i++)
{
s.add(arr2[i];
}
for( int it:s)
{
Union.add(it);

return Union;
}
}
```
Space Complexity : O(m+n) {If Space of Union ArrayList is considered} 
Time Compleixty : O( (m+n)log(m+n) ) . I

## Two pointers
Solution 1 and 2 work for the unsorted arrays also, The arrays arr1 and arr2 are sorted, can we use this property to reduce the time Complexity?
Using the property that the arrays are sorted we can bring down the time complexity from O((m+n)log(m+n))    TO    O(m+n).

```
import java.util.*;
class Solution{
static ArrayList<Integer> FindUnion(int[] arr1,int[] arr2, int n,int m)
{
int i=j=0;
ArrayList<Integer>Union=new ArrayList<>();
while(i<n && j<m)
{
if(arr1[i]<=arr2[j])
{
if(Union.size()==0 ||Union.get(Union.size()-1)!=arr1[i])
Union.add(arr[i]);
i++;
}
else
{
if(Union.size()==0 || Union.get(Union.size()-1)!=arr2[j])
Union.add(arr2[j]);
      j++;
}
}
while (i < n) // IF any element left in arr1
  {
    if (Union.get(Union.size()-1) != arr1[i])
      Union.add(arr1[i]);
    i++;
  }
  while (j < m) // If any elements left in arr2
  {
    if (Union.get(Union.size()-1) != arr2[j])
      Union.add(arr2[j]);
    j++;
  }
  return Union;
}
```
Time Complexity: O(m+n)
Space Complexity : O(m+n) {If Space of Union ArrayList is considered}























