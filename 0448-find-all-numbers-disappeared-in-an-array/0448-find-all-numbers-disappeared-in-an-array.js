/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function (nums) {
  const all = [];
  const map = new Map();
  for (let i in nums) {
    map.set(nums[i], (map.get(nums[i]) ?? 0) + 1);
  }
  for (let i = 1; i <= nums.length; i++) {
    // console.log(map.get(i))
    if (!map.get(i)) {
      all.push(i);
    }
  }
  return all;
};
