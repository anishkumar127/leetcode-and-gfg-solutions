//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int N, int Matrix[][])
    {
        // code here
        int n = N;
        int ans = 0;
        int dp[][] = new int[N][N];
        // Arrays.fill(dp,-1);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = -1;
            }
        }
        for(int i=0; i<Matrix[0].length; i++){
            ans = Math.max(ans,maxSum(0,i,Matrix,Matrix.length,Matrix[0].length,dp));
        }
      return ans;
    }
    public static int maxSum(int i, int j, int[][] matrix, int n, int m, int dp[][]){
        if(i>=n || j>=m || i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(i==n-1){
            return matrix[i][j];
        }

        // right direction
        int a = maxSum(i+1, j+1, matrix, n, m, dp);

        int c = maxSum(i+1,j-1,matrix,n,m, dp);
        
        // downwards direction
        int b = maxSum(i+1, j, matrix, n, m,dp);

        int ans = Math.max(a,Math.max(b,c)) + matrix[i][j];
        
        return    dp[i][j] = ans ;
    }
}