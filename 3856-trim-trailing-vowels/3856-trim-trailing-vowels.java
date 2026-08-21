class Solution {
    public String trimTrailingVowels(String s) {
        int end = s.length() - 1;
        while(end >= 0 && isVowel(end, s)) {
            end--;
        }
        return s.substring(0, end + 1);
    }
    
    boolean isVowel(int idx, String s) {
        return "aeiou".indexOf(s.charAt(idx)) >= 0;
    }
}