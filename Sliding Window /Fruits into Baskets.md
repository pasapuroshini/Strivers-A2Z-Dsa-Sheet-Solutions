# Problem Statement:
You are given a list of integers where each integer represents a type of fruit on a tree. You have two baskets, and each basket can only hold one type of fruit. Your task is to collect the maximum number of fruits from a contiguous subarray while adhering to the basket constraints.
## Brute Force Approach
Generate all possible subarrays.
Check each subarray to see if it contains at most two unique fruit types.
Track the maximum length among valid subarrays.
##  Time complexity :
O(n²) due to nested loops for subarray generation.
## Space Complexity:
Using a set/map to store unique elements: O(k), where k≤n.
```
import java.util.HashSet;

public class FruitsIntoBasketsBruteForce {
    public static int totalFruit(int[] fruits) {
        int maxLength = 0;
        for (int i = 0; i < fruits.length; i++) {
            HashSet<Integer> basket = new HashSet<>();
            for (int j = i; j < fruits.length; j++) {
                basket.add(fruits[j]);
                if (basket.size() > 2) {
                    break;
                }
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println(totalFruit(fruits)); // Output: 4
    }
}
```
# Optimized Approach 1: Sliding Window with Map
Use a sliding window with two pointers.
Use a map to track the count of each fruit in the window.
When the window has more than two unique fruits, shrink it from the left.
Keep track of the maximum length of valid windows.
##  Time complexity :
O(n) Traversing Array
## Space Complexity:
Using a map to store 2 unique elements: O(1).

```
import java.util.HashMap;

public class FruitsIntoBasketsSlidingWindow {
    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println(totalFruit(fruits)); // Output: 4
    }
}
```
# Optimized Sliding Window
Use a sliding window with a single map but avoid iterating unnecessarily during invalid window cases.
Maintain counts directly in the map and only update when necessary.
##  Time complexity :
Both pointers traverse the array once: O(n)
## Space Complexity:
Using a map to store 2 unique elements: O(1).
```
import java.util.HashMap;

public class FruitsIntoBasketsOptimized {
    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println(totalFruit(fruits)); // Output: 4
    }
}

```
