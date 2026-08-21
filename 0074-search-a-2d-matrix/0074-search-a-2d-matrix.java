class Solution {
    int col = 0;
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length * matrix[0].length - 1;
        col = matrix[0].length;
        while(left <= right) {
            int mid = (left + right) / 2;
            int curr = matrix[i(mid)][j(mid)];
            if(curr == target) {
                return true;
            } else if(curr > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
    int i(int linearIndex) {
        return linearIndex / this.col;
    }
    int j(int linearIndex) {
        return linearIndex % this.col;
    }
}