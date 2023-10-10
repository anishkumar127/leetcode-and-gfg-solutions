class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return Smallest(letters,target);
    }
    public static char Smallest(char[] l, char t){
        int s =0;
        int e =l.length-1;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(l[m]>t){
                ans = m;
                e= m-1;
            }else{
                s = m+1;
            }
        }
        return  ans == -1 ? l[0] : l[ans];
    }
}