class Solution {
    private int memo(int[] arr, int idx , int sum,int[][] dp){
        if(sum==0) return 0; // bcz make zero sum 0 coin used.

        if(sum< 0 || idx==arr.length) return (int) 1e5; // bcz we found minimum so we take max value;
        if(dp[idx][sum]!=-1) return dp[idx][sum];
        int stay = memo(arr,idx , sum-arr[idx],dp)+1; // +1 because 1 coin used.
        int move = memo(arr,idx+1,sum,dp); // no coin used.

        return dp[idx][sum] = Math.min(stay,move); // minimum coin used which part.
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length+1][amount+1];
        for(int[]arr:dp) Arrays.fill(arr,-1);
        int ans = memo(coins,0,amount,dp);
       return ans == (int)1e5 ? -1 : ans; 
    }
}