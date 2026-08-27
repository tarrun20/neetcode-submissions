class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int cursum = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(cursum<0)
            {
                cursum = 0;
            }
            cursum+=nums[i];
            maxsum = Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}
