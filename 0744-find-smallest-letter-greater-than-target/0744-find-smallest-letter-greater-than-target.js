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
