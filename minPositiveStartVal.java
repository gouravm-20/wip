// 1413. Minimum Value to Get Positive Step by Step Sum
class Solution {
    public int minStartValue(int[] nums) {
        // build the prefixSum array
        for(int i=1; i<nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        // Find the minimum startValue
        int minVal = Integer.MAX_VALUE;
        for(int j=0; j<nums.length; j++) {
            minVal = Math.min(minVal, nums[j]);
        }
        return 1-minVal<1? 1:1-minVal;
    }
