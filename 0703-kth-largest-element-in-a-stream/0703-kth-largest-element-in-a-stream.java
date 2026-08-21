class KthLargest {
    List<Integer> scores;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.scores = Arrays.stream(nums).boxed()
            .sorted((a, b) -> b - a)
            .collect(Collectors.toCollection(ArrayList::new));
    }
    
    public int add(int val) {
        this.scores.add(val);
        this.scores.sort((a, b) -> b - a);
        return this.scores.get(this.k - 1);
    }
}