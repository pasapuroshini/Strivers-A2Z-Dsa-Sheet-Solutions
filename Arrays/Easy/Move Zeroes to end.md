
# Move all Zeroes to the end
## Brute force approach
->involves the use of extra array
Suppose, there are N-X zeros and X non-zero elements in the array. We will first copy those X non-zero elements from the original array to a temporary array. 
Then, we will copy the elements from the temporary array one by one and fill the first X places of the original array. 
The last N-X places of the original array will be then filled with zero. Now, our task is completed.

``` java
public class tuF{
public static int[] moveZeroes(int n,int[] a)
{
ArrayList<Integer>temp=new ArrayList<>();
for(int i=0;i<n;i++)
{
if(a[i]!=0)
{
temp.add(a[i]);
}
int ns= temp.size();
for(int i=0;i<ns;i++)
{
a[i]=temp.get(i);
}

for(int i=ns;i<n;i++)
{
a[i]=0;
}
return a;
}
}
```


time complexity: O(2* N)
space complexity: O(N)



## Optimal approach

![image](https://github.com/user-attachments/assets/83163a7b-3f83-4275-9abb-a7f8e8617e82)
```



import java.util.*;

public class tUf {
    public static int[] moveZeros(int n, int []a) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}



```
Time Complexity: O(N), N = size of the array.
Space Complexity: O(1)














