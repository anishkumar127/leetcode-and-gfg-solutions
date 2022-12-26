class Solution {
public:
    int mySqrt(int x) {
        int s =0;
        int e =x;
        int ans =0;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid*mid == x){
                return (int) mid;
            }else if (mid*mid<x){
                ans = (int)mid;
                s = (int) mid+1;
            }else{
                e = (int) mid-1;
            }
        }
        
        return ans;
    }
};