class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--) {
            int currSum = digits[i] + carry;
            digits[i] = currSum % 10;
            carry = currSum / 10;
        }
        if(carry != 0) {
            int[] sum = new int[digits.length + 1];
            sum[0] = carry;
            for(int i = 0; i < digits.length; i++) {
                sum[i + 1] = digits[i];
            }
            return sum;
        }
        return digits;
    }
}