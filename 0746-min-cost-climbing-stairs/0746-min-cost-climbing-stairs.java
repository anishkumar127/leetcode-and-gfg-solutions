class Solution {
    private int minCost(int[] cost){
        int n = cost.length;
        
        int idxp1 = cost[n-1];
        int idxp2 = 0;
        
        for(int idx = n-2; idx>=0; idx--){
            int ansIdx = cost[idx] + Math.min(idxp1,idxp2);
            
            idxp2 = idxp1;
            idxp1 = ansIdx;
        }
        return Math.min(idxp1,idxp2);
    }
    public int minCostClimbingStairs(int[] cost) {
        return minCost(cost);
    }
}