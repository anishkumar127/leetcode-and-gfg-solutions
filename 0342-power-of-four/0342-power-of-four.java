class Solution {

    public boolean isPowerOfFour(int n) {
        if(n == (Integer.MAX_VALUE)) return false;
        int store = 4;
        if(n==1)
            return true;

        for (int i = 1; i <= n; i++) {
             int val = (int) Math.pow(store,i);
            if (val == n) {
                return true;
            }
            if(val>n)
                break;
        }
        return false;
//         while(n!=0){
//             int a=n%4;
//             if(a!=0)
//                 return false;
            
            
//             n=n/4;
//         }
//         return true;
    }
}
