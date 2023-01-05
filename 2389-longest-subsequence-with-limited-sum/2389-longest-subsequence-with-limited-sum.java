class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        // sort 
        Arrays.sort(nums);
        
        // prefix sum.
        for(int i=1; i<nums.length; i++){
            nums[i]+=nums[i-1]; 
        }
        
        int ans [] = new int [queries.length];
        
        for(int i=0; i<queries.length; i++){
            
            int q = queries[i];
            
            // apply binary search.
            int low = 0,  high = nums.length-1;
            
            while(low <= high){
                int mid = low + (high-low)/2;
                
                if(nums[mid]==q){
                    ans[i] = mid + 1;
                    break;
                    
                }else if(nums[mid] < q){
                    
                    ans[i] = mid + 1;
                    low = mid + 1;
                    
                }else{
                    high = mid - 1;
                }
            }
            
        }
        return ans;
    }
}