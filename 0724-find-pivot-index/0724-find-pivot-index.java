class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int e:nums) sum+=e;
        int ans =0;
        for(int i=0; i<nums.length; i++){
            if(ans == sum - nums[i]-ans) return i;
            ans+=nums[i];
        }
        
        return -1;
    }
}