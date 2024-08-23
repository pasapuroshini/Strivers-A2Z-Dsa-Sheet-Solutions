# Maximum Sum of Non-Adjacent Elements

**Let's try out all subsequences with the given constraint**

## Intuition

Now, pick the one with the maximum sum. The approach involves printing all subsequences using recursion.

## Approach

1. **Express every recursion in terms of the index.**
2. **Do the possible operations on that index.**
3. **Return the best result.**

## Step 1: Recursive PseudoCode

```java 
f(ind, arr[]) {
    if (ind == 0) return arr[ind];
    if (ind < 0) return 0;

    int pick = arr[ind] + f(ind - 2, arr);
    int notPick = 0 + f(ind - 1, arr);
    
    return max(pick, notPick);
} 
```


**Memoization Approach**
Code in java :
```java
import java.util.*;
public class Main{
static int solveUtil(int ind,int[] arr,int[] dp)
{
if(ind<0) return 0;
if(ind==0 ) return arr[ind];
if(dp[ind]!=-1) return dp[ind];

int pick=arr[ind]+solveUtil(ind-2,arr,dp);
int nonpick= solveUtil(ind-1,arr,dp);
return dp[ind]= Math.max(pick,nonpick);
}

static int solve(int n,int[] arr)
{
int dp[]=new int[n];
Arrays.fill(dp,-1);
return solveUtil(n-1,arr,dp);
}

public static void main(String args[])
{
 Scanner scanner = new Scanner(System.in);
int n=scanner.nextInt();
int arr[]= new int[n];
for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }

int ans= solve(n,arr);
System.out.println(ans);
}
}
```
Time Complexity :O(N)
Space Complexity : O(N) Because ,We are using recursion and array auxilary space
  
**Tabulation Approach**
```java
import java.util.*;
public class Main{
static int solveUtil(int ind,int[] arr,int[] dp)
{
dp[0]=arr[0];
for(int i=1;i<n;i++)
{
    int pick=arr[i];
if(i>1)
    pick+=dp[i-2];
int non pick=dp[i-1];
dp[i]=Math.max(pick,non pick);

return dp[n-1];
}

static int solve(int n,int[] arr)
{
int dp[]=new int[n];
Arrays.fill(dp,-1);
return solveUtil(n,arr,dp);
}

public static void main(String args[])
{
 Scanner scanner = new Scanner(System.in);
int n=scanner.nextInt();
int arr[]= new int[n];
for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }

int ans= solve(n,arr);
System.out.println(ans);
}
}
```
Time Complexity: O(N),We are running a simple iterative loop

Space Complexity: O(N), We are using an external array of size ‘n+1’.


**Space Optimisation**
```java
import java.util.*;
public class Main{


static int solve(int n,int[] arr)
{
int prev=arr[0];
int prev2=0;
for(int i=1;i<n;i++)
{
int pick=arr[i];
if(i>1)
 pick+=prev2;
int nonpick=prev;
int curr=Math.max(pick,nonpick);
prev2=prev;
prev=curr;
}
return prev;
}

public static void main(String args[])
{
 Scanner scanner = new Scanner(System.in);
int n=scanner.nextInt();
int arr[]= new int[n];
for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }

int ans= solve(n,arr);
System.out.println(ans);
}
}
```
Time Complexity: O(N),We are running a simple iterative loop

Space Complexity: O(1),We are not using any extra space.
