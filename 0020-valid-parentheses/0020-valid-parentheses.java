class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> pair = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        );
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            if("([{".indexOf(s.charAt(i)) >= 0) {
                stack.push(s.charAt(i));
            } else if(stack.peek() == pair.get(s.charAt(i))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}