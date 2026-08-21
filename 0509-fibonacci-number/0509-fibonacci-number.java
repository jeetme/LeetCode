class Solution {
    public int fib(int n) {
        return fib(n, new int[n + 1]);
    }
    
    int fib(int n, int[] memo) {
        if(n <= 1) {
            return n;
        }
        if(memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
}