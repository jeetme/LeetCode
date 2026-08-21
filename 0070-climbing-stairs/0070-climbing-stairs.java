class Solution {
    public int climbStairs(int n) {
        return climbStairs(n, new int[n + 1]);
    }
    int climbStairs(int n, int[] memo) {
        if(n <= 2) {
            return n;
        }

        if(memo[n] != 0) {
            return memo[n];
        }

        memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
        return memo[n];
    }
}