class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
		  int[] dp = new int[n+1];
		Arrays.fill(dp,-1);
        return RobberMemo(nums,0,dp);
    }
     private static int RobberMemo(int[] arr, int idx, int[] dp){
        if(idx==arr.length){
            return dp[idx] = 0;
        }
        int take = arr[idx];
        int notTake = 0;
        if(dp[idx]!=-1) return dp[idx];
        if(idx+2<=arr.length){
            take+=RobberMemo(arr,idx+2,dp);
        }
        notTake+= RobberMemo(arr,idx+1,dp);
        int ans = Math.max(take,notTake);
        return dp[idx] = ans;
    }
}