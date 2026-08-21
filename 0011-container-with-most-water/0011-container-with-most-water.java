class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length - 1;
        while(i < j) {
            int h = Math.min(height[i], height[j]);
            int w = j - i;
            int currArea = h * w;
            maxArea = Math.max(currArea, maxArea);
            while(i < j && height[i] <= h) i++;
            while(i < j && height[j] <= h) j--;
        }
        return maxArea;
    }
}