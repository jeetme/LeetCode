class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for(var weight : stones) {
            pq.offer(weight);
        }
        while(pq.size() > 1) {
            int largest = pq.poll();
            int secondLargest = pq.poll();

            int afterBlast = largest - secondLargest;
            pq.offer(afterBlast);
        }
        return pq.peek();
    }
}