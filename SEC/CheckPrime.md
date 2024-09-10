# Checking whether number is a prime
```
import java.util.Scanner;  
  
import java.util.Scanner;  
  
public class PrimeExample3 {  
  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
       if (isPrime(n)) {  
           System.out.println(n + " is a prime number");  
       } else {  
           System.out.println(n + " is not a prime number");  
       }  
   }  
  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
 return true;  
   }  
}

```


```
import java.util.Scanner;

public class PrimeCheck {

    // Function to check if n is prime
    public static boolean isPrime(int n) {
        // Handle numbers less than or equal to 1
        if (n <= 1) {
            return false;
        }
        // Handle 2 and 3 as they are prime
        if (n <= 3) {
            return true;
        }
        // Eliminate numbers divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        // Check divisibility from 5 to sqrt(n) in steps of 6
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Taking user input for testing the prime check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n = scanner.nextInt();
        scanner.close();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
```


Prime numbers are of the form 6k±1: Any prime number greater than 3 must be of the form 6k−1 or 6k+1, where k is an integer.



