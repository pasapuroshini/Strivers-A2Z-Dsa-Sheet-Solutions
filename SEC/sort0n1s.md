# Given an array of n elements (0's and 1's ) sort it ??
## Brute force approach:
```
import java.util.Scanner;

class SEC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the elements (0's and 1's): ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int c0 = 0;
        int c1 = 0;
        
        // Counting 0s and 1s
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                c0++;
            } else {
                c1++;
            }
        }
        
        // Filling the array with 0s and 1s
        for (int i = 0; i < c0; i++) {
            array[i] = 0;
        }
        for (int i = c0; i < n; i++) {  // Use 'n' instead of 'c1' to fill the rest with 1s
            array[i] = 1;
        }
        
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

```

## 2 pointer approach:
```
import java.util.Scanner;

class SEC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Enter the elements (0's and 1's): ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int l = 0;
        int r = n - 1;
        
        // Two-pointer approach to sort the array
        while (l < =r) {
            if (a[l] == 0) {
                l++;
            } else if (a[r] == 1) {
                r--;
            } else if (a[l] == 1 && a[r] == 0) {
                // Swap elements at l and r
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                
                l++;
                r--;
            }
        }
        
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

```




























