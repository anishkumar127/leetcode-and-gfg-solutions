/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function(num1, num2) {
    let i = num1.length-1;
    let j = num2.length-1;
    let carry = 0;
    let ans ="";
    while(i>=0 || j>=0){
        let sum = carry;
        
        if(i>=0) sum+=num1[i--]-'0';
        if(j>=0) sum+=num2[j--]-'0';
        
        carry = Math.trunc(sum/10);
        ans += sum%10;
    }
    if(carry!=0) ans+=carry;
    
    return ans.split('').reverse().join('');;
};