class Solution {
    public int titleToNumber(String columnTitle) {
        int columnNumber = 0, pow = 1;
        for(int i = columnTitle.length() - 1; i >= 0; i--) {
            columnNumber += (columnTitle.charAt(i) - 64) * pow;
            pow *= 26;
        }
        return columnNumber;
    }
}