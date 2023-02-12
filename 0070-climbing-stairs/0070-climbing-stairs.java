class Solution {
    public int climbStairs(int n) {
       
        int f = 0;
        int s = 1;
        int t = f+s;
        for(int i=1; i<=n; i++){
            t = f+s;
            f  = s;
            s = t;
        }
        return t;
    }

}