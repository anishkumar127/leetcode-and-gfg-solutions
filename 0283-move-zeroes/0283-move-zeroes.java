class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
         
 int s=0;
        int e = 1;
        
        while(e<nums.length){
            if(nums[s] !=0 && nums[e] != 0){
                e++;
                s++;
            }
            else if(nums[s] ==0 && nums[e] == 0){
                e++;
            }
            else if(nums[s] ==0 && nums[e] != 0){
                int temp= nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                e++;
                s++;
            }
            else if(nums[s] !=0 && nums[e] == 0){
                s++;
            }
            else{
                e++;
            }
        }
        
    }
}