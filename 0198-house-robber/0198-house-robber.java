class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return findMax(0,nums,dp);
    }
    
    private int findMax(int idx, int[] arr,int[] dp){
        for(idx = arr.length; idx>=0; idx--){
        if(idx==arr.length){
            dp[idx] = 0;
            continue;
        }
        
        int rob = arr[idx];
        int notRob = 0;
        if(dp[idx]!=-1) return dp[idx];
        
        if(idx+2<=arr.length)
            rob+=dp[idx+2]; //findMax(idx+2,arr,dp);
        
        notRob+=dp[idx+1]; //findMax(idx+1,arr,dp);
        
        int ans = Math.max(rob,notRob);
        dp[idx] = ans;
        }
        
        return dp[0];
    }
}