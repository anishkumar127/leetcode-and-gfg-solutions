const size = arr[arr.length-1]+k;
let count =0;
for(let i = 1; i<=size; i++){
if(!map.get(i)){
count++;
}
if(count==k) return i;
}
return -1;
};
```
​
**JavaScript O(n) Tc**
​
```js
/**
* @param {number[]} arr
* @param {number} k
* @return {number}
*/
var findKthPositive = function(arr, k) {
for(const e of arr){
if(k>=e) k++;
else return k;
}
return k;
};
​
```