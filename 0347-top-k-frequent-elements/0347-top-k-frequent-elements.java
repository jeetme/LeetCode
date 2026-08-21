class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(var num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] topK = freq.entrySet().stream()
            .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
            .limit(k)
            .mapToInt(entry -> entry.getKey())
            .toArray();

        return topK;
    }
}