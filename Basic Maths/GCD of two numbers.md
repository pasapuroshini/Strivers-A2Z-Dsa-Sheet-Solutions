# Approach 1: Brute Force Method (Iterative Method)
## Explanation:
In this approach, we iterate from 1 to the minimum of the two numbers (n1 and n2). For each iteration, we check if both numbers are divisible by the current number. If they are, we update the GCD to the current number. This continues until we find the greatest common divisor.
```
public class Main {
    public static int findGcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;
        int gcd = findGcd(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}

```
## Time Complexity:

O(min(n1, n2)): We iterate up to the minimum of the two numbers.

# Approach 2: Better Approach
## Explanation:

We can optimise the time complexity of the previous approach. In the worst case, the loop iterates from 1 up to the minimum of N1 and N2. This could potentially result in a large number of iterations, especially when one input number is significantly larger than the other.
If we iterate from the minimum of N1 and N2 down to 1, we reduce the number of iterations because we start from the potentially largest common factor and work downwards.
The time complexity of this approach remains O(min(N1, N2)) but in practice, it will execute fewer iterations on average.
```
                                
import java.util.*;

public class Main {
    public static int findGcd(int n1, int n2) {
        // Iterate from the minimum of
        // n1 and n2 down to 1
        // Start from the minimum of n1 and n2
        // because the GCD cannot
        // exceed the smaller number
        
        for (int i = Math.min(n1, n2); i &gt; 0; i--) {
            // Check if i is a common
            // factor of both n1 and n2
            if (n1 % i == 0 &amp;&amp; n2 % i == 0) {
                // If i is a common factor,
                // return it as the GCD
                return i;
            }
        }
        // If no common factors are found,
        // return 1 (as 1 is always a
        // divisor of any number)
        return 1;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;
        
        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);

        System.out.println(&quot;GCD of &quot; + n1 + &quot; and &quot; + n2 + &quot; is: &quot; + gcd);
    }
}
```




## Time Complexity:

O(min(n1, n2)): We iterate up to the minimum of the two numbers.





# Approach 3: Euclidean Algorithm
The Euclidean algorithm is an efficient method for finding the GCD of two numbers. It works by repeatedly replacing the larger number with the remainder of the division of the two numbers. The algorithm stops when one of the numbers becomes 0, and the other number is the GCD.
```
                                
public class Main {
    // Continue loop as long as both
    // a and b are greater than 0
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            return b;
        }
        // If a is not 0,
        // return a as the GCD
        return a;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
```
Time Complexity:

O(log(min(n1, n2))): The algorithm runs in logarithmic time due to the division and remainder steps.
