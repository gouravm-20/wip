// optimized approach - prefix sum
class Solution {
    public int pivotIndex(int[] nums) {
        
        // initialize an array to store the prefix sum
        int[] pfSum = new int[nums.length];
        
        // build the prefix sum array 
        pfSum[0] = nums[0];
        for(int i=1; i<pfSum.length; i++) {
            pfSum[i] = pfSum[i-1] + nums[i];
        }

        // check for the pivot element (edge cases: corner indices)
        for(int i=0; i<pfSum.length; i++) {
            int leftSum = i==0? 0 : pfSum[i-1];
            int rightSum = pfSum[pfSum.length-1] - pfSum[i];
            /*
            int rightSum = i==pfSum.length-1? 0 : pfSum[pfSum.length-1] - pfSum[i];
            when i = N-1 rightSum = pfSum[N-1] - pfSum[N-1] = 0 (already taken care of)
            */
            if(leftSum==rightSum) return i;
        }
        return -1;
    }
}

// Brute Force
/*
class Main {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        for(int idx=0; idx<nums.length; idx++) {
            int leftSum=0;
            int rightSum = 0;
            
            // leftSum
            for(int l=0; l<idx; l++) {
                leftSum += nums[l];
            }
            
            // rightSum
            for(int r=idx+1; r<nums.length; r++) {
                rightSum += nums[r];
            }
            if(leftSum == rightSum) {
                System.out.println("pivotIndex:"+idx+" pivotElement:"+nums[idx]);
            }
        }
    }
}
*/
