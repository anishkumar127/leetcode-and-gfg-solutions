function singleNumber(nums: number[]): number {
   return nums.reduce((prev,currValue)=> prev^currValue,0);
}
