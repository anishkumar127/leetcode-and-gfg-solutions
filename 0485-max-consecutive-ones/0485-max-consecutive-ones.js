/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function (nums) {
  let Ones = 0;
  let count = 0;
  for (const i in nums) {
    if (nums[i] === 1) {
      count++;
    } else {
      // console.log(count);
      Ones = Math.max(count, Ones);
      count = 0;
    }
  }
  return Math.max(Ones, count);
};
