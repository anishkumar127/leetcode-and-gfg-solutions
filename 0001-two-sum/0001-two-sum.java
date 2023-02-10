class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        for(int i=0; i<n; i++){
            
            for(int j = i+1; j<n; j++ ){
                
                int sum = nums[i] + nums[j];
                if(sum==target){
                    return new int [] {i,j};
                }
            }
        }
        return new int [] {-1,-1};
    }
}