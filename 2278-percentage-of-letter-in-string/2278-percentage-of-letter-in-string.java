class Solution {
    public int percentageLetter(String s, char letter) {
        int freq = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter) {
                freq++;
            }
        }
        return freq * 100 / s.length();
    }
}