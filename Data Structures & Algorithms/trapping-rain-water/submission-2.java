class Solution {
    public int trap(int[] height) {
        int water = 0;
        int max=0;
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        for(int i=0;i<height.length;i++)
        {
            max=Math.max(max,height[i]);
            leftmax[i] = max;
        }
        max=0;
        for(int j=height.length-1;j>0;j--)
        {
            max=Math.max(max,height[j]);
            rightmax[j] = max;
        }
        for(int i=1;i<height.length-1;i++)
        {
            int w = Math.min(leftmax[i],rightmax[i])-height[i];
            water+=w;
        }
        return water;
    }
}
