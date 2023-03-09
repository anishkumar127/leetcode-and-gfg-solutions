/**
 * @param {number[]} arr
 * @param {number} k
 * @return {number}
 */
var findKthPositive = function(arr, k) {
    const map = new Map();
    for(const e of arr){
        map.set(e,true);
    }
    const size = arr[arr.length-1]+k;
    let count =0;
    for(let i = 1; i<=size; i++){
        if(!map.get(i)){
            count++;
        }
        
        if(count==k) return i;
    }
    return -1;
};