/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const map = new Map();
    for (let i = 0; i < nums.length; i++) {
	if (map.has(nums[i])) {
		return true;
	}

    // console.log(map.has(nums[i]));
	map.set(nums[i]);
}
    return false;
};