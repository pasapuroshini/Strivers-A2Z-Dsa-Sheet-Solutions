import java.util.*;

public class Main {

    public static int search(int[] arr, int n, int num) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;  // Return index if the number is found
            }
        }
        return -1;  // Return -1 if the number is not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num = 4;
        int n = arr.length;  // Get the length of the array
        int val = search(arr, n, num);  // Call the search method
        System.out.println(val);  // Print the result (index of the number or -1)
    }
}
