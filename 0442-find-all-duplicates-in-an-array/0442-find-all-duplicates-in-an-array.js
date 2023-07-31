/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function (nums) {
  const arr = [];
  const set = new Set();
  for (const i in nums) {
    if (set.has(nums[i])) {
      arr.push(nums[i]);
    } else {
      set.add(nums[i]);
    }
  }
  return arr;
};
