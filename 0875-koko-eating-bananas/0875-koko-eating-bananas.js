/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
var minEatingSpeed = function(piles, h) {
    let high = Math.max(...piles);
    let low = 1;
    let ans =0;
    while(low<=high){
        const mid = Math.trunc(low+(high-low)/2);
        if(eatTime(piles,mid)<=h){
            ans = mid;
            high = mid -1;
        }else{
            low = mid+1;
        }
    }    
    return ans;
};

function eatTime(piles,bph){
    let time = 0;
    for(let p of piles){
        time += Math.trunc(Math.ceil(1.0 * p / bph));
    }
    return time;
}