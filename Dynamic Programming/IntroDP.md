# Dynamic Programming

-Dynamic Programming can be described as storing answers to various sub-problems to be used later whenever required to solve the main problem.
-Memoization: Known as the “top-down” dynamic programming, usually the problem is solved in the direction of the main problem to the base cases.
-Tabulation: Known as the “bottom-up '' dynamic programming, usually the problem is solved in the direction of solving the base cases to the main problem.

**Memoization**

```
static int f(int n, int[] dp){
    if(n<=1) return n;
    
    if(dp[n]!= -1) return dp[n];
    return dp[n]= f(n-1,dp) + f(n-2,dp);
}
```

**Tabulation:**

```
public static void main(String args[]) {

  int n=5;
  int dp[]=new int[n+1];
  Arrays.fill(dp,-1);
  dp[0]= 0;
  dp[1]= 1;
  
  for(int i=2; i<=n; i++){
      dp[i] = dp[i-1]+ dp[i-2];
  }
  System.out.println(dp[n]);
  
  
}



```
**Space Optimization:**
```
import java.util.*;
class TUF{
public static void main(String args[]) {
 int n=5;
  
  int prev2 = 0;
  int prev = 1;
  
  for(int i=2; i<=n; i++){
      int cur_i = prev2+ prev;
      prev2 = prev;
      prev= cur_i;
  }
  System.out.println(prev);
  
  
}
}

```
