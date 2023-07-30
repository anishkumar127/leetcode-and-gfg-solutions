function singleNumber(nums: number[]): number {
 const map = new Map();
   nums.forEach((value)=>{
       const freq = (map.get(value) ?? 0 ) + 1;
       map.set(value,freq);
   })
    for(const [key,value] of map){
        // console.log([key,value]); / [2,1]
        if(value===1) return key;
    }
    return -1;
};