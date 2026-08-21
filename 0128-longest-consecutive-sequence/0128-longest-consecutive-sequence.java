class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        } 
        Set<Integer> set = new HashSet<>();
        for(var num : nums) set.add(num);
        int max = 0;
        for(var num : set) {
            if(!set.contains(num - 1)) {
                int i = num, count = 0;
                while(set.contains(i)) {
                    count++;
                    i++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}