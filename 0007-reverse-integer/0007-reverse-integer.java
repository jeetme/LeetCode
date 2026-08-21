class Solution {
    public int reverse(int x) {
        int reverse  = 0;
        for(int i = x; i != 0; i /= 10) {
            int digit = i % 10;
            if(reverse * 10L + digit > Integer.MAX_VALUE ||
                reverse * 10L + digit < Integer.MIN_VALUE) {
                return 0;
            }
            reverse = reverse * 10 + digit;
        }
        return reverse;
    }
}