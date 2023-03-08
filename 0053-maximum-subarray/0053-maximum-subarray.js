/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let sum =0;
    let max =  Number.NEGATIVE_INFINITY;
    
    for(let value of nums){
        sum +=value;
        max= Math.max(max, sum);
        if(sum<0) sum = 0;
    }
    return max;
};