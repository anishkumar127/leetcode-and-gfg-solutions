class Solution {
    public boolean isPerfectSquare(int num) {
        int s =1;
        int e = num;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid*mid == num){
                return true;
            }else if(mid*mid>num){
              e = (int)mid-1;
            }else{
                s =(int) mid+1;
            }
        }
        
        return false;
    }
}