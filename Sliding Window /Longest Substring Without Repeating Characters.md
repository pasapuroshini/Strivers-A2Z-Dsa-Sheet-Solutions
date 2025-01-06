# **Problem Statement**: Given a String, find the length of longest substring without any repeating character.
<img width="569" alt="Screenshot 2024-12-26 at 12 10 59 PM" src="https://github.com/user-attachments/assets/433431db-8966-47d6-ab32-2aeaeca131ae" />


# BruteForce Approach:


Creating a hash set in every iteration, and checking each character exist in the map, if exists: calculate the length of the substring till then and update maxlength accordingly ,else add it to the hashset.


```
import java.util.*;
public class Main {
    static int solve(String str) {
        if (str.length() == 0)
            return 0;
        int maxans = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            Set<Character> se = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                if (se.contains(str.charAt(j))) {
                    maxans = Math.max(maxans, j - i);
                    break;
                }
                se.add(str.charAt(j));
            }
        }
        return maxans;
    }

    public static void main(String args[]) {
        String str = "takeUforward";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));
    }
}
```


Time complexity:O(n^2)-> 2 loops
Space complexity:O(n)-> Using hashset.


# Optimized Approach 1:

1. **Initialize Two Pointers:**
   - Start with two pointers, `left` and `right`, to represent the starting and ending positions of the substring.
   - Set `left` to 0 and let `right` traverse the string.
   - Use a `Set` to keep track of the characters in the current substring.

2. **Check for Duplicates:**
   - As `right` moves forward, check if the character at `right` is already in the `Set`.
   - If a duplicate is found, move the `left` pointer forward and remove characters from the `Set` until the duplicate is excluded.

3. **Maintain Valid Substring:**
   - Ensure that the substring between `left` and `right` contains no duplicates by managing the characters in the `Set`.

4. **Calculate Length and Update Maximum:**
   - For every valid substring, calculate its length as `(right - left + 1)`.
   - Update the maximum length if the current substring's length exceeds the previously recorded maximum.

5. **Process Entire String:**
   - Continue moving the `right` pointer until it reaches the end of the string.
   - This ensures every character is processed efficiently, resulting in a time complexity of \(O(n)\).
  




```
import java.util.*;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        int result = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters is: " + result);

        sc.close();
    }
}
```
Time Complexity: O( 2*N ) (sometimes left and right both have to travel complete array)

Space Complexity: O(N) where N is the size of HashSet taken for storing the elements


# Optimized approach 2:

1. Use a `HashMap` to store characters as keys and their last seen indices as values. Initialize two pointers, `left` and `right`, to represent the sliding window.

2. Traverse the string with the `right` pointer. For each character, check if it already exists in the `HashMap`.

3. If the character is a duplicate (exists in the `HashMap`), update the `left` pointer to `max(left, map.get(currentChar) + 1)` to exclude the duplicate from the current window.

4. Update the character's index in the `HashMap` with its current position (`right`).

5. Calculate the current substring length as `(right - left + 1)` and update the maximum length if the current length is greater. Repeat until the string is fully traversed.

```
import java.util.*;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }

            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        int result = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters is: " + result);

        sc.close();
    }
}

```
Time Complexity: O( N )

Space Complexity: O(N) where N represents the size of HashSet where we are storing our elements



