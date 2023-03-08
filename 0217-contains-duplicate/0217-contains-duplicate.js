var containsDuplicate = function(nums) {
    var obj = {};
    
    for(var i = 0; i < nums.length; i++){
        obj[nums[i]] = obj[nums[i]] + 1 || 1;
        
        if(obj[nums[i]] > 1) return true;
    }
    
    return false;
};