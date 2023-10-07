class Solution {
    private final int MOD = 1000000007;
    private int solve(int n, int m, int k, int max, int index, int searchCost, Integer[][][] dp) {
        if(index == n) {
            if(searchCost == k)
                return 1;
            return 0;
        }
        if(dp[max][index][searchCost] != null) return dp[max][index][searchCost];
        int result = 0;
        for(int i = 1; i <= m; i++) {
            if(max < i)
                result = result%MOD + (solve(n, m, k, i, index+1, searchCost+1, dp) % MOD);
            else
                result = result%MOD + (solve(n, m, k, max, index+1, searchCost, dp) % MOD);
        }

        return dp[max][index][searchCost] = (result%MOD);       
    }
    public int numOfArrays(int n, int m, int k) {
        Integer[][][] dp = new Integer[101][51][51];
        return solve(n, m, k, 0, 0, 0, dp);
    }
}