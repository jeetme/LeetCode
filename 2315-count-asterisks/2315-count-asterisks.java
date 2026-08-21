class Solution {
    public int countAsterisks(String s) {
        boolean flag = true;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(flag && ch == '*') {
                count++;
            }
            if(ch == '|') {
                flag = !flag;
            }
        }
        return count;
    }
}