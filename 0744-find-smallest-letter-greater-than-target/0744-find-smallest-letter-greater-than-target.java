class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1, ansIdx = -1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(letters[mid] > target) {
                ansIdx = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ansIdx == -1 ? letters[0] : letters[ansIdx];
    }
}