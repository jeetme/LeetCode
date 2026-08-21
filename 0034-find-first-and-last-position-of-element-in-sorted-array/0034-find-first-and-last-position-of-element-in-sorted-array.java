class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findBound(nums, target, false);
        ans[1] = findBound(nums, target, true);
        return ans;
    }

    int findBound(int[] nums, int target, boolean isUpper) {
        int left = 0, right = nums.length - 1, ansIdx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                ansIdx = mid;
                if(isUpper) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ansIdx;
    }
}