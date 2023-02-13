class Solution {
    public boolean isPalindrome(String s) {
        
       int low = 0;
        int high = s.length()-1;
        
        while(low<=high){
            char c1 = s.charAt(low);
            char c2 = s.charAt(high);
            if(!Character.isLetterOrDigit(c1)) low++;
            else if(!Character.isLetterOrDigit(c2)) high--;
            else{
                if(Character.toLowerCase(c1)!=Character.toLowerCase(c2)) return false;
            low++;
            high--;
            }
        }
        
        return true;
    }
}