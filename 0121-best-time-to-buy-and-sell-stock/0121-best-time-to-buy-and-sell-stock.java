class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
         
            for(int cost:prices){
                minValue = Math.min(cost,minValue);
                int currentProfit = cost-minValue;
                maxProfit = Math.max(maxProfit , currentProfit);
            }
        
        return maxProfit;
    }
}