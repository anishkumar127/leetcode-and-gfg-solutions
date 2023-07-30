function singleNumber(nums: number[]): number {
  let xor: number = 0;
  for (const i in nums) {
    xor ^= nums[i];
  }
  return xor;
}
