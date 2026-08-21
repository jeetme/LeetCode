class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        
        int i = 0, j = 0;
        while(i < word1.length() && j < word2.length()) {
            merged += word1.charAt(i++);
            merged += word2.charAt(j++);
        }

        while(i < word1.length()) merged += word1.charAt(i++);
        while(j < word2.length()) merged += word2.charAt(j++);

        return merged;
    }
}