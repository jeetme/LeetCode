class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, idx = nums.length;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] >= target) {
                idx = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return idx;
    }
}