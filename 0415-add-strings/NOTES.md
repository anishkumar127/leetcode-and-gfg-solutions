```
/**
* @param {string} num1
* @param {string} num2
* @return {string}
*/
var addStrings = function(num1, num2) {
let ans = [];
let i=num1.length-1;
let j = num2.length-1;
let carry =0;
while(i>=0 || j>=0){
let sum = carry;
if(i-->=0) sum+=Math.trunc(num1[i]);
if(j-->=0) sum+=Math.trunc(num2[j]);
ans.push(Math.trunc(sum%10));
carry= Math.trunc(sum/10);
}
if(carry!=0) ans.push(carry);
return ans.reverse();
};
```