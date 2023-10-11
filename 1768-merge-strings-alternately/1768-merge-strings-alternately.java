class Solution {
    public String mergeAlternately(String word1, String word2) {
//         StringBuilder sb = new StringBuilder();
        
//         for(int i=0; i<word1.length() || i<word2.length(); i++){
//             if(i<word1.length()) sb.append(word1.charAt(i));
//             if(i<word2.length()) sb.append(word2.charAt(i));
//         }
//         return sb.toString();
    int n;
    String ans="";
    if(word1.length()>word2.length())
            n=word1.length();
    else
        n=word2.length();
    for(int i=0;i<n;i++){
        if(i<word1.length())
        ans+=word1.charAt(i);
        if(i<word2.length())
            ans += word2.charAt(i);
    }
        return ans;
        
    }
}