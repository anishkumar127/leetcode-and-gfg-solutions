//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int [][] dp = new int[n+1][m+1];
        for(int arr[] :dp){
            Arrays.fill(arr,-1);
        }
        
        int ans = 0;
        for(int i=0; i<n; i++){
            ans = Math.max(maxGoldMemo(i,0,n,m,M,dp),ans);
        }
        return ans;
    }
    private static int maxGoldMemo(int i, int j,int n, int m, int[][]M, int[][]dp){
        if(i<0 || i>=n || j<0 || j>=m) return 0;
        
        if(j==m-1) return M[i][j];
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int upRight = maxGoldMemo(i-1,j+1,n,m,M,dp);
        int right = maxGoldMemo(i,j+1,n,m,M,dp);
        int downRight = maxGoldMemo(i+1,j+1,n,m,M,dp);
        
        return dp[i][j] = Math.max(upRight,Math.max(right,downRight))+M[i][j];
    }
}