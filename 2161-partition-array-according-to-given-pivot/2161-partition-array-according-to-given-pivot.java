class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int ans[] = new int[nums.length];
        
        int idx =0;
        
        // < pivot
        
        for(int v:nums){
            if(v<pivot) ans[idx++]=v; 
        }
        
        //  == pivot
        
        for(int v:nums){
            if(v==pivot) ans[idx++]=v; 
        }
        
        
        // > pivot
        for(int v:nums){
            if(v>pivot) ans[idx++]=v; 
        }

        return ans;
    }
}