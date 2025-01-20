```
mport java.util.Scanner;

public class Main {
  
    public static int countDigits(int n) {
      
        int cnt = 0;
        
        while (n > 0) {
            
            cnt = cnt + 1;
            
            n = n / 10;
        }
       
        return cnt;
    }

    public static void main(String[] args) {
        int N = 329823;
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}
```
Time Complexity: O(log10N + 1) 
Space Complexity : O(1)

# Optimal Approach:
``
 int cnt = (int) (Math.log10(n) + 1);
 ``
 Time complexity:O(1)
 Space complexity:O(1)
