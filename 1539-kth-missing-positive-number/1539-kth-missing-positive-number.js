/**
 * @param {number[]} arr
 * @param {number} k
 * @return {number}
 */
var findKthPositive = function(arr, k) {
    for(const e of arr){
        if(k>=e) k++;
        else return k;
    }
    return k;
};