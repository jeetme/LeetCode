class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] answer = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && stack.peek()[1] < temperatures[i]) {
                answer[stack.peek()[0]] = i - stack.peek()[0];
                stack.pop();
            }
            stack.push(new int[] {i, temperatures[i]});
        }
        return answer;
    }
}
