function singleNumber(nums: number[]): number[] {
  const map = new Map<number, number>();
  for (const i in nums) {
    map.set(nums[i], (map.get(nums[i]) ?? 0) + 1);
  }
  const ans: number[] = [];
  for (const [key, value] of map.entries()) {
    if (value === 1) ans.push(key);
  }
  return ans;
}
