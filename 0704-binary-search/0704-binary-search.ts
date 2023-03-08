function search(nums: number[], target: number): number {
  let low: number =0;
    let high: number =nums.length-1;
    while(low<=high){
        const mid: number = Math.floor( (low+(high-low)/2));
        console.log(mid);
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) high = mid-1;
        else low = mid+1;
    }
    return -1;
};