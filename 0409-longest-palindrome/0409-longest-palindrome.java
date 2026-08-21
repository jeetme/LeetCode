class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(var ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        int len = 0, oddFlag = 0;
        for(var entry : freq.entrySet()) {
            int f = entry.getValue();
            if(f % 2 == 0) {
                len += f;
            } else {
                len += f - 1;
                oddFlag = 1;
            }
        }
        return len + oddFlag;
    }
}