class Solution {
    public void reverseString(char[] s) {
        Stack<Character>cache = new Stack();
        
        for(char val:s){
            cache.push(val);
        }
        for(int i =0; i<s.length; i++){
            s[i] = cache.pop();
        }
    }
}