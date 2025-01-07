# Intuition
The problem requires finding the longest contiguous subarray where at most `k` zeros can be flipped to 1. This suggests using a sliding window technique to efficiently track valid subarrays.

# Approach

### Approach 1: Brute Force
- Use two nested loops to iterate over all possible subarrays.
- Count the number of zeros in each subarray.
- If the number of zeros is less than or equal to `k`, calculate the length of the subarray and update the maximum length.
- **Limitation**: This approach is computationally expensive due to its quadratic time complexity.

### Approach 2: Sliding Window (Optimized)
- Use a two-pointer technique to maintain a window `[l, r]`.
- Increment the right pointer (`r`) to expand the window and count zeros.
- If the count of zeros exceeds `k`, increment the left pointer (`l`) to shrink the window until it becomes valid.
- At every step, calculate the maximum length of the window.
- **Key Idea**: The sliding window dynamically adjusts its size to maintain the constraint on the number of zeros.

### Approach 3: Sliding Window (Compact Version)
- Similar to Approach 2 but written more concisely.
- The logic remains the same: expand the window by moving `r`, and shrink it by moving `l` when the number of zeros exceeds `k`.
- This approach highlights the same efficiency as Approach 2 but with cleaner implementation.

# Complexity
- **Time complexity**:  
  - Approach 1: $$O(n^2)$$ due to the nested loops.
  - Approach 2 and 3: $$O(n)$$ as each element is processed at most twice (once by `r` and once by `l`).
- **Space complexity**:  
  - All approaches use $$O(1)$$ additional space since no extra data structures are used.

# Code
```java
// Approach 1: Brute Force
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxlen = Integer.MIN_VALUE;

        // Special case: no flips allowed
        if (k == 0) {
            int maxCount = 0;
            int i = 0; // Pointer to mark the start of a streak of 1s
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == 1) {
                    maxCount = Math.max(maxCount, j - i + 1);
                } else {
                    i = j + 1; // Reset streak
                }
            }
            return maxCount;
        }

        // Brute force: test all subarrays
        for (int i = 0; i < n; i++) {
            int zero = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 0) {
                    zero++;
                }
                if (zero <= k) {
                    int len = j - i + 1;
                    maxlen = Math.max(len, maxlen);
                } else {
                    break;
                }
            }
        }
        return maxlen;
    }
}

// Approach 2: Sliding Window (Optimized)
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxcnt = Integer.MIN_VALUE;
        int zerocount = 0;

        while (r < nums.length) {
            if (nums[r] == 0) zerocount++;
            while (zerocount > k) {
                if (nums[l] == 0) zerocount--;
                l++;
            }
            maxcnt = Math.max(r - l + 1, maxcnt);
            r++;
        }
        return maxcnt;
    }
}

// Approach 3: Sliding Window (Compact Version)
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int maxcnt = Integer.MIN_VALUE;
        int zerocount = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) zerocount++;
            if (zerocount > k) {
                if (nums[l] == 0) zerocount--;
                l++;
            }
            maxcnt = Math.max(r - l + 1, maxcnt);
        }
        return maxcnt;
    }
}
