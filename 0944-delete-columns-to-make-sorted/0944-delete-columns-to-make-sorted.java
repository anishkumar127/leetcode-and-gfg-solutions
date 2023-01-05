class Solution {
    public int minDeletionSize(String[] strs) {
        if(strs.length==0) return 0;
        
        int ans = 0;
        int len = strs[0].length(); // 3
        for(int i=0; i<len; i++){  // inside -> abc
            for(int j=1; j<strs.length; j++){ // whole string.
                if(strs[j-1].charAt(i)>strs[j].charAt(i)){
                    ans++;
                    break;
                }
            }
        }
        
        return ans;
    }
}