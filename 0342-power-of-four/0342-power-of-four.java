class Solution {

    public boolean isPowerOfFour(int n) {
       if(n==1) return true;
        if(n==0) return false;
        while(n!=0){
            if(n==1) return true;
            int a=n%4;
            if(a!=0)
                return false;
            
            n=n/4;
        }
        return true;
    }
}
