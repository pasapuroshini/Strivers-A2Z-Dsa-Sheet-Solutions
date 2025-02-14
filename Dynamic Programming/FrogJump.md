# Frog Jump

### Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair. At a time the frog can climb either one or two steps. A height[N] array is also given. Whenever the frog jumps from a stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the absolute difference. We need to return the minimum energy that can be used by the frog to jump from stair 0 to stair N-1.

<img width="336" alt="Screenshot 2025-02-14 at 10 20 27 AM" src="https://github.com/user-attachments/assets/327f6aae-9d3f-41f7-af0a-8592e3052f82" />

# Memoization

```

import java.util.*;
class TUF{
static int solve(int ind,int[] height,int[] dp){
    if(ind==0) return 0;
    if(dp[ind]!=-1) return dp[ind];
    int jumpTwo = Integer.MAX_VALUE;
    int jumpOne= solve(ind-1, height,dp)+ Math.abs(height[ind]-height[ind-1]);
    if(ind>1)
        jumpTwo = solve(ind-2, height,dp)+ Math.abs(height[ind]-height[ind-2]);
    
    return dp[ind]=Math.min(jumpOne, jumpTwo);
}

```

**Time Complexity: O(N)**

Reason: The overlapping subproblems will return the answer in constant time O(1). Therefore the total number of new subproblems we solve is ‘n’. Hence total time complexity is O(N).

**Space Complexity: O(N)**

Reason: We are using a recursion stack space(O(N)) and an array (again O(N)). Therefore total space complexity will be O(N) + O(N) ≈ O(N)



# Tabulation:
```

import java.util.*;
class TUF{
public static void main(String args[]) {

  int height[]={30,10,60,10,60,50};
  int n=height.length;
  int dp[]=new int[n];
  Arrays.fill(dp,-1);
  dp[0]=0;
  for(int ind=1;ind<n;ind++){
      int jumpTwo = Integer.MAX_VALUE;
        int jumpOne= dp[ind-1] + Math.abs(height[ind]-height[ind-1]);
        if(ind>1)
            jumpTwo = dp[ind-2] + Math.abs(height[ind]-height[ind-2]);
    
        dp[ind]=Math.min(jumpOne, jumpTwo);
  }
  System.out.println(dp[n-1]);
}
}

```
**Time Complexity: O(N)**

Reason: We are running a simple iterative loop

**Space Complexity: O(N)**

Reason: We are using an external array of size ‘n+1’.

## SPace Optimization:

```
import java.util.*;
class TUF{
public static void main(String args[]) {

  int height[]={30,10,60,10,60,50};
  int n=height.length;
   int prev=0;
  int prev2=0;
  for(int i=1;i<n;i++){
      
      int jumpTwo = Integer.MAX_VALUE;
      int jumpOne= prev + Math.abs(height[i]-height[i-1]);
      if(i>1)
        jumpTwo = prev2 + Math.abs(height[i]-height[i-2]);
    
      int cur_i=Math.min(jumpOne, jumpTwo);
      prev2=prev;
      prev=cur_i;
        
  }
  System.out.println(prev);
}
}

```
Time Complexity: O(N)

Reason: We are running a simple iterative loop

Space Complexity: O(1)

Reason: We are not using any extra space.
