class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(var num : nums) {
            if(freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }

            if(freq.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }
}