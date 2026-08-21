class Solution {
    public int trap(int[] height) {
        int amountOfWaterTrapped = 0;

        int max = 0;
        int[] leftMax = new int[height.length];
        for(int i = 0; i < height.length; i++) {
            leftMax[i] = max;
            max = Math.max(max, height[i]);
        }

        max = 0;
        int[] rightMax = new int[height.length];
        for(int i = height.length - 1; i >= 0; i--) {
            rightMax[i] = max;
            max = Math.max(max, height[i]);
        }
        
        for(int i = 0; i < height.length; i++) {
            int level = Math.min(leftMax[i], rightMax[i]) - height[i];
            if(level > 0) {
                amountOfWaterTrapped += level; 
            }
        }
        return amountOfWaterTrapped;
    }
}