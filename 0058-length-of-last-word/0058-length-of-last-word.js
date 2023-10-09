/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function (s) {
  const word = s.trim();
  let ans = "";
  for (let i = word.length - 1; i >= 0; i--) {
    //console.log(word[i]);
    if (word[i] !== " ") ans += word[i];
    else break;
  }

  //(ans = ans.split("").reverse().join(""));
  return ans.length;
};
