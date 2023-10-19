class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            if(arr[nums[i]] == -1)
                return nums[i];
            arr[nums[i]] = -1;
            
        }
        // for(int i=0; i<n; i++){
        //     if(arr[i]>1){
        //         return i;
        //     }
        // }
        return -1;
    }
}