class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = Arrays.stream(piles).max().getAsInt();
        int low = 1; 
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2; // k
            if(eatTime(piles,mid)<=h){
                ans = mid;
                high = mid -1 ; // look for better answer.
            }else{
                low = mid+1;
            }
        }
        
        return ans;
    }
    private long eatTime(int [] piles , int bph){
        long time =0;
        for(int p :piles){
            time += (int) Math.ceil(1.0 * p / bph);
        }
        return time;
    }
}