/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
var minEatingSpeed = function(piles, h) {
    let high = Math.max(...piles),
        low = 1,
        ans =0;
    
    const eatTime = (mid) => piles.reduce((sum,pile)=> sum + Math.ceil(pile/mid),0); 
    
    while(low<=high){
        
        const mid = Math.trunc(low+(high-low)/2);
    
        if(eatTime(mid)<=h){
            ans = mid;
            high = mid -1;
        }else{
            low = mid+1;
        }
    }    
    return ans;
};
