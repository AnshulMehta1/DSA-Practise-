class Solution {
    
    public int maxProfit(int[] prices) {
        
        int profit;
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<min){
                min=prices[i];
            }
            else {
                profit=prices[i]-min;
                maxProfit=Math.max(maxProfit,profit);
                    
            }
        }
        
        return maxProfit;
        
    }
}
