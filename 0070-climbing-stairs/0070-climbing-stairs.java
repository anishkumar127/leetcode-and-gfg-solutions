class Solution {
    public int climbStairs(int n) {
       
        int f = 0;
        int s = 1;
        int t = f+s;
        for(int i=1; i<=n; i++){
            t = f+s;
            f  = s;
            s = t;
        }
        return t;
        // int[] dp = new int[n+1];
        // return stairs(n,dp);
    }
    private int stairs(int n, int[] dp){
         
        if(n==0) return 1;
      
        if(n<0) return 0;
        
        if(dp[n]!=0) return dp[n];
        
        int ans = stairs(n-1,dp) + stairs(n-2,dp);
        dp[n] = ans;
        return dp[n];
    }
}