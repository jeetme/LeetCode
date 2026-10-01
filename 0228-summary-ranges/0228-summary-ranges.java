class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        List<String> ranges = new ArrayList<>();
        String range = nums[0] + "";
        int i = 1;
        while (i < nums.length) {
            if (nums[i] - nums[i - 1] != 1) {
                if (Integer.parseInt(range) != nums[i - 1]) {
                    range += "->" + nums[i - 1];
                }
                ranges.add(range);
                range = nums[i] + "";
            }
            i++;
        }
        if (Integer.parseInt(range) != nums[i - 1]) {
            range += "->" + nums[i - 1];
        }
        ranges.add(range);
        return ranges;
    }
}