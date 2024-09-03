# Memoization 
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
<img width="1056" alt="Screenshot 2024-09-03 at 1 12 07 PM" src="https://github.com/user-attachments/assets/9b4bf31b-0a4b-4653-8d94-53aaaf2622a9">

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

 ```
Time complexity:O(N*4)*3
Space complexity: o(N)+ O(N*4)


# Tabulation (Bottom up)
declare similar size dp array
First initialize the base condition values. We know that base condition arises when day = 0.

<img width="537" alt="Screenshot 2024-09-03 at 1 36 04 PM" src="https://github.com/user-attachments/assets/3455ba91-c378-405d-af3d-4a90997860e0">
Set an iterative loop which traverses dp array (from index 1 to n) and for every index set its value according to the recursive logic

```

import java.util.*;

class TUF {
    // Function to find the maximum points for ninja training
    static int ninjaTraining(int n, int[][] points) {
        // Initialize a 2D array 'dp' to store the maximum points
        int[][] dp = new int[n][4];
        
        // Initialize the first day's maximum points based on the available choices
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        // Iterate through each day and each activity
        for (int day = 1; day < n; day++) {
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0; // Initialize the maximum points for the current day and last activity
                // Consider each possible task for the current day
                for (int task = 0; task <= 2; task++) {
                    if (task != last) { // Ensure that the current task is different from the last
                        // Calculate the points for the current activity and add it to the maximum points from the previous day
                        int activity = points[day][task] + dp[day - 1][task];
                        // Update the maximum points for the current day and last activity
                        dp[day][last] = Math.max(dp[day][last], activity);
                    }
                }
            }
        }

        // Return the maximum points achievable after all days (last activity is 3)
        return dp[n - 1][3];
    }

    public static void main(String args[]) {
        // Define the points for each activity on each day
        int[][] points = {{10, 40, 70},
                          {20, 50, 80},
                          {30, 60, 90}};

        int n = points.length; // Get the number of days
        System.out.println(ninjaTraining(n, points)); // Calculate and print the maximum points
    }
}


```
Time complexity: O(N*4*3)
Space complexity:0(N*4)

# Space Optimisation
```

import java.util.*;

class TUF {
    // Function to find the maximum points for ninja training
    static int ninjaTraining(int n, int[][] points) {
        // Initialize an array 'prev' to store the maximum points for the previous day
        int prev[] = new int[4];

        // Initialize the first day's maximum points based on the available choices
        prev[0] = Math.max(points[0][1], points[0][2]);
        prev[1] = Math.max(points[0][0], points[0][2]);
        prev[2] = Math.max(points[0][0], points[0][1]);
        prev[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        // Iterate through each day starting from the second day
        for (int day = 1; day < n; day++) {
            // Initialize an array 'temp' to store the maximum points for the current day
            int temp[] = new int[4];
            for (int last = 0; last < 4; last++) {
                temp[last] = 0; // Initialize the maximum points for the current day and last activity
                // Consider each possible task for the current day
                for (int task = 0; task <= 2; task++) {
                    if (task != last) { // Ensure that the current task is different from the last
                        // Calculate the points for the current activity and add it to the maximum points from the previous day
                        temp[last] = Math.max(temp[last], points[day][task] + prev[task]);
                    }
                }
            }
            // Update 'prev' to store the maximum points for the current day
            prev = temp;
        }

        // Return the maximum points achievable after all days (last activity is 3)
        return prev[3];
    }

    public static void main(String args[]) {
        // Define the points for each activity on each day
        int[][] points = {{10, 40, 70},
                          {20, 50, 80},
                          {30, 60, 90}};

        int n = points.length; // Get the number of days
        System.out.println(ninjaTraining(n, points)); // Calculate and print the maximum points
    }
}


```
Time Complexity: O(N*4*3)

Reason: There are three nested loops

Space Complexity: O(4)

Reason: We are using an external array of size ‘4’ to store only one row.























