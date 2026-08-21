class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> ps = new HashMap<>();
        ps.put(0, 1);
        int currSum = 0;
        int count = 0;
        for(var num : nums) {
            currSum += num;
            if(ps.containsKey(currSum - k)) {
                count += ps.get(currSum - k);
            }
            ps.put(currSum, ps.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}