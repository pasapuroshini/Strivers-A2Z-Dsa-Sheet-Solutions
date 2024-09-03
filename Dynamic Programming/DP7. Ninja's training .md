# DP 7 Ninja's Training
->Greedy does not work
Example:
 10 50 1 (Day 0)
 5 100 11 ( Day 1)
 Greedy approach : 50 + 11=61
 Non Greedy approach: 10+100=110
 Greedy fails !!!
  What you need to do ???
   i)Try all possible ways
    -> express all possible choices interms of indexes
    -> Do stuffs on that indexes
    -->Find maximum


In this particular question ,day can be treated as a index we also require (we cant perform 2 similar tasks on 2 consecutive days)
last day what had we performed ?
so we also need a variable last( last task what we did)
last:0-> task 0
     1->task1
     2->task 2
     3->no task was done
Top down approach ( n-1) to 0.

 <img width="549" alt="Screenshot 2024-09-03 at 11 17 10 AM" src="https://github.com/user-attachments/assets/dfa8c59a-382a-4215-b59d-949614f63d0d">

     
<img width="559" alt="Screenshot 2024-09-03 at 11 20 37 AM" src="https://github.com/user-attachments/assets/fd1d14e8-46f7-4235-8a4c-a9e29dd93ac3">

 <img width="545" alt="Screenshot 2024-09-03 at 11 25 40 AM" src="https://github.com/user-attachments/assets/f1f0eda8-bdfa-4bea-aae0-94377e742c6f">
As recursive solution  ended up with overlapping subproblems , we proceed with memoization

Memoization approach:
```
import java.util.*;
class DP7{
static int f( int day,int last,int[][] points, int [][]dp){
if(dp[day][last]!=-1)return dp[day][last];
if(day==0)
{
int maxi=0;
for(int i=0;i<=2;i++)
{if(i!=last)
 maxi = Math.max(maxi, points[0][i]);
}
return dp[day][last] = maxi;
}

 int maxi = 0;
        // Loop through the three activities on the current day
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                // Calculate the points for the current activity and recursively
                // calculate the maximum points for the previous day
                int activity = points[day][i] + f(day - 1, i, points, dp);
                maxi = Math.max(maxi, activity); // Update the maximum points
            }
        }

        return dp[day][last] = maxi;
}

}
static int ninjaTraining(int n,int[][] points){
int dp[][]=new int[n][4];
for(int [] row :dp)
Arrays.fill(row,-1);
 return f(n-1,3,points,dp);

}
public static void main(String args[])
{
int [][] points={{ 10,40,70},
                  {20,50,80},
                  {30,60,90}};


int n =points.length;
System.out.pointln(ninjaTraining(n,points));

}
}

 
