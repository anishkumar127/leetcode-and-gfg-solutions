class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        
        int s=0;
        int e=n-1;
        int num = 1;
        
        while(s<e){
            ans[s++] = num;
            ans[e--]= -num;
            num++;
        }
        
        return ans;
    }
}

/*
even case its ok.
odd case we need to  go till s<e  because middle value will be 0; in java by default array contains 0;

*/