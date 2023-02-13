class Solution {
    private int minCost(int[] cost , int idx, int[] dp){
        if(idx==cost.length){
            return dp[idx] = 0;
        }
        
        if(dp[idx]!=0) return dp[idx];
        // step one
        int stepOne = minCost(cost,idx+1,dp);
        
        // step two.
        // why this ? because maybe be the cost array not have enough elements. and we need to math.min
        int stepTwo = Integer.MAX_VALUE;
        
        if(idx+2<=cost.length){
            stepTwo = minCost(cost,idx+2,dp);
        }
        // cost[idx] because i need to current index cost also.
        int ans = cost[idx] + Math.min(stepOne, stepTwo);
        
        return dp[idx] = ans;
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int startWithZero = minCost(cost,0, new int[n+1]);
        int startWithOne = minCost(cost,1,new int[n+1]);
        
        return Math.min(startWithZero,startWithOne);
    }
}