class Solution {
    public void moveZeroes(int[] nums) {
        int idx=0;
        for(int val:nums){
            if(val!=0){
                nums[idx++]=val;
            }
        }  
        while(idx<nums.length){  
            nums[idx++]=0;
        }
    }
}