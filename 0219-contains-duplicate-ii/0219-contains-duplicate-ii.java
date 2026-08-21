class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastSeen = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(lastSeen.containsKey(nums[i])) {
                int j = lastSeen.get(nums[i]);
                if(Math.abs(i - j) <= k) {
                    return true;
                }
            }
            lastSeen.put(nums[i], i);
        }
        return false;
    }
}