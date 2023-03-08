var containsDuplicate = function(nums) {
    var obj = {};
    
    for(var i = 0; i < nums.length; i++){
        obj[nums[i]] = obj[nums[i]] + 1 || 1;
        if(obj[nums[i]] > 1) return true;
    }
    return false;
};

// obj keeps track of the occurrences of each num in nums. As we loop through nums, we record its frequency.

// If we've already recorded the frequency of num[i] before, then the frequency will simply be incremented by one.
// If we have not recorded the frequency of nums[i] before, then undefined + 1 will be NaN. Then it becomes NaN || 1 which should evaluate to 1.

// If at any point the frequency recorded for nums[i] is greater than 1, we return true.