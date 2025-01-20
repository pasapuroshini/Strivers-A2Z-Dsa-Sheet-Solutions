# Assign Cookies in Java

This Java program solves the problem of assigning cookies to children in a way that maximizes the number of children who are content.

## Code

```java
import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] greed, int[] cookieSize) {
        int n = greed.length;
        int m = cookieSize.length;

        Arrays.sort(greed);
        Arrays.sort(cookieSize);

        int l = 0;
        int r = 0;

        while (l < m && r < n) {
            if (greed[r] <= cookieSize[l]) {
                r++;
            }
            l++;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] greed = {1, 5, 3, 3, 4};
        int[] cookieSize = {4, 2, 1, 2, 1, 3};

        System.out.print("Array Representing Greed: ");
        for (int i = 0; i < greed.length; i++) {
            System.out.print(greed[i] + " ");
        }
        System.out.println();

        System.out.print("Array Representing Cookie Size: ");
        for (int i = 0; i < cookieSize.length; i++) {
            System.out.print(cookieSize[i] + " ");
        }

        int ans = findContentChildren(greed, cookieSize);

        System.out.println();
        System.out.println("No. of kids assigned cookies " + ans);
        System.out.println();
    }
}

```
Complexity Analysis

Time Complexity: O(N logN + M logM + M) where N is the length of the greedy array, M is the length of the cookies array. To sort the greedy and cookies array, the complexity is O(N logN) and O(M logM).

After sorting, we iterate over the arrays at most M times as M is the total number of cookies.
Since each child and each cookie is considered at most once, the time complexity of this part is linear in terms of the size of the cookie array, which is O(M).
Space Complexity: O(1) as the algorithm uses only a constant amount of extra space regardless of the size of the input array. It does not require any additional data structures that scale with the input size
