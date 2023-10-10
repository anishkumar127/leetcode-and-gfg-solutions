```Javascript
/**
* @param {character[]} letters
* @param {character} target
* @return {character}
*/
var nextGreatestLetter = function (letters, target) {
return letters.find((item) => item > target)
? letters.find((item) => item > target)
: letters[0];
};
​
```
​
```Java
class Solution {
​
public char nextGreatestLetter(char[] letters, char target) {
for (int i = 0; i < letters.length; i++) {
if (letters[i] > target) {
return letters[i];
}
}
​
// for(char ch:letters){
//     if(ch >target){
//         return ch;
//     }
// }
return letters[0];
}
}