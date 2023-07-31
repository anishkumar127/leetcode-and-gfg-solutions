function findMaxConsecutiveOnes(nums: number[]): number {
  let Ones: number = 0;
  let count: number = 0;
  for (const i in nums) {
    if (nums[i] === 1) {
      count++;
    } else {
      Ones = Math.max(count, Ones);
      count = 0;
    }
  }
  return Math.max(Ones, count);
}
