class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, sell = 0;
        for(int i=0; i<prices.length; i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i]-buy);
        }
        return sell;
    }
}