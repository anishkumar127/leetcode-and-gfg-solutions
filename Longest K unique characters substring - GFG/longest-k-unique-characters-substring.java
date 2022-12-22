//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int n = s.length();
        HashMap<Character,Integer>map = new HashMap<>();
		int low =0;
		int high =0;
		int max =-1;
		while(high<=n){
			if(map.size()==k){
				max = Math.max(max,count(map));
				if(high==n){
				    break;
				    }
				char ch = s.charAt(high);
				map.put(ch,map.getOrDefault(ch,0)+1);
				high++;
			}else if(map.size()<k){
			    	if(high==n){
				    break;
				    }
			char ch = s.charAt(high);
				map.put(ch,map.getOrDefault(ch,0)+1);	
				high++;
			}else{
				char ch = s.charAt(low);
				if(map.get(ch)==1){
					map.remove(ch);
				}else{
					map.put(ch,map.getOrDefault(ch,0)-1);
				}
				low++;
			}
		}
		return max;
    }
    private  int count(HashMap<Character,Integer>map){
		int sum =0;
		for(int val:map.values()){
			sum+=val;
		}
		return sum;
	}
}