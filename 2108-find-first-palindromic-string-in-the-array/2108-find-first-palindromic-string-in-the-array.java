class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String word:words){
            
            int s = 0;
            int e = word.length()-1;
            boolean isTrue = true;
            while(s<e){
                if(word.charAt(s)!=word.charAt(e)){
                    isTrue = false;
                    break;
                }
                s++;
                e--;
            }
            if(isTrue) return word;
        }
        
        return "";
    }
}