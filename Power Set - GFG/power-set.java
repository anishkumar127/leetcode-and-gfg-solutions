//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        ArrayList<String> ans = new ArrayList<>();
       subsets(s,"",0,ans);
      Collections.sort(ans);
       return ans;
    }
    private void subsets(String s , String val, int idx , ArrayList<String> ans){
        if(idx == s.length()){
            if(val!=""){
            ans.add(val);
            }
            return ;
        }
        subsets(s,val+s.charAt(idx),idx+1,ans);
        subsets(s,val,idx+1,ans);
    }
}