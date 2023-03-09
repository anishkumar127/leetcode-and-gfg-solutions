/**
 * @param {number[]} arr
 * @param {number} k
 * @return {number}
 */
var findKthPositive = function(arr, k) {
    let s =0 , e  = arr.length-1, mid = 0;
    
    while(s<=e){
        mid = Math.floor(s+(e-s)/2);
        if(arr[mid]-1-mid<k) s = mid + 1;
        else e = mid-1;
    }
    return s+k;
};