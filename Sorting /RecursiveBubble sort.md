# Recursive Bubble Sort Algorithm
```
public class Java{
public void bubblesort(int [] array, int n)
{
if(n==1)
 return ;
for(int i=0;i<n-1;i++)
{
if(array[j]>array[j+1])
{
int temp=array[j];
array[j]=array[j+1];
array[j+1]=temp;
}
}
bubblesort( array,n-1);
}
 public static void main(String[] args) {
        int[] array = {13, 46, 24, 52, 20, 9};
        int n = array.length;

        System.out.println("Before Bubble Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        bubbleSort(array, n);

        System.out.println("After Bubble Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
}
}
```
TIME COMPLEXITY; O(N^2)
SPACE COMPLEXITY:O(N)



OPTIMISED CODE:
```
public class Java{
public void bubblesort(int [] array, int n)
{
if(n==1)
 return ;
int swap=0;
for(int i=0;i<n-2;i++)
{
if(array[j]>array[j+1])
{
int temp=array[j];
array[j]=array[j+1];
array[j+1]=temp;
swap=1;
}
}
if(swap==0) return;
bubblesort( array,n-1);
}
 public static void main(String[] args) {
        int[] array = {13, 46, 24, 52, 20, 9};
        int n = array.length;

        System.out.println("Before Bubble Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        bubbleSort(array, n);

        System.out.println("After Bubble Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
}
}
```
Time complexity:o(N^2) for worst and average cases , o(N) for best case
space complexity :o(N) auxilairy space
