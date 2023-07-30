/**
 * @param {number[]} nums
 * @return {number[]}
 */
var singleNumber = function (nums) {
  const map = new Map();
  for (const i in nums) {
    map.set(nums[i], (map.get(nums[i]) ?? 0) + 1);
  }
  let arr = [];
  for (const [key, value] of map) {
    if (value === 1) {
      arr.push(key);
    }
  }
  return arr;
};
