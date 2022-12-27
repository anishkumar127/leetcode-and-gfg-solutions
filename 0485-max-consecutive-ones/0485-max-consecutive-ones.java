class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes =0;
        int tempOnes =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                tempOnes++;
            }else{
                maxOnes = Math.max(tempOnes,maxOnes);
                tempOnes =0;
            }
        }
        
        return Math.max(tempOnes,maxOnes);
    }
}
/*
so in that what we are doing.
create varialbe
max or temp.

run loop till length;
and then if nums contains 1 then temp increase by 1.  till increase not get non 1 elemet.
when get another element then we come to else part and over the else part 
we check which is max and store max count in max variable.
and then again assign temp varialbe to 0 because its now going to again count 1.

and one edge case over here. 
in the case our loop break and we not able to come into else part.
then we again need to check what value stored into the temp variable and then get max into him and then return it max.
*/