function searchInsert(nums: number[], target: number): number {
  let s = 0;
  let e = nums.length - 1;
  while (s <= e) {
    const mid = Math.floor(s + (e - s) / 2);
    if (nums[mid] === target) {
      return mid;
    } else if (nums[mid] > target) {
      e = mid - 1;
    } else {
      s = mid + 1;
    }
  }
  return s;
}
