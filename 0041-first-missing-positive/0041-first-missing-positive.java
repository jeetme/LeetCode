class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> positives = new HashSet<>();
        int max = 0;
        for(var num : nums) {
            if(num > 0) {
                positives.add(num);
                max = Math.max(max, num);
            }
        }
        for(int i = 1; i <= max; i++) {
            if(!positives.contains(i)) {
                return i;
            }
        }
        return max + 1;
    }
}