/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    let map = new Map();
    let count =0;
    for(num of nums){
        if(!map.has(num)){
          map.set(num,1);  
        } 
        else{
            count = count + map.get(num);
            map.set(num,map.get(num) +1);
        }
        
    }
        return count;
};
