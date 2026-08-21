class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, buyingPrice = Integer.MAX_VALUE;
        for(var price : prices) {
            if(price < buyingPrice) {
                buyingPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - buyingPrice);
            }
        }
        return maxProfit;
    }
}