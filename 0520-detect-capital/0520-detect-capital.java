class Solution {
    public boolean detectCapitalUse(String word) {
        int capital  = 0;
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                capital++;
            }
        }
        
        return capital == word.length() || capital == 0 ||(capital==1 &&  Character.isUpperCase(word.charAt(0)));
    }
}