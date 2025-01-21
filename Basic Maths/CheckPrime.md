# Prime Number Check in Java

This document compares two different approaches to check whether a given number is prime.

## Approach 1: Counting Factors Up to n
### Code
```
public class Main {
   
    static boolean checkPrime(int n) {
       
        int cnt = 0;
      
        for (int i = 1; i <= n; i++) {
          
            if (n % i == 0) {
               
                cnt = cnt + 1;
            }
        }

        
        if (cnt == 2) {
            
            return true;
        }
       .
        else {
          
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
```
Time Complexity:
Best Case: O(1) (if the number is 1 or not prime)
Average and Worst Case: O(n)


Space Complexity: O(1)



























## Approach 2: Counting Factors up to Square Root of n

### Code

```java
import java.util.*;

public class Main {

  
    static boolean checkPrime(int n){ 

        int cnt = 0;

       
        for(int i = 1; i <= Math.sqrt(n); i++){ 

            
            if(n % i == 0){ 

                cnt = cnt + 1;

               
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }

       
        if(cnt == 2){
            
            return true;
        }
       
        else{ 
         
            return false; 
        }
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if(isPrime){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
```
Time Complexity
Best Case: O(1) (if the number is 1 or not prime)

Average and Worst Case: O(√n)

Space Complexity
Space Complexity: O(1)
