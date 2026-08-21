class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> initialNums = new ArrayList<>();
        for(var num : nums1) {
            initialNums.add(num);
        }

        List<Integer> commons = new ArrayList<>();
        for(var num : nums2) {
            if(initialNums.contains(num)) {
                commons.add(num);
                initialNums.set(initialNums.indexOf(num), -1);
            }
        }

        return commons.stream().mapToInt(a -> a).toArray();
    }
}