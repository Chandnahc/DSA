class Solution {
    public int maxProfit(int[] prices) {
        int minPriceIdx = 0;
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            if(i!=minPriceIdx){
                if(prices[i]<prices[minPriceIdx]){
                    minPriceIdx = i;
                }else{
                    if((prices[i]-prices[minPriceIdx])>maxProfit){
                        maxProfit = prices[i] - prices[minPriceIdx];
                    }

                }
            }
        }
        return maxProfit;
    }
}