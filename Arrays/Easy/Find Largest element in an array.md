# Find the Largest element in an array

# Brute Force:Using sorting method
```
import java.util.*;
public class tuf {
 
  public static void main(String args[]) {
 
    int arr1[] =  {2,5,1,3,0};
    System.out.println("The Largest element in the array is: " + sort(arr1));
   
    int arr2[] =  {8,10,5,7,9};
    System.out.println("The Largest element in the array is: " + sort(arr2));
  }
  static int sort(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }
}

```

Time Complexity: O(N*log(N))

Space Complexity: O(n)

# Better Approach:

 Using a max variable
->Create a max variable and initialize it with arr[0].
->Use a for loop and compare it with other elements of the array
->If any element is greater than the max value, update max value with the element’s value
Print the max variable.

```

import java.util.*;
public class tuf {
 
  public static void main(String args[]) {
 
    int arr1[] =  {2,5,1,3,0};
    System.out.println("The Largest element in the array is: "+findLargestElement(ar
    r1));
 
    int arr2[] =  {8,10,5,7,9};
    System.out.println("The Largest element in the array is: "+findLargestElement(ar
    r2));
  }
  static int findLargestElement(int arr[]) {
    int max= arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max= arr[i];
      }
    }
    return max;
  }
}

```
Time Complexity: O(N)

Space Complexity: O(1)


















 
