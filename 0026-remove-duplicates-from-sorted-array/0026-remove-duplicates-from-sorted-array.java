class Solution {
    public int removeDuplicates(int[] nums) {
        int idx =0;
        if(nums.length ==0) return 0;
        
        for(int i =0; i<nums.length; i++){
            if(nums[i]!=nums[idx]){
                idx++;
                nums[idx] = nums[i];
            }
        }
        // System.out.print(Arrays.toString(nums));
        return ++idx;
    }
}