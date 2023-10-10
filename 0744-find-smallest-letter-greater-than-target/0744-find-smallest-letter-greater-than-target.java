class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }

        // for(char ch:letters){
        //     if(ch >target){
        //         return ch;
        //     }
        // }
        return letters[0];
    }
}
