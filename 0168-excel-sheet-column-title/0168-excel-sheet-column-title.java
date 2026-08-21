class Solution {
    public String convertToTitle(int columnNumber) {
        String columnString = "";
        while(columnNumber > 0) {
            columnNumber--;
            columnString = (char)(columnNumber % 26 + 65) + columnString;
            columnNumber /= 26;
        }
        return columnString;
    }
}