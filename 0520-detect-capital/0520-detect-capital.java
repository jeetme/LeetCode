class Solution {
    public boolean detectCapitalUse(String word) {
        return word.matches("^[A-Z]{1,}$|^[A-Z]{0,1}[a-z]{1,}$");
    }
}