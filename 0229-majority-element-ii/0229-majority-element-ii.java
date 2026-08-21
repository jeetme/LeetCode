class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> numList = new ArrayList<>();
        for(var num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(var entry : freq.entrySet()) {
            if(entry.getValue() > nums.length / 3) {
                numList.add(entry.getKey());
            }
        }
        return numList;
    }
}