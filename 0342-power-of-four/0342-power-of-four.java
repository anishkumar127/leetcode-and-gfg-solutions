class Solution {

    public boolean isPowerOfFour(int n) {
        if(n == (Integer.MAX_VALUE)) return false;
        if(n==1)
            return true;

        for (int i = 1; i <= n; i++) {
             int val = (int) Math.pow(4,i);
            if (val == n) {
                return true;
            }
            if(val>n)
                break;
        }
        return false;
    }
}
