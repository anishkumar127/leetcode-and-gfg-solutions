class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length() - needle.length()+1; i++){  // 9-3+1 = 7; 
            
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
            
        }
        return -1;
    }
}

/*

haystack.length() - needle.length() + 1; // why ? because sad start from s. and if s in the end of the length of haystack. then how we can get the substring ? its give the error out of bound.

so we run till the haystack length and - needle length + 1.


and now inside for loop we will check if haystack character match the first character of the needle.
then we check the complete sentence of the needle using substring method. and we apply the substring method inside the haystack.
and if it is equal then return the index.
else not equal we check till the length. in the end we return the -1 as given the question requirements.

*/