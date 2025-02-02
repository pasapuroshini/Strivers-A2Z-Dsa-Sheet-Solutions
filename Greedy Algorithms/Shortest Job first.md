# Shortest Job first

[Click here]([https://www.geeksforgeeks.org/problems/shortest-job-first/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=shortest-job-first](https://www.geeksforgeeks.org/problems/shortest-job-first/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=shortest-job-first))





**Problem Statement: Given a list of job durations representing the time it takes to complete each job. Implement the Shortest Job First algorithm to find the average waiting time for these jobs.**
```
import java.util.Arrays;

public class Main {
    static float shortestJobFirst(int[] jobs) {
        Arrays.sort(jobs);
        float waitTime = 0;
        int totalTime = 0;
        int n = jobs.length;

        for (int i = 0; i < n; i++) {
            waitTime += totalTime;
            totalTime += jobs[i];
        }
        return waitTime / n;
    }
}

```
**Time Complexity: O(N logN + N) where N is the length of the jobs array. We sort the jobs array giving complexity O(N log N) and to calculate the waiting time we iterate through the sorted array taking O(N) complexity**.

**Space Complexity: O(1) as the algorithm uses only a constant amount of extra space regardless of the size of the input array. It does not require any additional data structures that scale with the input size.**





