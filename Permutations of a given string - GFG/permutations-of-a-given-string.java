//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        ArrayList<String> ans = new ArrayList<>();
        allPermutation(S,"",ans);
        TreeSet<String> set = new TreeSet<>(ans);
        ans.clear();
        ans.addAll(set);
        return ans;
    }
    private void allPermutation(String s, String helpString, ArrayList<String>ans){
        if(s.length()==0){
            ans.add(helpString);
            return;
        }
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            String newStr = s.substring(0,i) + s.substring(i+1);
            allPermutation(newStr,helpString+curr,ans);
        }
    }
}