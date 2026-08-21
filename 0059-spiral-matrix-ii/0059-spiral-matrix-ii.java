class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];
        int h = 0, v = 0, hStep = 1, vStep = 0;
        for(int i = 1; i <= n * n; i++) {
            spiral[v][h] = i;
            if(!(0 <= h + hStep && h + hStep < n &&
               0 <= v + vStep && v + vStep < n) ||
               spiral[v + vStep][h + hStep] != 0) {
                int temp = hStep;
                hStep = -vStep;
                vStep = temp; 
            }
            h = h + hStep;
            v = v + vStep;
        }
        return spiral;
    }
}