class Solution {
    public int trap(int[] height) {
        /*
        int water = 0;
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        leftmax[0]=height[0];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        for(int j=height.length-2;j>=0;j--)
        {
            rightmax[j]=Math.max(rightmax[j+1],height[j]);
        }
        for(int i=1;i<height.length-1;i++)
        {
            int w = Math.min(leftmax[i],rightmax[i])-height[i];
            water+=w;
        }
        return water;
        */
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
