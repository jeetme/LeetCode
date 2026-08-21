class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(var pile : piles) {
            max = Math.max(max, pile);
        }
        int left = 1, right = max, rate = max;
        while(left <= right) {
            int currRate = left + (right - left) / 2;
            if(eatAt(currRate, piles) <= h) {
                rate = currRate;
                right = currRate - 1;
            } else {
                left = currRate + 1;
            }
        }
        return rate;
    }
    
    int eatAt(int rate, int[] piles) {
        int timeTaken = 0;
        for(var pile : piles) {
            timeTaken += Math.ceil(pile * 1D/ rate);
        }
        return timeTaken;
    }
}