class Solution {
    public int[] getConcatenation(int[] nums) {
        int output[] = new int[2*nums.length];
      
        for(int i=0; i<nums.length; i++){
            output[i] = output[i+nums.length] = nums[i];
        }
        
        return output;
    }
}
/*
Input: nums = [1,2,1]
output[i] 0 index 1 
1 index 2 
2 index 1.

i = 0  0+3 = index 3 is 1;
i=1  1+4 = index 4 is 2;
i= 2 = 2+4 index 6 is 1

so its do simultaneously.
*/