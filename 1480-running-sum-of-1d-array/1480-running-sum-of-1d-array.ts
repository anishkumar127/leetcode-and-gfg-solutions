function runningSum(nums: number[]): number[] {

    let arr:number[] = [];
    let sum:number = 0;
    let idx:number = 0;
    for(let val of nums){
        sum+=val;
        arr[idx++] = sum;
    }
    return arr;
};