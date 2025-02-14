# Frog Jump with k Distances (DP 4)


<img width="300" alt="Screenshot 2025-02-14 at 10 07 08 AM" src="https://github.com/user-attachments/assets/d5c7d73f-b435-4467-87cc-a17f4d8953f1" />



<img width="351" alt="Screenshot 2025-02-14 at 10 07 25 AM" src="https://github.com/user-attachments/assets/6abf16f2-d75a-4986-8bad-d861a2c00d84" />


```
import java.util.*;

class TUF {
    static int solveUtil(int ind, int[] height, int[] dp, int k) {
        if (ind == 0) return 0;
        if (dp[ind] != -1) return dp[ind];

        int mmSteps = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (ind - j >= 0) {
                int jump = solveUtil(ind - j, height, dp, k) + Math.abs(height[ind] - height[ind - j]);
                mmSteps = Math.min(jump, mmSteps);
            }
        }
        return dp[ind] = mmSteps;
    }

    static int solve(int n, int[] height, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solveUtil(n - 1, height, dp, k);
    }

    public static void main(String args[]) {
        int height[] = {30, 10, 60, 10, 60, 50};
        int n = height.length;
        int k = 2;
        System.out.println(solve(n, height, k));
    }
}
```
**Time Complexity: O(N \*K)**

Reason: The overlapping subproblems will return the answer in constant time. Therefore the total number of new subproblems we solve is ‘n’. At every new subproblem, we are running another loop for K times. Hence total time complexity is O(N \* K).

**Space Complexity: O(N)**

Reason: We are using a recursion stack space(O(N)) and an array (again O(N)). Therefore total space complexity will be O(N) + O(N) ≈ O(N)





## Tabulation
```

import java.util.*;

class TUF {
    static int solveUtil(int n, int[] height, int[] dp, int k) {
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int mmSteps = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    mmSteps = Math.min(jump, mmSteps);
                }
            }
            dp[i] = mmSteps;
        }
        return dp[n - 1];
    }

    static int solve(int n, int[] height, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solveUtil(n, height, dp, k);
    }

    public static void main(String args[]) {
        int height[] = {30, 10, 60, 10, 60, 50};
        int n = height.length;
        int k = 2;
        System.out.println(solve(n, height, k));
    }
}
```
**Time Complexity: O(N\*K)**

Reason: We are running two nested loops, where outer loops run from 1 to n-1 and the inner loop runs from 1 to K

**Space Complexity: O(N)**

Reason: We are using an external array of size ‘n’’.
