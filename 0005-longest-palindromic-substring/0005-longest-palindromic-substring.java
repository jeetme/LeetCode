class Solution {
    public String longestPalindrome(String s) {
        String longestPalin = "";
        for(int i = 0; i < s.length(); i++) {
            String oddPalin = expand(s, i, i);
            String evenPalin = expand(s, i, i + 1);
            if(oddPalin.length() > longestPalin.length()) {
                longestPalin = oddPalin;
            }
            if(evenPalin.length() > longestPalin.length()) {
                longestPalin = evenPalin;
            }
        }
        return longestPalin;
    }

    String expand(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}