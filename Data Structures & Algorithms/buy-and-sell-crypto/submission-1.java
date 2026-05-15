class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minPrice = prices[0];
        for(int sell:prices){
            maxP = Math.max(maxP,sell-minPrice);
            minPrice = Math.min(minPrice,sell);
        }
        return maxP;
    }
}
