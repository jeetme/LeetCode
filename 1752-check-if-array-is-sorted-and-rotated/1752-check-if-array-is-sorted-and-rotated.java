class Solution {
    public boolean check(int[] nums) {
        int minIdx = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[minIdx] && nums[i - 1] > nums[i]) {
                minIdx = i;
            }
        }

        for(int i = 0; i < nums.length - 1; i++) {
            int curr = nums[minIdx % nums.length];
            int next = nums[(minIdx + 1) % nums.length];
            if(curr > next) {
                return false;
            }
            minIdx++;
        }
        return true;
    }
}
