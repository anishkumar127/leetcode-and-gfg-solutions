/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
  const map = new Map();
  for (const i in nums) {
    map.set(nums[i], (map.get(nums[i]) ?? 0) + 1);
  }
  // console.log(map);
  for (const [key, value] of map) {
    if (value === 1) return key;
  }
  return -1;
};
