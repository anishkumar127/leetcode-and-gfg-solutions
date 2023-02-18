/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    let sum =0;
    let arr = [];
    for(let i =0; i<nums.length; i++){
        // let x  = nums.splice(i);
        sum+=nums[i];
        arr[i] = sum;
    }
    // A.splice(0, A.length);
    nums.length = 0;
    return arr;
};