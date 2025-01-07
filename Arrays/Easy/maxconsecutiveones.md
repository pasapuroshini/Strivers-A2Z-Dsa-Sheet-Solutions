





class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int i = 0; 
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 1) {
                // Calculate the length of the streak
                maxCount = Math.max(maxCount, j - i + 1);
            } else {
                // Reset i to j + 1 as we encounter a 0
                i = j + 1;
            }
        }
        return maxcount;
 }
}
