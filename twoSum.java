class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indices[] = new int[2];
        for(int idx=0; idx<nums.length; idx++) {
            int y = target - nums[idx];
            for(int j=idx+1; j<nums.length; j++) {
                if(y==nums[j]) {
                    indices[0] = idx;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;        
    }
}

// Using HashMap: Time complexity - O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int idx=0; idx<nums.length; idx++) {
            int y = target-nums[idx];
            if(hm.containsKey(y)) {
                return new int[] {hm.get(y), idx};
            }
            hm.put(nums[idx], idx);
        }
        return new int[] {0};
    }
}
