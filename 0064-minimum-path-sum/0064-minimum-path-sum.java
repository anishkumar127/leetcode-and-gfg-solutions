class Solution {
    private static int pathSum(int[][] m , int i, int j, int [][]dp){
        if(i>=m.length || j>=m[0].length) return Integer.MAX_VALUE;

        if(i==m.length-1 && j==m[0].length-1) return m[i][j];

        if(dp[i][j]!=-1) return dp[i][j];

        int right = pathSum(m,i,j+1,dp); 
        int down = pathSum(m,i+1,j,dp); 
        return dp[i][j] =  Math.min(right,down) + m[i][j];
    }
    public int minPathSum(int[][] input) {
        int[][] dp = new int[input.length+1][input[0].length+1];
        for(int[] val:dp){
            Arrays.fill(val,-1);
        }
        return pathSum(input, 0, 0,dp);
    }
}