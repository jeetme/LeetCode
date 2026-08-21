class Solution {
    public void sortColors(int[] nums) {
        int[] bucket = new int[3];
        for(var num : nums) {
            bucket[num]++;
        }
        for(int i = 0, j = 0; i < 3; i++) {
            while(bucket[i] > 0) {
                nums[j++] = i;
                bucket[i]--;
            }
        }
    }
}