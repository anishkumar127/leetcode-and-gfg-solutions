class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                s=mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }
}