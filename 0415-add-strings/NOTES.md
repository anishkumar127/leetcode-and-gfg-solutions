int sum = x + carry;
carry = sum/10;
ans.append(sum%10);
i--;
}
while(j>=0){
int y = num2.charAt(j)-'0';
int sum =  y + carry;
carry = sum/10;
ans.append(sum%10);
j--;
}
if(carry!=0) ans.append(carry);
return ans.reverse().toString();
}
}
​
```
​
**Not working
```
/**
* @param {string} num1
* @param {string} num2
* @return {string}
*/
var addStrings = function(num1, num2) {
let ans = [];