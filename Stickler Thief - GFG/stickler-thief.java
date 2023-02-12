//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp = new int[n+1];
        // Arrays.fill(arr,-1);
        return findMax(0,arr,dp);
    }
    private int findMax(int idx , int [] arr,int[] dp){
        if(idx == arr.length){
        return dp[idx] = 0;
        }
        if(dp[idx]!=0) return dp[idx];
        int rob = arr[idx];
        int notRob = 0;
        
        if(idx+2 <= arr.length)
            rob+=findMax(idx+2,arr,dp);
            
            notRob+=findMax(idx+1,arr,dp);
            
        int ans = Math.max(rob,notRob);
        
        return dp[idx] = ans;
        
    }
}