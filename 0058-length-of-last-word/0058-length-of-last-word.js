/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    s = s.trim();
    let count =0;
    for(let i=s.length-1; i>=0; i--){
        if(s.charAt(i)!==' ')
            count++;
        else break;
    }
    return count;
};