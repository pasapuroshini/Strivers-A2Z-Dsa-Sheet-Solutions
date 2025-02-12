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
**How to Identify a DP problem?**

When we see a problem, it is very important to identify it as a dynamic programming problem. Generally (but not limited to) if the problem statement asks for the following:

*   Count the total number of ways
    
*   Given multiple ways of doing a task, which way will give the minimum or the maximum output.
    

We can try to apply recursion. Once we get the recursive solution, we can go ahead to convert it to a dynamic programming one.

**Steps To Solve The Problem After Identification**

Once the problem has been identified, the following three steps comes handy in solving the problem:

*   Try to represent the problem in terms of indexes.
    
*   Try all possible choices/ways at every index according to the problem statement.
    
*   If the question states
    
    *   Count all the ways - return sum of all choices/ways.
        
    *   Find maximum/minimum- return the choice/way with maximum/minimum output.
