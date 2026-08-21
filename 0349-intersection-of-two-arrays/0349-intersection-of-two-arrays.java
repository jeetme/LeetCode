class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> initialNums = new HashSet<>();
        for(int num : nums1) {
            initialNums.add(num);
        }

        Set<Integer> commons = new HashSet<>();
        for(int num : nums2) {
            if(initialNums.contains(num)) {
                commons.add(num);
            }
        }

        return commons.stream().mapToInt(a -> a).toArray();
    }
}