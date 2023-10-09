class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e  = n-1 ;
        while(s<=e){
            int mid = s +(e-s)/2;
            System.out.println(mid);
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
}