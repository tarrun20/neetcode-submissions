class Solution {
    public int trap(int[] height) {
        if (height.length<3)
        {
            return 0;
        }
        int water=0;
        int i=0;
        int j=height.length - 1;
        int leftmax=height[0];
        int rightmax=height[height.length-1];
        while(i<=j)
        {
            if(leftmax > rightmax)
            {
                if(height[j] >  rightmax)
                {
                    rightmax = height[j];
                }
                int w = rightmax - height[j];
                water+=w;
                j--;
            }
            else
            {
                if(height[i] >  leftmax)
                {
                    leftmax = height[i];
                }
                int w = leftmax - height[i];
                water+=w;
                i++;
            }
        }
        return water;
    }
}
