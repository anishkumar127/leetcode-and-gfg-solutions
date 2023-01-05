class Solution {
    public int maxProfit(int[] prices) {
        int dp [][] = new int [prices.length][2];
        
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }
        
        return dfs(prices,0,0,dp);
    }
    private int dfs(int [] prices, int buySell ,int i,int[][] dp){
        if(i>=prices.length) return 0;
        
        if(dp[i][buySell]!=-1){
            return dp[i][buySell];
        }
        int max;
        
        if(buySell == 0){
            int buy = dfs(prices,1,i+1,dp) - prices[i];
            
            int notBuy = dfs(prices,0, i+1,dp);
            
            max = Math.max(buy,notBuy);
        }else{
            int sell = dfs(prices,0,i+2,dp) + prices[i];  // i+2 bcz one day cooldown.
            
            int notSell = dfs(prices,1, i+1,dp);
            
            max = Math.max(sell, notSell);
        }
        dp[i][buySell] = max;
        return dp[i][buySell];
    }
}