class Solution {
    public int trap(int[] height) {
        int water = 0;
        int max=0;
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        for(int i=0;i<height.length;i++)
        {
            if(max<height[i])
            {
                leftmax[i] = height[i];
                max=height[i];
            }
            else
            {
                leftmax[i] = max;
            }
        }
        max=0;
        for(int j=height.length-1;j>0;j--)
        {
            if(max<height[j])
            {
                rightmax[j] = height[j];
                max=height[j];
            }
            else
            {
                rightmax[j] = max;
            }
        }
        for(int i=1;i<height.length-1;i++)
        {
            int w = Math.min(leftmax[i],rightmax[i])-height[i];
            water+=w;
        }
        return water;
    }
}
