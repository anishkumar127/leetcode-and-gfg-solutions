//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] cost = new int[N];
            
            for(int i=0 ; i<N ; i++)
                cost[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.minCostClimbingStairs(cost,N));
        }
    }
}
// } Driver Code Ends


//Back-end complete function Template for Java

class Solution {
    static int minCostClimbingStairs(int[] cost , int N) {
        //Write your code here
        int n = cost.length ;
        int zero = minCost(cost, 0, new int[n+1]);
        int one = minCost(cost,1, new int[n+1]);
        
        return Math.min(zero,one);
    }
    static int minCost(int[] cost , int idx , int[] dp){
        if(idx==cost.length){
            return dp[idx] = 0;
        }
        
        if(dp[idx]!=0) return dp[idx];
        
        int one  = minCost(cost,idx+1,dp);
        
        int two = Integer.MAX_VALUE;
        
        if(idx+2<=cost.length){
            two = minCost(cost,idx+2, dp);
        }
        
        int ans = cost[idx] + Math.min(one,two);
        
        return dp[idx] = ans;
    }
};