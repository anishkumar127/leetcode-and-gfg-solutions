class Solution {
    private int minCost(int[] cost ,  int[] dp){
      for(int idx = cost.length; idx>=0; idx--){
          
        if(idx==cost.length){
             dp[idx] = 0;
            continue;
        }
        
        // step one
        int stepOne = dp[idx+1];//minCost(cost,idx+1,dp);
        
        // step two.
        // why this ? because maybe be the cost array not have enough elements. and we need to math.min
        int stepTwo = Integer.MAX_VALUE;
        
        if(idx+2<=cost.length){
            stepTwo =   dp[idx+2];//minCost(cost,idx+2,dp);
        }
        // cost[idx] because i need to current index cost also.
        int ans = cost[idx] + Math.min(stepOne, stepTwo);
        
        dp[idx] = ans;
      }  
        
        return Math.min(dp[0],dp[1]);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return minCost(cost,new int [n+1]);
    }
}