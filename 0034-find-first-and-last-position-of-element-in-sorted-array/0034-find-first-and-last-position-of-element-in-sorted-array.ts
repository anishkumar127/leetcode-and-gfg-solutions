function searchRange(nums: number[], target: number): number[] {
 let arr = [];
    let s = nums.indexOf(target);
    let e = nums.lastIndexOf(target);
    arr.push(s);
    arr.push(e);
    return arr;
};