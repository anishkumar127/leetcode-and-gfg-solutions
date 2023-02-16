/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(str) {
    let arr = [];
    
    let s = 0;
    let e = 0;
    let n = str.length-1;
    let max = 0;
    while(e<=n){
        
        if(!arr.includes(str[e])){
           arr.push(str.charAt(e));
           max = Math.max(arr.length,max);
           e++;
        }else{
            // console.log(arr.length);
               arr.shift();
            // console.log(arr.length);
               s++;
        }   
    }
    // console.log(arr);
        return max;
};