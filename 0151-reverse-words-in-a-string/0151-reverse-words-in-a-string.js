/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    const arr = s.trim().split(/\s+/); // trim extra space and split into array.
    
    // create new array.
    const ans = [] ;
    
    for(let i=arr.length-1; i>=0; i--){
        if(arr[i]!= ' '){
            ans.push(arr[i]);
        }
    }
    
    return ans.join(" ");
};