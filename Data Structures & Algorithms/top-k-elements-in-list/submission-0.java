class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num:nums)
        {
            if(map.containsKey(num))
            {
                int val = map.get(num);
                val++;
                map.put(num,val);
            }
            else
            {
                map.put(num,1);
            }
        }
        List<List<Integer>> result = new ArrayList<>(nums.length+1);
        for(int i=0;i<=nums.length;i++)
        {
            result.add(new ArrayList<>());
        }
        map.forEach((key,value)->{
            result.get(value).add(key);
        });
        int[] res = new int[k];
        int index = 0;
        for(int i=nums.length;i>=0;i--)
        {
            if(!result.get(i).isEmpty())
            {
                for(int n:result.get(i))
                {
                    res[index++] = n;
                    if(index==k)
                    {
                        return res;
                    }
                }
            }
        }
        return new int []{};
    }
}
