/**
 * @param {number[]} num
 * @param {number} k
 * @return {number[]}
 */
var addToArrayForm = function(num, k) {
    let ans = [];
    
    let carry = 0;
    let i = num.length-1;
    
    let s = k.toString();
    let j = s.length-1;
    
    while(i>=0 || j>=0){
        let sum = carry;
        
        if(i>=0){
            sum+=num[i];
            i--;
        }
        if(j>=0){
            // sum+=s[j]-'0';
            sum+=Math.trunc(s[j]);
            // sum+=  s.charAt(j)-'0'; // importent! in javascript otherwise output wrong.
            j--;
        }
        carry = Math.trunc(sum/10);  // Math.trunc() importent! otherwise JS convert to float 
        ans.push(sum%10);
    }
    // if carry left
    
    if(carry!==0) {
        console.log(carry);
        ans.push(carry);
    }
    ans.reverse();
    
    return ans;
};