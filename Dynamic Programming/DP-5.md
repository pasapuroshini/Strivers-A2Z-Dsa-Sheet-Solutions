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


'''
**Memoization Approach**
Code in java :



