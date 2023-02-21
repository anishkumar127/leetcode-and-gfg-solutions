//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int t) 
    {
        int s =0;
        int e = 0;
        int sum =0;
        ArrayList<Integer> ans = new ArrayList<>();
        if(t==0) {
             ans.add(-1);
             return ans;
         }
        while(e<=n){
            //   System.out.print(sum);
            if(sum==t){
                ans.add(s+1);
                ans.add(e);
                return ans;
            }
            else if(sum<t){
              if(e==n) break;
                sum+=arr[e];
                e++;
            }
            else if(sum>t){
                if(s==n) break;
                sum-=arr[s];
                s++;
            }
        }
        if(ans.isEmpty()) ans.add(-1);
        return ans;
    }
}