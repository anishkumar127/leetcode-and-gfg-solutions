/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
  let xor = 0;
  for (const i in nums) {
    xor ^= nums[i];
  }
  return xor;
};
