class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> s = new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];
            if(s.containsKey(comp))
            {
                return new int[]{ s.get(comp),i};
            }
            s.put(nums[i], i);
        }
        return new int[0];
    }
}
