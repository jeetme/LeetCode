class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (var entry : operations) {
            if (entry.equals("C")) {
                stack.pop();
            } else if (entry.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (entry.equals("+")) {
                int lastTop = stack.pop();
                int newEntry = stack.peek() + lastTop;
                stack.push(lastTop);
                stack.push(newEntry);
            } else {
                stack.push(Integer.parseInt(entry));
            }
        }

        int sum = 0;
        for(var num : stack) {
            sum += num;
        }
        return sum;
    }
}