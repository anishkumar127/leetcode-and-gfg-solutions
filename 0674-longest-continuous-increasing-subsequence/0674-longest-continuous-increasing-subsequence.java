class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count =1;
        int maxCount =0;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                count++;
            }else{
                maxCount = Math.max(maxCount,count);
                count=1;
            }
        }
        
        return Math.max(maxCount,count);
    }
}