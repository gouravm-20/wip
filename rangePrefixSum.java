class NumArray {

    private int[] pfSum;

    public NumArray(int[] nums) {
        pfSum = new int[nums.length];
        pfSum[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            pfSum[i] = pfSum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) {
            return pfSum[right];   
        }
        return pfSum[right] - pfSum[left-1];
    }
}
