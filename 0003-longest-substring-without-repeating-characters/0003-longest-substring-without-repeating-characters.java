class Solution {
    public int lengthOfLongestSubstring(String str) {
        List<Character> ans = new ArrayList<>();
        int s= 0;
        int e = 0;
        int n = str.length();
        int max =0;
        while(e<=n-1){
            if(!ans.contains(str.charAt(e))){
                ans.add(str.charAt(e));
                max = Math.max(max,ans.size());
                e++;
            }else{
               ans.remove(Character.valueOf(str.charAt(s)));                    
                s++;
            }
            
        }
        return max ;
    }
}